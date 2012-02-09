grammar dc ;

{- The abstract syntax is defined here.  Defining abstract syntax is
   not required in Silver since attributes can decorate the concrete
   syntax as well.  But in many cases, especially when the concrete
   syntax is complicated by parsing requirements, it is useful to do
   so.  -}

nonterminal Root;

{- The "pretty print" of a tree. Should parse to the "same" tree. -}
synthesized attribute pp :: String;

attribute pp occurs on Root;

-- Attribute declarations and occurs on declrations can be combined.
-- This attribute will compute the value of the expresssion.
synthesized attribute value :: Integer occurs on Root;

-- Productions with the 'abstract' modifier are not used by the parser
-- generator.
abstract production root
r::Root ::= e::Expr
{
  r.pp = e.pp ;
  r.value = e.value ;
}

function toInteger
Integer ::= b::Boolean
{
  return if b then 1 else 0;
}

nonterminal Expr with pp, value;

abstract production lessThan
less::Expr ::= l::Expr r::Expr
{
  less.pp = "(" ++ l.pp ++ " < " ++ r.pp ++ ")";
  less.value = toInteger(l.value < r.value);
}

abstract production lessThanOrEqualTo
le::Expr ::= l::Expr r::Expr
{
  le.pp = "(" ++ l.pp ++ " <= " ++ r.pp ++ ")";
  le.value = toInteger(l.value <= r.value);
}

abstract production greaterThan
greater::Expr ::= l::Expr r::Expr
{
  greater.pp = "(" ++ l.pp ++ " > " ++ r.pp ++ ")";
  greater.value = toInteger(l.value > r.value);
}

abstract production greaterThanOrEqualTo
ge::Expr ::= l::Expr r::Expr
{
  ge.pp = "(" ++ l.pp ++ " >= " ++ r.pp ++ ")";
  ge.value = toInteger(l.value >= r.value);
}

abstract production equalTo
eq::Expr ::= l::Expr r::Expr
{
  eq.pp = "(" ++ l.pp ++ " == " ++ r.pp ++ ")";
  eq.value = toInteger(l.value == r.value);
}

abstract production notEqualTo
neq::Expr ::= l::Expr r::Expr
{
  neq.pp = "(" ++ l.pp ++ " != " ++ r.pp ++ ")";
  neq.value = toInteger(l.value != r.value);
}

function toBoolean
Boolean ::= i::Integer
{
  return if i == 0 then false else true;
}

abstract production andOp
and::Expr ::= l::Expr r::Expr
{
  and.pp = "(" ++ l.pp ++ " && " ++ r.pp ++ ")";
  and.value = toInteger(toBoolean(l.value) && toBoolean(r.value));
}

abstract production orOp
or::Expr ::= l::Expr r::Expr
{
  or.pp = "(" ++ l.pp ++ " || " ++ r.pp ++ ")";
  or.value = toInteger(toBoolean(l.value) || toBoolean(r.value));
}

abstract production notOp
not::Expr ::= e::Expr
{
  not.pp = "(! " ++ not.pp ++ ")";
  not.value = toInteger(!toBoolean(not.value));
}

abstract production add
sum::Expr ::= l::Expr r::Expr
{
 sum.pp = "(" ++ l.pp ++ " + " ++ r.pp ++ ")";
 sum.value = l.value + r.value ;
}

abstract production sub
dff::Expr ::= l::Expr r::Expr
{
 dff.pp = "(" ++ l.pp ++ " - " ++ r.pp ++ ")";
 dff.value = l.value - r.value ;
}

abstract production mul
prd::Expr ::= l::Expr r::Expr
{
 prd.pp = "(" ++ l.pp ++ " * " ++ r.pp ++ ")";
 prd.value = l.value * r.value ;
}

abstract production div
quo::Expr ::= l::Expr r::Expr
{
 quo.pp = "(" ++ l.pp ++ " / " ++ r.pp ++ ")";
 quo.value = l.value / r.value ;
}

function pow_helper
Integer ::= base::Integer ex::Integer
{
  return if ex == 0 then 1 else base * pow_helper(base, ex-1);
}

abstract production pow
exp::Expr ::= l::Expr r::Expr
{
 exp.pp = "(" ++ l.pp ++ " ^ " ++ r.pp ++ ")";
 exp.value = pow_helper(l.value, r.value);
}

abstract production integerConstant
e::Expr ::= i::IntLit_t
{
 e.pp = i.lexeme ;
 e.value = toInt(i.lexeme);
}
