grammar dc ;

{- bpp is a "better" pretty print attribute that avoids unneccessary
   use of parenthesis by passing down contextual information to child
   operands so that they can determine if they need to wrap themselves
   in parenthesis or not.  
-}
synthesized attribute bpp::String occurs on Root, Expr ;


{-  Assocativity and Precedence of operators
     Ops             		Precedence     Associativity

     ||				1	       left
     &&				2	       left
     ==, !=			3	       left
     <, <=, >, >=		4	       left
     +, -			5              left
     *, /           		6              left
     ^              		7              right
     !				8	       right

     Note that operators of the same precedence have the same
     associativity.
 -}

inherited attribute enclosingOpPrecedence :: Integer occurs on Expr ;
{- The "root" productions sends down a precedence of 0.  This is
   lower than any other operator to avoid wrapping children in parens.
-}

inherited attribute leftOrRight :: String occurs on Expr ;
{- the position of the tree under a binary operator, "left" or
   "right".  Otherwise "none".   
-}

function wrapInParens
Boolean ::= enclosingPrecedence::Integer thisPrecedence::Integer
            thisPosition::String opAssociativity::String
{
 return enclosingPrecedence > thisPrecedence ||
       (enclosingPrecedence == thisPrecedence &&
        thisPosition != opAssociativity) ;
}

aspect production root
r::Root ::= e::Expr
{
  r.bpp = e.bpp ;
  e.enclosingOpPrecedence = 0 ; -- lower than anything else
  e.leftOrRight = "none" ; {- does not matter since higher precedence prevents
                              wrapping without considering associativity -}
}

aspect production orOp
or::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 1;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 or.bpp = if wrapInParens ( or.enclosingOpPrecedence, ourPrecedence,
                             or.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " || " ++ r.bpp ++ ")" 
           else l.bpp ++ " || " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production andOp
and::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 2;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 and.bpp = if wrapInParens ( and.enclosingOpPrecedence, ourPrecedence,
                             and.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " && " ++ r.bpp ++ ")" 
           else l.bpp ++ " && " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}


aspect production notOp
not::Expr ::= e::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 8;
 
 local attribute ourAssociation :: String;
 ourAssociation = "right";

 not.bpp = if wrapInParens ( not.enclosingOpPrecedence, ourPrecedence,
                             not.leftOrRight, ourAssociation )
           then "(! " ++ e.bpp ++ ")" 
           else "! " ++ e.bpp;

 e.enclosingOpPrecedence = ourPrecedence ;
 e.leftOrRight = "right" ;
}

aspect production equalTo
eq::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 3;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 eq.bpp = if wrapInParens ( eq.enclosingOpPrecedence, ourPrecedence,
                             eq.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " == " ++ r.bpp ++ ")" 
           else l.bpp ++ " == " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production notEqualTo
ne::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 3;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 ne.bpp = if wrapInParens ( ne.enclosingOpPrecedence, ourPrecedence,
                             ne.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " != " ++ r.bpp ++ ")" 
           else l.bpp ++ " != " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production lessThan
less::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 4;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 less.bpp = if wrapInParens ( less.enclosingOpPrecedence, ourPrecedence,
                             less.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " < " ++ r.bpp ++ ")" 
           else l.bpp ++ " < " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production lessThanOrEqualTo
le::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 4;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 le.bpp = if wrapInParens ( le.enclosingOpPrecedence, ourPrecedence,
                             le.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " <= " ++ r.bpp ++ ")" 
           else l.bpp ++ " <= " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production greaterThan
greater::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 4;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 greater.bpp = if wrapInParens ( greater.enclosingOpPrecedence, ourPrecedence,
                             greater.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " > " ++ r.bpp ++ ")" 
           else l.bpp ++ " > " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production greaterThanOrEqualTo
ge::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 4;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 ge.bpp = if wrapInParens ( ge.enclosingOpPrecedence, ourPrecedence,
                             ge.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " >= " ++ r.bpp ++ ")" 
           else l.bpp ++ " >= " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production add
sum::Expr ::= l::Expr r::Expr
{
 sum.bpp = if wrapInParens ( sum.enclosingOpPrecedence, 1,
                             sum.leftOrRight, "left" )
           then "(" ++ l.bpp ++ " + " ++ r.bpp ++ ")" 
           else l.bpp ++ " + " ++ r.bpp ;

 l.enclosingOpPrecedence = 5 ;
 r.enclosingOpPrecedence = 5 ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production sub
dff::Expr ::= l::Expr r::Expr
{
 dff.bpp = if wrapInParens ( dff.enclosingOpPrecedence, 1,
                             dff.leftOrRight, "left" )
           then "(" ++ l.bpp ++ " - " ++ r.bpp ++ ")" 
           else l.bpp ++ " - " ++ r.bpp ;

 l.enclosingOpPrecedence = 5 ;
 r.enclosingOpPrecedence = 5 ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production mul
prd::Expr ::= l::Expr r::Expr
{
 prd.bpp = if wrapInParens ( prd.enclosingOpPrecedence, 2,
                             prd.leftOrRight, "left" )
           then "(" ++ l.bpp ++ " * " ++ r.bpp ++ ")" 
           else l.bpp ++ " * " ++ r.bpp ;

 l.enclosingOpPrecedence = 6 ;
 r.enclosingOpPrecedence = 6 ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production div
quo::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 6;
 
 local attribute ourAssociation :: String;
 ourAssociation = "left";

 quo.bpp = if wrapInParens ( quo.enclosingOpPrecedence, ourPrecedence,
                             quo.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " / " ++ r.bpp ++ ")" 
           else l.bpp ++ " / " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production pow
exp::Expr ::= l::Expr r::Expr
{
 local attribute ourPrecedence :: Integer;
 ourPrecedence = 7;
 
 local attribute ourAssociation :: String;
 ourAssociation = "right";

 exp.bpp = if wrapInParens ( exp.enclosingOpPrecedence, ourPrecedence,
                             exp.leftOrRight, ourAssociation )
           then "(" ++ l.bpp ++ " ^ " ++ r.bpp ++ ")" 
           else l.bpp ++ " ^ " ++ r.bpp ;

 l.enclosingOpPrecedence = ourPrecedence ;
 r.enclosingOpPrecedence = ourPrecedence ;
 l.leftOrRight = "left" ;
 r.leftOrRight = "right" ;
}

aspect production integerConstant
e::Expr ::= i::IntLit_t
{
 e.bpp = i.lexeme ;
}
