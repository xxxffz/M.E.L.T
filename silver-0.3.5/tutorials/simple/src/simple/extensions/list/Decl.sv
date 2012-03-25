grammar simple:extensions:list;

concrete productions d::cst:Decl
 | 'List' "<" t::cst:TypeExpr ">" id::cst:id  '='  '['  ']'  ';'
{
  d.unparse = "List " ++ id.lexeme ++ "[" ++ "]" + ";\n";
  d.ast = declEmptyList( t.ast, cst:name(id) );
}

-- TODO
-- concrete production listComprehension d::cst:Decl

abstract production declEmptyList
d::Decl ::= t::TypeExpr id::Name 
{
  d.pp = concat( [text("List "), id.pp, text(" = "), brackets() );
}

abstract production typeExprList
t::TypeExpr ::=  
{
  t.pp = text("List");
  t.type = ListType();
  t.c_code = "struct list";
}

abstract production listType
t::Type ::=   
{
  t.pp = text("List");
}
