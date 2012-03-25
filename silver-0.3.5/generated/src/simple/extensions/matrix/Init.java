package simple.extensions.matrix;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.extensions.matrix.Init.preInit) return;

		simple.extensions.matrix.Init.preInit = true;

		simple.terminals.Init.initAllStatics();
		core.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();

	}

	public static void init(){
		if(simple.extensions.matrix.Init.init) return;

		simple.extensions.matrix.Init.init = true;

		simple.extensions.matrix.Init.setupInheritedAttributes();

		simple.terminals.Init.init();
		core.Init.init();
		simple.abstractsyntax.Init.init();
		simple.concretesyntax.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();

		simple.extensions.matrix.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.extensions.matrix.Init.postInit) return;

		simple.extensions.matrix.Init.postInit = true;

		simple.terminals.Init.postInit();
		core.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.concretesyntax.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();


		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_extensions_matrixExpr_sv_4_1.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, PmatrixRef.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NDecl.decorators, PP_simple_extensions_matrixDecl_sv_4_1.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NDecl.decorators, PdeclMatrix.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NTypeExpr.decorators, PtypeExprMatrix.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NType.decorators, PmatrixType.class);
	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
		simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1.initProductionAttributeDefinitions();
		simple.extensions.matrix.PmatrixRef.initProductionAttributeDefinitions();
		simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.initProductionAttributeDefinitions();
		simple.extensions.matrix.PdeclMatrix.initProductionAttributeDefinitions();
		simple.extensions.matrix.PtypeExprMatrix.initProductionAttributeDefinitions();
		simple.extensions.matrix.PmatrixType.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__simple_extensions_matrix_P_simple_extensions_matrixExpr_sv_4_1 = 0;
	public static int count_local__ON__simple_extensions_matrix_matrixRef = 0;
	public static int count_local__ON__simple_extensions_matrix_P_simple_extensions_matrixDecl_sv_4_1 = 0;
	public static int count_local__ON__simple_extensions_matrix_declMatrix = 0;
	public static int count_local__ON__simple_extensions_matrix_typeExprMatrix = 0;
	public static int count_local__ON__simple_extensions_matrix_matrixType = 0;
}
