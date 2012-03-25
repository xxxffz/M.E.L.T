package simple.extensions.repeat_until;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.extensions.repeat_until.Init.preInit) return;

		simple.extensions.repeat_until.Init.preInit = true;

		simple.terminals.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.extensions.repeat_until.Init.init) return;

		simple.extensions.repeat_until.Init.init = true;

		simple.extensions.repeat_until.Init.setupInheritedAttributes();

		simple.terminals.Init.init();
		simple.abstractsyntax.Init.init();
		simple.concretesyntax.Init.init();
		silver.langutil.Init.init();
		core.Init.init();

		simple.extensions.repeat_until.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.extensions.repeat_until.Init.postInit) return;

		simple.extensions.repeat_until.Init.postInit = true;

		simple.terminals.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.concretesyntax.Init.postInit();
		silver.langutil.Init.postInit();
		core.Init.postInit();


		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, PrepeatStmt.class);
	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
		simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.initProductionAttributeDefinitions();
		simple.extensions.repeat_until.PrepeatStmt.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__simple_extensions_repeat_until_P_simple_extensions_repeat_untilRepeatUntil_sv_11_1 = 0;
	public static int count_local__ON__simple_extensions_repeat_until_repeatStmt = 0;
}
