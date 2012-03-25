grammar WTF ;

nonterminal   Root	with ast_Root;
nonterminal   Stmts 	with ast_Stmts;
nonterminal   Stmt 	with ast_Stmt;
nonterminal   Decl 	with ast_Decl;
nonterminal   LExpr	with ast_LExpr;
nonterminal   Expr	with ast_Expr;

synthesized attribute ast_Root::Root;
synthesized attribute ast_Stmts::Stmts;
synthesized attribute ast_Stmt::Stmt;
synthesized attribute ast_Decl::Decl;
synthesized attribute ast_LExpr::LExpr;
synthesized attribute ast_Expr::Expr;

-- ROOT --

concrete production root_c
r::Root ::= 'main' '(' ')' '{' s::Stmts  '}' {
  r.ast_Root = root(s.ast_Stmts);
}


-- STATEMENTS --

concrete productions ss::Stmts
  |			       { ss.ast_Stmts = emptyStmts(); }
  | s1::Stmt s2::Stmts	       { ss.ast_Stmts = stmtStmtsStmts(s1.ast_Stmt, s2.ast_Stmts); }


-- STATEMENT --

nonterminal IfStmt with ast_IfStmt
concrete productions cond::IfStmt
  | 'if' '(' pred::Expr ')' st::Stmt

concrete productions s::Stmt
  | le::LExpr '=' e::Expr ';'  { s.ast_Stmt = assignment(le.ast_LExpr, e.ast_Expr); }

  | 'print' '(' e::Expr ')' ';'
			       { s.ast_Stmt = printStmt(e.ast_Expr); }

  | d::Decl ';'		       { s.ast_Stmt = declStmt(d.ast_Decl); }

  | '{' ss::Stmts '}'  	       { s.ast_Stmt = stmtsStmt(ss.ast_Stmts); }


--  | 'if' '(' pred::Expr ')' st::Stmt 	 
--    	 	 	       { s.ast_Stmt = ifthen(pred.ast_Expr, st.ast_Stmt); }

  | 'if' '(' pred::Expr ')' st::Stmt 'else' sf::Stmts
    	     	     	       { s.ast_Stmt = ifelse(pred.ast_Expr, st.ast_Stmt, sf.ast_Stmt); }

  | 'for' '(' v::Id '=' e1::Expr 'to' e2::Expr ')' se::Stmt
    	       		       { s.ast_Stmt = forStmt(v.lexeme, e1.ast_Expr, e2.ast_Expr, se.ast_Stmt); }


-- DECLARATION --

concrete productions d::Decl
  | 'Integer'   v::Id	       { d.ast_Decl = intDecl(v.lexeme); }
  | 'Float' 	v::Id	       { d.ast_Decl = floatDecl(v.lexeme); }
  | 'Boolean'	v::Id	       { d.ast_Decl = boolDecl(v.lexeme); }
  | 'String'	v::Id	       { d.ast_Decl = stringDecl(v.lexeme); }  


-- EXPRESSIONS

concrete productions le::LExpr
  | v::Id		       { le.ast_LExpr = variable(v.lexeme); }

concrete productions e::Expr
  | le::LExpr		       { e.ast_Expr = LExpr2Expr(le.ast_LExpr); }

  | '(' ne::Expr ')'	       { e.ast_Expr = nestedExpr(ne.ast_Expr); }

  | i::IntegerLiteral  	       { e.ast_Expr = intConst(i.lexeme); }
  | f::FloatLiteral    	       { e.ast_Expr = floatConst(f.lexeme); }
  | b::BooleanLiteral	       { e.ast_Expr = boolConst(b.lexeme); }
  | s::StringLiteral   	       { e.ast_Expr = stringConst(s.lexeme); }

  | a1::Expr '+' a2::Expr      { e.ast_Expr = add(a1.ast_Expr, a2.ast_Expr); }
  | s1::Expr '-' s2::Expr      { e.ast_Expr = sub(s1.ast_Expr, s2.ast_Expr); }
  | m1::Expr '*' m2::Expr      { e.ast_Expr = mul(m1.ast_Expr, m2.ast_Expr); }
  | d1::Expr '/' d2::Expr      { e.ast_Expr = div(d1.ast_Expr, d2.ast_Expr); }

  | e1::Expr '==' e2::Expr     { e.ast_Expr = equal(e1.ast_Expr, e2.ast_Expr); }
  | e1::Expr '!=' e2::Expr     { e.ast_Expr = notEqual(e1.ast_Expr, e2.ast_Expr); }
  | e1::Expr '>'  e2::Expr     { e.ast_Expr = greaterThan(e1.ast_Expr, e2.ast_Expr); }
  | e1::Expr '>=' e2::Expr     { e.ast_Expr = greaterThanEqual(e1.ast_Expr, e2.ast_Expr); }
  | e1::Expr '<'  e2::Expr     { e.ast_Expr = lessThan(e1.ast_Expr, e2.ast_Expr); }
  | e1::Expr '<=' e2::Expr     { e.ast_Expr = lessThanEqual(e1.ast_Expr, e2.ast_Expr); }
  | e1::Expr '&&' e2::Expr     { e.ast_Expr = and(e1.ast_Expr, e2.ast_Expr); }
  | e1::Expr '||' e2::Expr     { e.ast_Expr = or(e1.ast_Expr, e2.ast_Expr); }
  | '!'	e1::Expr  	       { e.ast_Expr = not(e1.ast_Expr); }

  | v::Id '(' p::Expr ')'      { e.ast_Expr = func(v.lexeme, p.ast_Expr); }
