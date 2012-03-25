package simple.concretesyntax;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.concretesyntax.Init.preInit) return;

		simple.concretesyntax.Init.preInit = true;

		core.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.terminals.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();

	}

	public static void init(){
		if(simple.concretesyntax.Init.init) return;

		simple.concretesyntax.Init.init = true;

		simple.concretesyntax.Init.setupInheritedAttributes();

		core.Init.init();
		simple.abstractsyntax.Init.init();
		simple.terminals.Init.init();
		silver.langutil.Init.init();

		simple.concretesyntax.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.concretesyntax.Init.postInit) return;

		simple.concretesyntax.Init.postInit = true;

		core.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.terminals.Init.postInit();
		silver.langutil.Init.postInit();


		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_21_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_29_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_31_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_33_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_42_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_44_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_46_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_48_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_50_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_52_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_73_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_75_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_77_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_79_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_85_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_91_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_93_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_96_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NExpr.decorators, PP_simple_concretesyntaxExpr_sv_99_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_concretesyntaxFor_sv_4_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtUnMatched.decorators, PP_simple_concretesyntaxFor_sv_8_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmts.decorators, PP_simple_concretesyntaxStmt_sv_19_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmts.decorators, PstmtNone.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmt.decorators, PP_simple_concretesyntaxStmt_sv_33_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmt.decorators, PP_simple_concretesyntaxStmt_sv_35_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmt.decorators, PP_simple_concretesyntaxStmt_sv_37_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_concretesyntaxStmt_sv_46_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_concretesyntaxStmt_sv_48_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_concretesyntaxStmt_sv_50_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_concretesyntaxStmt_sv_52_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtMatched.decorators, PP_simple_concretesyntaxStmt_sv_54_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtUnMatched.decorators, PP_simple_concretesyntaxStmt_sv_63_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtUnMatched.decorators, PP_simple_concretesyntaxStmt_sv_65_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtUnMatched.decorators, PP_simple_concretesyntaxStmt_sv_67_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NStmtUnMatched.decorators, PP_simple_concretesyntaxStmt_sv_69_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NRoot.decorators, PP_simple_concretesyntaxRoot_sv_30_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NDecl.decorators, PP_simple_concretesyntaxDecl_sv_9_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NTypeExpr.decorators, PP_simple_concretesyntaxDecl_sv_18_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NTypeExpr.decorators, PP_simple_concretesyntaxDecl_sv_21_1.class);
		common.Decorator.applyDecorators(simple.concretesyntax.NTypeExpr.decorators, PP_simple_concretesyntaxDecl_sv_23_1.class);
	}

	private static void setupInheritedAttributes(){
		simple.concretesyntax.NExpr.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr] = "silver:langutil:unparse";
		simple.concretesyntax.NExpr.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr] = "silver:langutil:ast";
		simple.concretesyntax.NStmts.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmts] = "silver:langutil:unparse";
		simple.concretesyntax.NStmts.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmts] = "silver:langutil:ast";
		simple.concretesyntax.NStmt.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmt] = "silver:langutil:unparse";
		simple.concretesyntax.NStmt.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmt] = "silver:langutil:ast";
		simple.concretesyntax.NStmtMatched.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched] = "silver:langutil:unparse";
		simple.concretesyntax.NStmtMatched.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched] = "silver:langutil:ast";
		simple.concretesyntax.NStmtUnMatched.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtUnMatched] = "silver:langutil:unparse";
		simple.concretesyntax.NStmtUnMatched.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtUnMatched] = "silver:langutil:ast";
		simple.concretesyntax.NRoot.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Root] = "silver:langutil:unparse";
		simple.concretesyntax.NRoot.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Root] = "silver:langutil:ast";
		simple.concretesyntax.NDecl.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Decl] = "silver:langutil:unparse";
		simple.concretesyntax.NDecl.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Decl] = "silver:langutil:ast";
		simple.concretesyntax.NTypeExpr.occurs_syn[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_TypeExpr] = "silver:langutil:unparse";
		simple.concretesyntax.NTypeExpr.occurs_syn[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_TypeExpr] = "silver:langutil:ast";
	}

	private static void initProductionAttributeDefinitions(){
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_21_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_29_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_31_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_33_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_42_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_44_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_46_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_48_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_50_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_52_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_73_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_75_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_77_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_79_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_85_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_91_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_96_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_99_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxFor_sv_8_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PstmtNone.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_33_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_35_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_37_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_46_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_50_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_52_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_54_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_63_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_65_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_67_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxRoot_sv_30_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_18_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_21_1.initProductionAttributeDefinitions();
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_23_1.initProductionAttributeDefinitions();
		//FUNCTION name ast:Name ::= id::term:Id 
	}

	public static int count_inh__ON__Expr = 0;
	public static int count_syn__ON__Expr = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_21_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_29_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_31_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_33_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_42_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_44_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_46_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_48_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_50_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_52_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_73_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_75_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_77_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_79_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_85_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_91_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_93_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_96_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_99_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxFor_sv_4_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxFor_sv_8_1 = 0;
	public static int count_inh__ON__Stmts = 0;
	public static int count_syn__ON__Stmts = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_19_1 = 0;
	public static int count_local__ON__simple_concretesyntax_stmtNone = 0;
	public static int count_inh__ON__Stmt = 0;
	public static int count_syn__ON__Stmt = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_33_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_35_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_37_1 = 0;
	public static int count_inh__ON__StmtMatched = 0;
	public static int count_syn__ON__StmtMatched = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_46_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_48_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_50_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_52_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_54_1 = 0;
	public static int count_inh__ON__StmtUnMatched = 0;
	public static int count_syn__ON__StmtUnMatched = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_63_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_65_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_67_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_69_1 = 0;
	public static int count_inh__ON__Root = 0;
	public static int count_syn__ON__Root = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxRoot_sv_30_1 = 0;
	public static int count_inh__ON__Decl = 0;
	public static int count_syn__ON__Decl = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxDecl_sv_9_1 = 0;
	public static int count_inh__ON__TypeExpr = 0;
	public static int count_syn__ON__TypeExpr = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxDecl_sv_18_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxDecl_sv_21_1 = 0;
	public static int count_local__ON__simple_concretesyntax_P_simple_concretesyntaxDecl_sv_23_1 = 0;
	public static int count_local__ON__simple_concretesyntax_name = 0;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_Expr = simple.concretesyntax.Init.count_syn__ON__Expr++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_Expr = simple.concretesyntax.Init.count_syn__ON__Expr++;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_Stmts = simple.concretesyntax.Init.count_syn__ON__Stmts++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_Stmts = simple.concretesyntax.Init.count_syn__ON__Stmts++;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_Stmt = simple.concretesyntax.Init.count_syn__ON__Stmt++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_Stmt = simple.concretesyntax.Init.count_syn__ON__Stmt++;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched = simple.concretesyntax.Init.count_syn__ON__StmtMatched++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_StmtMatched = simple.concretesyntax.Init.count_syn__ON__StmtMatched++;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_StmtUnMatched = simple.concretesyntax.Init.count_syn__ON__StmtUnMatched++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_StmtUnMatched = simple.concretesyntax.Init.count_syn__ON__StmtUnMatched++;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_Root = simple.concretesyntax.Init.count_syn__ON__Root++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_Root = simple.concretesyntax.Init.count_syn__ON__Root++;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_Decl = simple.concretesyntax.Init.count_syn__ON__Decl++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_Decl = simple.concretesyntax.Init.count_syn__ON__Decl++;
public static final int silver_langutil_unparse__ON__simple_concretesyntax_TypeExpr = simple.concretesyntax.Init.count_syn__ON__TypeExpr++;
public static final int silver_langutil_ast__ON__simple_concretesyntax_TypeExpr = simple.concretesyntax.Init.count_syn__ON__TypeExpr++;
}
