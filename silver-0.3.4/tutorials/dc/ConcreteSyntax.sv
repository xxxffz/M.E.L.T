grammar dc ;

{- This file defines the concrete syntax of the arithmetic expression
   language "dc".  The concrete productions are used to define the
   parser.  They also define an attribute, pp, which unparses the tree
   to generate a string, and attributes, ast_Root and ast_Expr, which
   are used to generate the abstract syntax tree.  -}

nonterminal Root_c with pp, ast_Root;

synthesized attribute ast_Root :: Root;


concrete production root_c
r::Root_c ::= e::LogiOr_c--Expr_c
{
  r.pp = e.pp;
  r.ast_Root = root(e.ast_Expr); 
  -- 'root' is the abstract production defined in AbstractSyntax.sv
}

synthesized attribute ast_Expr :: Expr ;

nonterminal LogiOr_c   with pp, ast_Expr;
nonterminal LogiAnd_c  with pp, ast_Expr;
nonterminal Cmpe_c     with pp, ast_Expr;
nonterminal Cmplg_c    with pp, ast_Expr;
nonterminal Expr_c     with pp, ast_Expr;
nonterminal Term_c     with pp, ast_Expr;
nonterminal Phrase_c   with pp, ast_Expr;
nonterminal Factor_c   with pp, ast_Expr;
nonterminal LogiNot_c  with pp, ast_Expr;
-- Nonterminal declarations can also specify some attributes that decorate it.

{- Note about this concrete syntax: We're choosing to use the
   Expr/Term/Factor decomposition here.  Silver also supports the
   commonly used 'association' and 'precedence' specifications. See
   comments in Terminals.sv for more details.  -}

concrete production orOp_c
or::LogiOr_c ::= logiOr::LogiOr_c '||' logiAnd::LogiAnd_c
{
  or.pp = logiOr.pp ++ " || " ++ logiAnd.pp;
  or.ast_Expr = orOp(logiOr.ast_Expr, logiAnd.ast_Expr);
}

concrete production andOp_c
and::LogiAnd_c ::= logiAnd::LogiAnd_c '&&' cmpe::Cmpe_c --logiNot::LogiNot_c
{
  and.pp = logiAnd.pp ++ " && " ++ cmpe.pp; --logiNot.pp;
  and.ast_Expr = andOp(logiAnd.ast_Expr, cmpe.ast_Expr); --logiNot.ast_Expr);
}

concrete production notEqualTo_c
ne::Cmpe_c ::= cmpe::Cmpe_c '!=' cmplg::Cmplg_c
{
  ne.pp = cmpe.pp ++ " != " ++ cmplg.pp;
  ne.ast_Expr = notEqualTo(cmpe.ast_Expr, cmplg.ast_Expr);
}

concrete production equalTo_c
eq::Cmpe_c ::= cmpe::Cmpe_c '==' cmplg::Cmplg_c
{
  eq.pp = cmpe.pp ++ " == " ++ cmplg.pp;
  eq.ast_Expr = equalTo(cmpe.ast_Expr, cmplg.ast_Expr);
}

concrete production lessThan_c
less::Cmplg_c ::= cmplg::Cmplg_c '<' e::Expr_c
{
  less.pp = cmplg.pp ++ " < " ++ e.pp;
  less.ast_Expr = lessThan(cmplg.ast_Expr, e.ast_Expr);
}

concrete production lessThanOrEqualTo_c
le::Cmplg_c ::= cmplg::Cmplg_c '<=' e::Expr_c
{
  le.pp = cmplg.pp ++ " <= " ++ e.pp;
  le.ast_Expr = lessThanOrEqualTo(cmplg.ast_Expr, e.ast_Expr);
}

concrete production greaterThan_c
greater::Cmplg_c ::= cmplg::Cmplg_c '>' e::Expr_c
{
  greater.pp = cmplg.pp ++ " > " ++ e.pp;
  greater.ast_Expr = greaterThan(cmplg.ast_Expr, e.ast_Expr);
}

