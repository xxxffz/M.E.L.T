package simple.extensions.implication;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.extensions.implication.Init.preInit) return;

		simple.extensions.implication.Init.preInit = true;

		simple.terminals.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.extensions.implication.Init.init) return;

		simple.extensions.implication.Init.init = true;

		simple.extensions.implication.Init.setupInheritedAttributes();

		simple.terminals.Init.init();
		simple.abstractsyntax.Init.init();
		simple.concretesyntax.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();
		core.Init.init();

		simple.extensions.implication.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.extensions.implication.Init.postInit) return;

		simple.extensions.implication.Init.postInit = true;

		simple.terminals.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.concretesyntax.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();
		core.Init.postInit();


		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_extensions_implicationImplication_sv_11_1.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pimplies.class);
	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
		simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1.initProductionAttributeDefinitions();
		simple.extensions.implication.Pimplies.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__simple_extensions_implication_P_simple_extensions_implicationImplication_sv_11_1 = 0;
	public static int count_local__ON__simple_extensions_implication_implies = 0;
}
