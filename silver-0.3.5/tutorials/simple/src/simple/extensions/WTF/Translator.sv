grammar WTF ;

{--
 - Declare a parser, called 'parse', u
sing the concrete syntax in the
 - tutorials:dc grammar.
 -
 - parse :: Function( ParseResult<Root_c> ::= String String )
 - (The arguments are "string to parse", "file name to refer to this
 -  string as coming from".)
 -}
parser parse :: Root
{
  WTF;
}

{--
 - main :: Function( IO ::= String IO ) is the entry point for silver programs.
 -
 - Note that 'IO' is something that should be considered 'the state of the 
 - world' and each value used only once.
 -}
function main 
IOVal<Integer> ::= largs::[String] ioin::IO
{
  local attribute args :: String;
  args = implode(" ", largs);

  --local attribute result :: ParseResult<Root_c>;
  --result = parse(args, "<<args>>");
  
  production attribute isF::IOVal<Boolean>;
  isF = isFile(args, ioin);

  production attribute text::IOVal<String>;
  text = readFile(args, isF.io);

  local attribute result::ParseResult<Root>;
  result = parse(text.iovalue, args);

  local attribute r_cst :: Root ;
  r_cst = result.parseTree ;

  local attribute r_ast :: Root ;
  r_ast = r_cst.ast_Root ;

  local attribute print_success :: IO;
  print_success = 
    print( "Command line expression: " ++ args ++
           "\n\n" ++
           "AST pretty print: " ++ r_ast.cppCode ++
           "\n\n" ++
--           "AST better pretty print: " ++ r_ast.bpp ++
--           "\n\n" ++
--           "Value: " ++ toString(r_ast.value) ++
           "\n\n" 
           , ioin );

  local attribute print_failure :: IO;
  print_failure =
    print("Encountered a parse error:\n" ++ result.parseErrors ++ "\n", ioin);

  return ioval(if result.parseSuccess then print_success else print_failure,
               0);
}
