package simple.host;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.host.Init.preInit) return;

		simple.host.Init.preInit = true;

		simple.terminals.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		simple.host.driver.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.host.Init.init) return;

		simple.host.Init.init = true;

		simple.host.Init.setupInheritedAttributes();

		simple.terminals.Init.init();
		simple.concretesyntax.Init.init();
		simple.host.driver.Init.init();
		simple.abstractsyntax.Init.init();
		core.Init.init();

		simple.host.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.host.Init.postInit) return;

		simple.host.Init.postInit = true;

		simple.terminals.Init.postInit();
		simple.concretesyntax.Init.postInit();
		simple.host.driver.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		core.Init.postInit();


	}

	private static void setupInheritedAttributes(){
		simple.host.Pmain.occurs_local[simple.host.Init.args__ON__simple_host_main] = "simple:host:main:local:args";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION main IOVal<Integer> ::= largs::Decorated core:List<String> io_in::IO 
		// args = implode(" ", largs)
		simple.host.Pmain.localAttributes[simple.host.Init.args__ON__simple_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Pimplode.invoke(new Object[]{(new common.StringCatter(" ")), context.childAsIsLazy(simple.host.Pmain.i_largs)})); } };
	}

	public static int count_local__ON__simple_host_parse = 0;
	public static int count_local__ON__simple_host_main = 0;
public static final int args__ON__simple_host_main = simple.host.Init.count_local__ON__simple_host_main++;
}
