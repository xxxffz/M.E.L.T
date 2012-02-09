package hello;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(hello.Init.preInit) return;

		hello.Init.preInit = true;

		core.Init.initAllStatics();

	}

	public static void init(){
		if(hello.Init.init) return;

		hello.Init.setupInheritedAttributes();

		hello.Init.init = true;

		core.Init.init();

		hello.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(hello.Init.postInit) return;

		hello.Init.postInit = true;

		core.Init.postInit();


	}

	private static void setupInheritedAttributes(){
		hello.Pmain.occurs_local[hello.Init.base__ON__hello_main] = "hello:main:local:base";
		hello.Pmain.occurs_local[hello.Init.exp__ON__hello_main] = "hello:main:local:exp";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION main IOVal<Integer> ::= largs::Decorated core:List<String> ioin::IO 
		// base = toInt(head(largs))
		hello.Pmain.localAttributes[hello.Init.base__ON__hello_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(((common.StringCatter)core.Phead.invoke(new Object[]{context.childAsIsLazy(hello.Pmain.i_largs)})).toString()); } };
		// exp = toInt(head(tail(largs)))
		hello.Pmain.localAttributes[hello.Init.exp__ON__hello_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(((common.StringCatter)core.Phead.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(hello.Pmain.i_largs)})); } }})).toString()); } };
		//FUNCTION pow Integer ::= base::Integer ex::Integer 
	}

	public static int count_local__ON__hello_main = 0;
	public static int count_local__ON__hello_pow = 0;
public static final int base__ON__hello_main = hello.Init.count_local__ON__hello_main++;
public static final int exp__ON__hello_main = hello.Init.count_local__ON__hello_main++;
}
