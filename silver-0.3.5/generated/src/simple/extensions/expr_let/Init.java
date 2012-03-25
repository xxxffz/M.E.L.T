package simple.extensions.expr_let;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.extensions.expr_let.Init.preInit) return;

		simple.extensions.expr_let.Init.preInit = true;

		simple.terminals.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.extensions.expr_let.Init.init) return;

		simple.extensions.expr_let.Init.init = true;

		simple.extensions.expr_let.Init.setupInheritedAttributes();

		simple.terminals.Init.init();
		simple.abstractsyntax.Init.init();
		simple.concretesyntax.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();
		core.Init.init();

		simple.extensions.expr_let.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.extensions.expr_let.Init.postInit) return;

		simple.extensions.expr_let.Init.postInit = true;

		simple.terminals.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.concretesyntax.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();
		core.Init.postInit();


		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_extensions_expr_letLet_sv_13_1.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, PletExpr.class);
	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
		simple.extensions.expr_let.PP_simple_extensions_expr_letLet_sv_13_1.initProductionAttributeDefinitions();
		simple.extensions.expr_let.PletExpr.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__simple_extensions_expr_let_P_simple_extensions_expr_letLet_sv_13_1 = 0;
	public static int count_local__ON__simple_extensions_expr_let_letExpr = 0;
}
