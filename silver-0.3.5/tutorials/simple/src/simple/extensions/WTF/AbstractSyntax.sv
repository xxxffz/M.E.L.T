grammar WTF ;

synthesized attribute cppCode :: String
  occurs on Root, Stmts, Stmt, Decl, LExpr, Expr;

-- ROOT --

abstract production root
r::Root ::= s::Stmts {
  r.cppCode = "\n#include <iostream>\n#include <string>\n\n"
  	      ++ "using namespace std;\n\n"
	      ++ "int main() {\n" ++ s.cppCode ++ "}";
}

-- STATEMENTS --

abstract production emptyStmts
ss::Stmts ::=  {
  ss.cppCode = "";
}

abstract production stmtStmtsStmts
ss::Stmts ::= s1::Stmt s2::Stmts {
  ss.cppCode = s1.cppCode ++ s2.cppCode;
}

abstract production declStmt
s::Stmt ::= d::Decl {
  s.cppCode = d.cppCode ++ ";\n";
}


-- STATEMENT --

abstract production assignment
s::Stmt ::= le::LExpr e::Expr
{
  s.cppCode = le.cppCode ++ " = " ++ e.cppCode ++ ";\n";
}

abstract production printStmt
s::Stmt ::= e::Expr {
  s.cppCode = "cout << " ++ e.cppCode ++ ";\n";
}

abstract production stmtsStmt
s::Stmt ::= ss::Stmts {
  s.cppCode = "{\n" ++ ss.cppCode ++ "}\n";
}

abstract production ifthen
s::Stmt ::= pred::Expr st::Stmt {
  s.cppCode = "if (" ++ pred.cppCode ++ ") " ++ st.cppCode;
}

abstract production ifelse
s::Stmt ::= e::Expr st::Stmt sf::Stmt {
  s.cppCode = "if (" ++ e.cppCode ++ ") " ++ st.cppCode ++ "else " ++ sf.cppCode;
}

abstract production forStmt
s::Stmt ::= v::String e1::Expr e2::Expr se::Stmt {
  s.cppCode = "for (" ++ v ++ " = " ++ e1.cppCode ++ "; "
  	      	   ++ v ++ " <= " ++ e2.cppCode ++ "; "
		   ++ "++" ++ v ++ ")\n" ++ se.cppCode;
}


-- DECLARATION --

abstract production intDecl
d::Decl ::= v::String {
  d.cppCode = "int " ++ v;
}

abstract production floatDecl
d::Decl ::= v::String {
  d.cppCode = "float " ++ v;
}

abstract production boolDecl
d::Decl ::= v::String {
  d.cppCode = "bool " ++ v;
}

abstract production stringDecl
d::Decl ::= v::String {
  d.cppCode = "string " ++ v;
}


-- EXPRESSIONS --

abstract production variable
le::LExpr ::= s::String
{
  le.cppCode = s;
}

abstract production LExpr2Expr
e::Expr ::= le::LExpr
{
  e.cppCode = le.cppCode;
}

abstract production nestedExpr
e::Expr ::= ne::Expr {
  e.cppCode = "(" ++ ne.cppCode ++ ")";
}

abstract production intConst
e::Expr ::= i::String {
  e.cppCode = i;
}

abstract production floatConst
e::Expr ::= f::String {
  e.cppCode = f;
}

abstract production boolConst
e::Expr ::= b::String {
  e.cppCode = b;
}

abstract production stringConst
e::Expr ::= s::String {
  e.cppCode = s;
}

abstract production add
e::Expr ::= a1::Expr a2::Expr {
  e.cppCode = a1.cppCode ++ " + " ++ a2.cppCode;
}

abstract production sub
e::Expr ::= s1::Expr s2::Expr {
  e.cppCode = s1.cppCode ++ " - " ++ s2.cppCode;
}

abstract production mul
e::Expr ::= m1::Expr m2::Expr {
  e.cppCode = m1.cppCode ++ " * " ++ m2.cppCode;
}

abstract production div
e::Expr ::= d1::Expr d2::Expr {
  e.cppCode = d1.cppCode ++ " / " ++ d2.cppCode;
}

abstract production equal
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " == " ++ e2.cppCode;
}

abstract production notEqual
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " != " ++ e2.cppCode;
}

abstract production greaterThan
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " > " ++ e2.cppCode;
}

abstract production greaterThanEqual
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " >= " ++ e2.cppCode;
}

abstract production lessThan
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " < " ++ e2.cppCode;
}

abstract production lessThanEqual
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " <= " ++ e2.cppCode;
}

abstract production and
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " && " ++ e2.cppCode;
}

abstract production or
e::Expr ::= e1::Expr e2::Expr {
  e.cppCode = e1.cppCode ++ " || " ++ e2.cppCode;
}

abstract production not
e::Expr ::= e1::Expr {
  e.cppCode = "!" ++ e1.cppCode;
}

abstract production func
e::Expr ::= v::String p::Expr {
  e.cppCode = v ++ "(" ++ p.cppCode ++ ")";
}
