package simple.extensions.do_while;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.extensions.do_while.Init.preInit) return;

		simple.extensions.do_while.Init.preInit = true;

		simple.terminals.Init.initAllStatics();
		simple.extensions.repeat_until.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.extensions.do_while.Init.init) return;

		simple.extensions.do_while.Init.init = true;

		simple.extensions.do_while.Init.setupInheritedAttributes();

		simple.terminals.Init.init();
		simple.extensions.repeat_until.Init.init();
		simple.abstractsyntax.Init.init();
		simple.concretesyntax.Init.init();
		silver.langutil.Init.init();
		core.Init.init();

		simple.extensions.do_while.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.extensions.do_while.Init.postInit) return;

		simple.extensions.do_while.Init.postInit = true;

		simple.terminals.Init.postInit();
		simple.extensions.repeat_until.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.concretesyntax.Init.postInit();
		silver.langutil.Init.postInit();
		core.Init.postInit();


		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_extensions_do_whileDoWhile_sv_18_1.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pdowhile.class);
	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
		simple.extensions.do_while.PP_simple_extensions_do_whileDoWhile_sv_18_1.initProductionAttributeDefinitions();
		simple.extensions.do_while.Pdowhile.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__simple_extensions_do_while_P_simple_extensions_do_whileDoWhile_sv_18_1 = 0;
	public static int count_local__ON__simple_extensions_do_while_dowhile = 0;
}
