grammar ast ;

synthesized attribute cppCode :: String
  occurs on Root, VarName, Stmts, Stmt, Decl, Expr;

abstract production root
r::Root ::= v::VarName s::Stmt {
  r.cppCode = v ++ "() {\n" ++ s.cppCode ++ "\n}";
}

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
  s.cppCode = d.cppCode;
}

abstract production stmtsStmt
s::Stmt ::= ss::Stmts {
  s.cppCode = "{\n" ++ ss ++ "\n}";
}

abstract production stmtStmt
this::Stmt ::= rhs::Stmt {
  this.cppCode = "(" ++ rhs.cppCode ++ ")";
}

abstract production ifthen
s::Stmt ::= e::Expr st::Stmt {
  s.cppCode = "if (" ++ e.cppCode ++ ")" ++ st.cppCode;
}

abstract production ifelse
s::Stmt ::= e::Expr st::Stmt sf::Stmt {
  s.cppCode = "if (" ++ e.cppCode ++ ") " ++ st.cppCode ++ "\nelse " ++ sf.cppCode;
}

abstract production varExprStmt
s::Stmt ::= v::VarName e::Expr {
  s.cppCode = v.cppCode ++ " = " ++ e.cppCode;
}

abstract production printStmt
s::Stmt ::= e::Expr {
  s.cppCode = "cout << " ++ e.cppCode ++ " <<;";
}

abstract production forStmt
s::Stmt ::= v::VarName e1::Expr e2::Expr se::Stmt {
  s.cppCode = "for (" ++ v.cppCode ++ " = " ++ e1.cppCode ++ "; "
  	      	   ++ v.cppCode ++ " <= " ++ e2.cppCode ++ "; "
		   ++ "++" ++ v.cppCode ++ ") {\n" ++ se.cppCode ++ "\n}";
}

abstract production intDecl
d::Decl ::= v::VarName {
  d.cppCode = "int " ++ v.cppCode ++ ";";
}

abstract production floatDecl
d::Decl ::= v::VarName {
  d.cppCode = "float " ++ v.cppCode ++ ";";
}

abstract production boolDecl
d::Decl ::= v::VarName {
  d.cppCode = "bool " ++ v.cppCode ++ ";";
}

abstract production stringDecl
d::Decl ::= v::VarName {
  d.cppCode = "string " ++ v.cppCode ++ ";";
}

abstract production varExpr
e::Expr ::= v::VarName {
  e.cppCode = v.cppCode ++ ";";
}

abstract production intConst
e::Expr ::= i::IntConst {
  e.cppCode = i.lexeme;
}

abstract production floatConst
e::Expr ::= f::FloatConst {
  e.cppCode = f.lexeme;
}

abstract production boolConst
e::Expr ::= b::BooleanConst {
  e.cppCode = b.lexeme;
}

abstract production stringConst
e::Expr ::= s::String {
  e.cppCode = s.lexeme;
}

abstract production add
e::Expr ::= a1::Expr a2::Expr {
  e.cppCode = a1.cppCode ++ " + " ++ a2.cppCode ++ ";";
}

abstract production sub
e::Expr ::= s1::Expr s2::Expr {
  e.cppCode = s1.cppCode ++ " - " ++ s2.cppCode ++ ";";
}

abstract production mul
e::Expr ::= m1::Expr m2::Expr {
  e.cppCode = m1.cppCode ++ " * " ++ m2.cppCode ++ ";";
}

abstract production div
e::Expr ::= d1::Expr d2::Expr {
  e.cppCode = d1.cppCode ++ " / " ++ d2.cppCode ++ ";";
}

abstract production func
e::Expr ::= v::VarName p::Expr {
  e.cppCode = v.cppCode ++ "(" + p + ");";
}