concrete production greaterThanOrEqualTo_c
ge::Cmplg_c ::= cmplg::Cmplg_c '>=' e::Expr_c
{
  ge.pp = cmplg.pp ++ " < " ++ e.pp;
  ge.ast_Expr = greaterThanOrEqualTo(cmplg.ast_Expr, e.ast_Expr);
}

concrete production add_c
sum::Expr_c ::= e::Expr_c '+' t::Term_c
{
 sum.pp = e.pp ++ " + " ++ t.pp ;
 sum.ast_Expr = add(e.ast_Expr, t.ast_Expr );
}

concrete production sub_c
dff::Expr_c ::= e::Expr_c '-' t::Term_c
{
 dff.pp = e.pp ++ " - " ++ t.pp ;
 dff.ast_Expr = sub(e.ast_Expr, t.ast_Expr);
}

concrete production mul_c
prd::Term_c ::= t::Term_c '*' f::Phrase_c
{
 prd.pp = t.pp ++ " * " ++ f.pp ;
 prd.ast_Expr = mul(t.ast_Expr, f.ast_Expr);
}

concrete production div_c
d::Term_c ::= t::Term_c '/' f::Phrase_c
{
 d.pp = t.pp ++ " / " ++ f.pp ;
 d.ast_Expr = div(t.ast_Expr, f.ast_Expr);
}

concrete production pow_c
pw::Phrase_c ::= f::Factor_c '^' t::Phrase_c
{
 pw.pp = f.pp ++ " ^ " ++ t.pp;
 pw.ast_Expr = pow(f.ast_Expr, t.ast_Expr);
}

concrete production LogiOrLogiAnd_c
logiOr::LogiOr_c ::= logiAnd::LogiAnd_c
{
  logiOr.pp = logiAnd.pp;
  logiOr.ast_Expr = logiAnd.ast_Expr;
}

concrete production LogiAndCmpe_c --LogiNot_c
logiAnd::LogiAnd_c ::= cmpe::Cmpe_c --logiNot::LogiNot_c
{
  logiAnd.pp = cmpe.pp; --logiNot.pp;
  logiAnd.ast_Expr = cmpe.ast_Expr; --logiNot.ast_Expr;
}
{-
concrete production LogiNotCmpe_c
logiNot::LogiNot_c ::= cmpe::Cmpe_c
{
  logiNot.pp = cmpe.pp;
  logiNot.ast_Expr = cmpe.ast_Expr;
}
-}
concrete production CmpeCmlg_c
cmpe::Cmpe_c ::= cmplg::Cmplg_c
{
  cmpe.pp = cmplg.pp;
  cmpe.ast_Expr = cmplg.ast_Expr;
}

concrete production CmplgExpr_c
cmplg::Cmplg_c ::= e::Expr_c
{
  cmplg.pp = e.pp;
  cmplg.ast_Expr = e.ast_Expr;
}

concrete production exprTerm_c
e::Expr_c ::= t::Term_c
{
 e.pp = t.pp ;
 e.ast_Expr = t.ast_Expr ;
}

concrete production termPhrase_c
t::Term_c ::= p::Phrase_c
{
 t.pp = p.pp ;
 t.ast_Expr = p.ast_Expr;
}

concrete production phraseFactor_c
p::Phrase_c ::= f::Factor_c
{
 p.pp = f.pp;
 p.ast_Expr = f.ast_Expr;
}

concrete production FactorLogiNot_c
f::Factor_c ::= logiNot::LogiNot_c
{
  f.pp = logiNot.pp;
  f.ast_Expr = logiNot.ast_Expr;
}

concrete production nested_c
e::LogiNot_c ::= '(' inner::LogiOr_c ')'
{
 e.pp = "(" ++ inner.pp ++ ")" ;
 e.ast_Expr = inner.ast_Expr ;
}

concrete production integerConstant_c
ic::LogiNot_c ::= i::IntLit_t
{
 ic.pp = i.lexeme ;
 ic.ast_Expr = integerConstant(i);
}
