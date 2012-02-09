grammar hello;

function main 
IOVal<Integer> ::= largs::[String] ioin::IO
{
  local attribute base::Integer;
  local attribute exp::Integer;
  base = toInt(head(largs));
  exp = toInt(head(tail(largs)));
  return ioval(print(toString(pow(base, exp)), ioin), 0);
}

function pow
Integer ::= base::Integer ex::Integer
{
  return if ex == 0 then 1 else base * pow(base, ex-1);
}
