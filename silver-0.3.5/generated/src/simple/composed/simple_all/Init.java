package simple.composed.simple_all;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.composed.simple_all.Init.preInit) return;

		simple.composed.simple_all.Init.preInit = true;

		simple.host.driver.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.terminals.Init.initAllStatics();
		simple.extensions.expr_let.Init.initAllStatics();
		simple.extensions.expr_if.Init.initAllStatics();
		simple.extensions.matrix.Init.initAllStatics();
		simple.extensions.implication.Init.initAllStatics();
		simple.extensions.repeat_until.Init.initAllStatics();
		simple.extensions.do_while.Init.initAllStatics();
		simple.host.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.composed.simple_all.Init.init) return;

		simple.composed.simple_all.Init.init = true;

		simple.composed.simple_all.Init.setupInheritedAttributes();

		simple.host.driver.Init.init();
		simple.abstractsyntax.Init.init();
		simple.terminals.Init.init();
		simple.extensions.expr_let.Init.init();
		simple.extensions.expr_if.Init.init();
		simple.extensions.matrix.Init.init();
		simple.extensions.implication.Init.init();
		simple.extensions.repeat_until.Init.init();
		simple.extensions.do_while.Init.init();
		simple.host.Init.init();
		simple.concretesyntax.Init.init();
		core.Init.init();

		simple.composed.simple_all.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.composed.simple_all.Init.postInit) return;

		simple.composed.simple_all.Init.postInit = true;

		simple.host.driver.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.terminals.Init.postInit();
		simple.extensions.expr_let.Init.postInit();
		simple.extensions.expr_if.Init.postInit();
		simple.extensions.matrix.Init.postInit();
		simple.extensions.implication.Init.postInit();
		simple.extensions.repeat_until.Init.postInit();
		simple.extensions.do_while.Init.postInit();
		simple.host.Init.postInit();
		simple.concretesyntax.Init.postInit();
		core.Init.postInit();


	}

	private static void setupInheritedAttributes(){
		simple.composed.simple_all.Pmain.occurs_local[simple.composed.simple_all.Init.args__ON__simple_composed_simple_all_main] = "simple:composed:simple_all:main:local:args";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION main IOVal<Integer> ::= largs::Decorated core:List<String> io_in::IO 
		// args = implode(" ", largs)
		simple.composed.simple_all.Pmain.localAttributes[simple.composed.simple_all.Init.args__ON__simple_composed_simple_all_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Pimplode.invoke(new Object[]{(new common.StringCatter(" ")), context.childAsIsLazy(simple.composed.simple_all.Pmain.i_largs)})); } };
	}

	public static int count_local__ON__simple_composed_simple_all_parse = 0;
	public static int count_local__ON__simple_composed_simple_all_main = 0;
public static final int args__ON__simple_composed_simple_all_main = simple.composed.simple_all.Init.count_local__ON__simple_composed_simple_all_main++;
}
