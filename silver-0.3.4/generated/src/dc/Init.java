package dc;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(dc.Init.preInit) return;

		dc.Init.preInit = true;

		dc.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(dc.Init.init) return;

		dc.Init.setupInheritedAttributes();

		dc.Init.init = true;

		dc.Init.init();
		core.Init.init();

		dc.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(dc.Init.postInit) return;

		dc.Init.postInit = true;

		dc.Init.postInit();
		core.Init.postInit();


		common.Decorator.applyDecorators(dc.NRoot_c.decorators, Proot_c.class);
		common.Decorator.applyDecorators(dc.NLogiOr_c.decorators, PorOp_c.class);
		common.Decorator.applyDecorators(dc.NLogiAnd_c.decorators, PandOp_c.class);
		common.Decorator.applyDecorators(dc.NCmpe_c.decorators, PnotEqualTo_c.class);
		common.Decorator.applyDecorators(dc.NCmpe_c.decorators, PequalTo_c.class);
		common.Decorator.applyDecorators(dc.NCmplg_c.decorators, PlessThan_c.class);
		common.Decorator.applyDecorators(dc.NCmplg_c.decorators, PlessThanOrEqualTo_c.class);
		common.Decorator.applyDecorators(dc.NCmplg_c.decorators, PgreaterThan_c.class);
		common.Decorator.applyDecorators(dc.NCmplg_c.decorators, PgreaterThanOrEqualTo_c.class);
		common.Decorator.applyDecorators(dc.NExpr_c.decorators, Padd_c.class);
		common.Decorator.applyDecorators(dc.NExpr_c.decorators, Psub_c.class);
		common.Decorator.applyDecorators(dc.NTerm_c.decorators, Pmul_c.class);
		common.Decorator.applyDecorators(dc.NTerm_c.decorators, Pdiv_c.class);
		common.Decorator.applyDecorators(dc.NPhrase_c.decorators, Ppow_c.class);
		common.Decorator.applyDecorators(dc.NLogiOr_c.decorators, PLogiOrLogiAnd_c.class);
		common.Decorator.applyDecorators(dc.NLogiAnd_c.decorators, PLogiAndCmpe_c.class);
		common.Decorator.applyDecorators(dc.NCmpe_c.decorators, PCmpeCmlg_c.class);
		common.Decorator.applyDecorators(dc.NCmplg_c.decorators, PCmplgExpr_c.class);
		common.Decorator.applyDecorators(dc.NExpr_c.decorators, PexprTerm_c.class);
		common.Decorator.applyDecorators(dc.NTerm_c.decorators, PtermPhrase_c.class);
		common.Decorator.applyDecorators(dc.NPhrase_c.decorators, PphraseFactor_c.class);
		common.Decorator.applyDecorators(dc.NFactor_c.decorators, PFactorLogiNot_c.class);
		common.Decorator.applyDecorators(dc.NLogiNot_c.decorators, Pnested_c.class);
		common.Decorator.applyDecorators(dc.NLogiNot_c.decorators, PintegerConstant_c.class);
		common.Decorator.applyDecorators(dc.NRoot.decorators, Proot.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PlessThan.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PlessThanOrEqualTo.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PgreaterThan.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PgreaterThanOrEqualTo.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PequalTo.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PnotEqualTo.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PandOp.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PorOp.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PnotOp.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, Padd.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, Psub.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, Pmul.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, Pdiv.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, Ppow.class);
		common.Decorator.applyDecorators(dc.NExpr.decorators, PintegerConstant.class);
	}

	private static void setupInheritedAttributes(){
		dc.Pmain.occurs_local[dc.Init.args__ON__dc_main] = "dc:main:local:args";
		//	local attribute result::ParseResult<Root_c>;
		dc.Pmain.localInheritedAttributes[dc.Init.result__ON__dc_main] = new common.Lazy[core.NParseResult.num_inh_attrs];
		dc.Pmain.occurs_local[dc.Init.result__ON__dc_main] = "dc:main:local:result";
		//	local attribute r_cst::Root_c;
		dc.Pmain.localInheritedAttributes[dc.Init.r_cst__ON__dc_main] = new common.Lazy[dc.NRoot_c.num_inh_attrs];
		dc.Pmain.occurs_local[dc.Init.r_cst__ON__dc_main] = "dc:main:local:r_cst";
		//	local attribute r_ast::Root;
		dc.Pmain.localInheritedAttributes[dc.Init.r_ast__ON__dc_main] = new common.Lazy[dc.NRoot.num_inh_attrs];
		dc.Pmain.occurs_local[dc.Init.r_ast__ON__dc_main] = "dc:main:local:r_ast";
		dc.Pmain.occurs_local[dc.Init.print_success__ON__dc_main] = "dc:main:local:print_success";
		dc.Pmain.occurs_local[dc.Init.print_failure__ON__dc_main] = "dc:main:local:print_failure";
		dc.NRoot_c.occurs_syn[dc.Init.dc_pp__ON__dc_Root_c] = "dc:pp";
		dc.NRoot_c.occurs_syn[dc.Init.dc_ast_Root__ON__dc_Root_c] = "dc:ast_Root";
		dc.NLogiOr_c.occurs_syn[dc.Init.dc_pp__ON__dc_LogiOr_c] = "dc:pp";
		dc.NLogiOr_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_LogiOr_c] = "dc:ast_Expr";
		dc.NLogiAnd_c.occurs_syn[dc.Init.dc_pp__ON__dc_LogiAnd_c] = "dc:pp";
		dc.NLogiAnd_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_LogiAnd_c] = "dc:ast_Expr";
		dc.NCmpe_c.occurs_syn[dc.Init.dc_pp__ON__dc_Cmpe_c] = "dc:pp";
		dc.NCmpe_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_Cmpe_c] = "dc:ast_Expr";
		dc.NCmplg_c.occurs_syn[dc.Init.dc_pp__ON__dc_Cmplg_c] = "dc:pp";
		dc.NCmplg_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_Cmplg_c] = "dc:ast_Expr";
		dc.NExpr_c.occurs_syn[dc.Init.dc_pp__ON__dc_Expr_c] = "dc:pp";
		dc.NExpr_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_Expr_c] = "dc:ast_Expr";
		dc.NTerm_c.occurs_syn[dc.Init.dc_pp__ON__dc_Term_c] = "dc:pp";
		dc.NTerm_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_Term_c] = "dc:ast_Expr";
		dc.NPhrase_c.occurs_syn[dc.Init.dc_pp__ON__dc_Phrase_c] = "dc:pp";
		dc.NPhrase_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_Phrase_c] = "dc:ast_Expr";
		dc.NFactor_c.occurs_syn[dc.Init.dc_pp__ON__dc_Factor_c] = "dc:pp";
		dc.NFactor_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_Factor_c] = "dc:ast_Expr";
		dc.NLogiNot_c.occurs_syn[dc.Init.dc_pp__ON__dc_LogiNot_c] = "dc:pp";
		dc.NLogiNot_c.occurs_syn[dc.Init.dc_ast_Expr__ON__dc_LogiNot_c] = "dc:ast_Expr";
		dc.NRoot.occurs_syn[dc.Init.dc_pp__ON__dc_Root] = "dc:pp";
		dc.NRoot.occurs_syn[dc.Init.dc_value__ON__dc_Root] = "dc:value";
		dc.NExpr.occurs_syn[dc.Init.dc_pp__ON__dc_Expr] = "dc:pp";
		dc.NExpr.occurs_syn[dc.Init.dc_value__ON__dc_Expr] = "dc:value";
		dc.NRoot.occurs_syn[dc.Init.dc_bpp__ON__dc_Root] = "dc:bpp";
		dc.NExpr.occurs_syn[dc.Init.dc_bpp__ON__dc_Expr] = "dc:bpp";
		dc.NExpr.occurs_inh[dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = "dc:enclosingOpPrecedence";
		dc.NExpr.occurs_inh[dc.Init.dc_leftOrRight__ON__dc_Expr] = "dc:leftOrRight";
		dc.PorOp.occurs_local[dc.Init.ourPrecedence__ON__dc_orOp] = "dc:orOp:local:ourPrecedence";
		dc.PorOp.occurs_local[dc.Init.ourAssociation__ON__dc_orOp] = "dc:orOp:local:ourAssociation";
		dc.PandOp.occurs_local[dc.Init.ourPrecedence__ON__dc_andOp] = "dc:andOp:local:ourPrecedence";
		dc.PandOp.occurs_local[dc.Init.ourAssociation__ON__dc_andOp] = "dc:andOp:local:ourAssociation";
		dc.PnotOp.occurs_local[dc.Init.ourPrecedence__ON__dc_notOp] = "dc:notOp:local:ourPrecedence";
		dc.PnotOp.occurs_local[dc.Init.ourAssociation__ON__dc_notOp] = "dc:notOp:local:ourAssociation";
		dc.PequalTo.occurs_local[dc.Init.ourPrecedence__ON__dc_equalTo] = "dc:equalTo:local:ourPrecedence";
		dc.PequalTo.occurs_local[dc.Init.ourAssociation__ON__dc_equalTo] = "dc:equalTo:local:ourAssociation";
		dc.PnotEqualTo.occurs_local[dc.Init.ourPrecedence__ON__dc_notEqualTo] = "dc:notEqualTo:local:ourPrecedence";
		dc.PnotEqualTo.occurs_local[dc.Init.ourAssociation__ON__dc_notEqualTo] = "dc:notEqualTo:local:ourAssociation";
		dc.PlessThan.occurs_local[dc.Init.ourPrecedence__ON__dc_lessThan] = "dc:lessThan:local:ourPrecedence";
		dc.PlessThan.occurs_local[dc.Init.ourAssociation__ON__dc_lessThan] = "dc:lessThan:local:ourAssociation";
		dc.PlessThanOrEqualTo.occurs_local[dc.Init.ourPrecedence__ON__dc_lessThanOrEqualTo] = "dc:lessThanOrEqualTo:local:ourPrecedence";
		dc.PlessThanOrEqualTo.occurs_local[dc.Init.ourAssociation__ON__dc_lessThanOrEqualTo] = "dc:lessThanOrEqualTo:local:ourAssociation";
		dc.PgreaterThan.occurs_local[dc.Init.ourPrecedence__ON__dc_greaterThan] = "dc:greaterThan:local:ourPrecedence";
		dc.PgreaterThan.occurs_local[dc.Init.ourAssociation__ON__dc_greaterThan] = "dc:greaterThan:local:ourAssociation";
		dc.PgreaterThanOrEqualTo.occurs_local[dc.Init.ourPrecedence__ON__dc_greaterThanOrEqualTo] = "dc:greaterThanOrEqualTo:local:ourPrecedence";
		dc.PgreaterThanOrEqualTo.occurs_local[dc.Init.ourAssociation__ON__dc_greaterThanOrEqualTo] = "dc:greaterThanOrEqualTo:local:ourAssociation";
		dc.Pdiv.occurs_local[dc.Init.ourPrecedence__ON__dc_div] = "dc:div:local:ourPrecedence";
		dc.Pdiv.occurs_local[dc.Init.ourAssociation__ON__dc_div] = "dc:div:local:ourAssociation";
		dc.Ppow.occurs_local[dc.Init.ourPrecedence__ON__dc_pow] = "dc:pow:local:ourPrecedence";
		dc.Ppow.occurs_local[dc.Init.ourAssociation__ON__dc_pow] = "dc:pow:local:ourAssociation";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION main IOVal<Integer> ::= largs::Decorated core:List<String> ioin::IO 
		// args = implode(" ", largs)
		dc.Pmain.localAttributes[dc.Init.args__ON__dc_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Pimplode.invoke(new Object[]{(new common.StringCatter(" ")), context.childAsIsLazy(dc.Pmain.i_largs)})); } };
		// result = parse(args, "<<args>>")
		dc.Pmain.localAttributes[dc.Init.result__ON__dc_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NParseResult)dc.Pparse.invoke(new Object[]{context.localAsIsLazy(dc.Init.args__ON__dc_main), (new common.StringCatter("<<args>>"))})); } };
		// r_cst = result.parseTree
		dc.Pmain.localAttributes[dc.Init.r_cst__ON__dc_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NRoot_c)context.localDecorated(dc.Init.result__ON__dc_main).synthesized(core.Init.core_parseTree__ON__core_ParseResult)); } };
		// r_ast = r_cst.ast_Root
		dc.Pmain.localAttributes[dc.Init.r_ast__ON__dc_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NRoot)context.localDecorated(dc.Init.r_cst__ON__dc_main).synthesized(dc.Init.dc_ast_Root__ON__dc_Root_c)); } };
		// print_success = print("Command line expression: " ++ args ++ "\n\n" ++ "CST pretty print: " ++ r_cst.pp ++ "\n\n" ++ "AST pretty print: " ++ r_ast.pp ++ "\n\n" ++ "AST better pretty print: " ++ r_ast.bpp ++ "\n\n" ++ "Value: " ++ toString(r_ast.value) ++ "\n\n", ioin)
		dc.Pmain.localAttributes[dc.Init.print_success__ON__dc_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.Pprint.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Command line expression: ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(dc.Init.args__ON__dc_main)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("CST pretty print: ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(dc.Init.r_cst__ON__dc_main).synthesized(dc.Init.dc_pp__ON__dc_Root_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("AST pretty print: ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(dc.Init.r_ast__ON__dc_main).synthesized(dc.Init.dc_pp__ON__dc_Root)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("AST better pretty print: ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(dc.Init.r_ast__ON__dc_main).synthesized(dc.Init.dc_bpp__ON__dc_Root)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("Value: ")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(String.valueOf(((Integer)context.localDecorated(dc.Init.r_ast__ON__dc_main).synthesized(dc.Init.dc_value__ON__dc_Root))))), (common.StringCatter)(new common.StringCatter("\n\n")))))))))))))))); } }, context.childAsIsLazy(dc.Pmain.i_ioin)})); } };
		// print_failure = print("Encountered a parse error:\n" ++ result.parseErrors ++ "\n", ioin)
		dc.Pmain.localAttributes[dc.Init.print_failure__ON__dc_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.Pprint.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Encountered a parse error:\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(dc.Init.result__ON__dc_main).synthesized(core.Init.core_parseErrors__ON__core_ParseResult)), (common.StringCatter)(new common.StringCatter("\n")))); } }, context.childAsIsLazy(dc.Pmain.i_ioin)})); } };
		dc.Proot_c.initProductionAttributeDefinitions();
		dc.PorOp_c.initProductionAttributeDefinitions();
		dc.PandOp_c.initProductionAttributeDefinitions();
		dc.PnotEqualTo_c.initProductionAttributeDefinitions();
		dc.PequalTo_c.initProductionAttributeDefinitions();
		dc.PlessThan_c.initProductionAttributeDefinitions();
		dc.PlessThanOrEqualTo_c.initProductionAttributeDefinitions();
		dc.PgreaterThan_c.initProductionAttributeDefinitions();
		dc.PgreaterThanOrEqualTo_c.initProductionAttributeDefinitions();
		dc.Padd_c.initProductionAttributeDefinitions();
		dc.Psub_c.initProductionAttributeDefinitions();
		dc.Pmul_c.initProductionAttributeDefinitions();
		dc.Pdiv_c.initProductionAttributeDefinitions();
		dc.Ppow_c.initProductionAttributeDefinitions();
		dc.PLogiOrLogiAnd_c.initProductionAttributeDefinitions();
		dc.PLogiAndCmpe_c.initProductionAttributeDefinitions();
		dc.PCmpeCmlg_c.initProductionAttributeDefinitions();
		dc.PCmplgExpr_c.initProductionAttributeDefinitions();
		dc.PexprTerm_c.initProductionAttributeDefinitions();
		dc.PtermPhrase_c.initProductionAttributeDefinitions();
		dc.PphraseFactor_c.initProductionAttributeDefinitions();
		dc.PFactorLogiNot_c.initProductionAttributeDefinitions();
		dc.Pnested_c.initProductionAttributeDefinitions();
		dc.PintegerConstant_c.initProductionAttributeDefinitions();
		dc.Proot.initProductionAttributeDefinitions();
		//FUNCTION toInteger Integer ::= b::Boolean 
		dc.PlessThan.initProductionAttributeDefinitions();
		dc.PlessThanOrEqualTo.initProductionAttributeDefinitions();
		dc.PgreaterThan.initProductionAttributeDefinitions();
		dc.PgreaterThanOrEqualTo.initProductionAttributeDefinitions();
		dc.PequalTo.initProductionAttributeDefinitions();
		dc.PnotEqualTo.initProductionAttributeDefinitions();
		//FUNCTION toBoolean Boolean ::= i::Integer 
		dc.PandOp.initProductionAttributeDefinitions();
		dc.PorOp.initProductionAttributeDefinitions();
		dc.PnotOp.initProductionAttributeDefinitions();
		dc.Padd.initProductionAttributeDefinitions();
		dc.Psub.initProductionAttributeDefinitions();
		dc.Pmul.initProductionAttributeDefinitions();
		dc.Pdiv.initProductionAttributeDefinitions();
		//FUNCTION pow_helper Integer ::= base::Integer ex::Integer 
		dc.Ppow.initProductionAttributeDefinitions();
		dc.PintegerConstant.initProductionAttributeDefinitions();
		//FUNCTION wrapInParens Boolean ::= enclosingPrecedence::Integer thisPrecedence::Integer thisPosition::String opAssociativity::String 
		//ASPECT PRODUCTION root r ::= e::Expr 
		// r.bpp = e.bpp
		dc.Proot.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.Proot.i_e).synthesized(dc.Init.dc_bpp__ON__dc_Expr)); } };
		// e.enclosingOpPrecedence = 0
		dc.Proot.childInheritedAttributes[dc.Proot.i_e][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)0); } };
		// e.leftOrRight = "none"
		dc.Proot.childInheritedAttributes[dc.Proot.i_e][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("none")); } };
		//ASPECT PRODUCTION orOp or ::= l::Expr r::Expr 
		// ourPrecedence = 1
		dc.PorOp.localAttributes[dc.Init.ourPrecedence__ON__dc_orOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)1); } };
		// ourAssociation = "left"
		dc.PorOp.localAttributes[dc.Init.ourAssociation__ON__dc_orOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// or.bpp = if wrapInParens(or.enclosingOpPrecedence, ourPrecedence, or.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " || " ++ r.bpp ++ ")" else l.bpp ++ " || " ++ r.bpp
		dc.PorOp.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_orOp), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_orOp)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PorOp.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" || ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PorOp.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PorOp.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" || ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PorOp.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PorOp.childInheritedAttributes[dc.PorOp.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_orOp)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PorOp.childInheritedAttributes[dc.PorOp.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_orOp)); } };
		// l.leftOrRight = "left"
		dc.PorOp.childInheritedAttributes[dc.PorOp.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PorOp.childInheritedAttributes[dc.PorOp.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION andOp and ::= l::Expr r::Expr 
		// ourPrecedence = 2
		dc.PandOp.localAttributes[dc.Init.ourPrecedence__ON__dc_andOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)2); } };
		// ourAssociation = "left"
		dc.PandOp.localAttributes[dc.Init.ourAssociation__ON__dc_andOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// and.bpp = if wrapInParens(and.enclosingOpPrecedence, ourPrecedence, and.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " && " ++ r.bpp ++ ")" else l.bpp ++ " && " ++ r.bpp
		dc.PandOp.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_andOp), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_andOp)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PandOp.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" && ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PandOp.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PandOp.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" && ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PandOp.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PandOp.childInheritedAttributes[dc.PandOp.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_andOp)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PandOp.childInheritedAttributes[dc.PandOp.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_andOp)); } };
		// l.leftOrRight = "left"
		dc.PandOp.childInheritedAttributes[dc.PandOp.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PandOp.childInheritedAttributes[dc.PandOp.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION notOp not ::= e::Expr 
		// ourPrecedence = 8
		dc.PnotOp.localAttributes[dc.Init.ourPrecedence__ON__dc_notOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)8); } };
		// ourAssociation = "right"
		dc.PnotOp.localAttributes[dc.Init.ourAssociation__ON__dc_notOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		// not.bpp = if wrapInParens(not.enclosingOpPrecedence, ourPrecedence, not.leftOrRight, ourAssociation) then "(! " ++ e.bpp ++ ")" else "! " ++ e.bpp
		dc.PnotOp.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_notOp), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_notOp)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(! ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotOp.i_e).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))) : new common.StringCatter((common.StringCatter)(new common.StringCatter("! ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotOp.i_e).synthesized(dc.Init.dc_bpp__ON__dc_Expr)))); } };
		// e.enclosingOpPrecedence = ourPrecedence
		dc.PnotOp.childInheritedAttributes[dc.PnotOp.i_e][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_notOp)); } };
		// e.leftOrRight = "right"
		dc.PnotOp.childInheritedAttributes[dc.PnotOp.i_e][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION equalTo eq ::= l::Expr r::Expr 
		// ourPrecedence = 3
		dc.PequalTo.localAttributes[dc.Init.ourPrecedence__ON__dc_equalTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)3); } };
		// ourAssociation = "left"
		dc.PequalTo.localAttributes[dc.Init.ourAssociation__ON__dc_equalTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// eq.bpp = if wrapInParens(eq.enclosingOpPrecedence, ourPrecedence, eq.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " == " ++ r.bpp ++ ")" else l.bpp ++ " == " ++ r.bpp
		dc.PequalTo.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_equalTo), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_equalTo)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PequalTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" == ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PequalTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PequalTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" == ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PequalTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PequalTo.childInheritedAttributes[dc.PequalTo.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_equalTo)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PequalTo.childInheritedAttributes[dc.PequalTo.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_equalTo)); } };
		// l.leftOrRight = "left"
		dc.PequalTo.childInheritedAttributes[dc.PequalTo.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PequalTo.childInheritedAttributes[dc.PequalTo.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION notEqualTo ne ::= l::Expr r::Expr 
		// ourPrecedence = 3
		dc.PnotEqualTo.localAttributes[dc.Init.ourPrecedence__ON__dc_notEqualTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)3); } };
		// ourAssociation = "left"
		dc.PnotEqualTo.localAttributes[dc.Init.ourAssociation__ON__dc_notEqualTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// ne.bpp = if wrapInParens(ne.enclosingOpPrecedence, ourPrecedence, ne.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " != " ++ r.bpp ++ ")" else l.bpp ++ " != " ++ r.bpp
		dc.PnotEqualTo.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_notEqualTo), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_notEqualTo)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotEqualTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" != ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotEqualTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotEqualTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" != ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotEqualTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PnotEqualTo.childInheritedAttributes[dc.PnotEqualTo.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_notEqualTo)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PnotEqualTo.childInheritedAttributes[dc.PnotEqualTo.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_notEqualTo)); } };
		// l.leftOrRight = "left"
		dc.PnotEqualTo.childInheritedAttributes[dc.PnotEqualTo.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PnotEqualTo.childInheritedAttributes[dc.PnotEqualTo.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION lessThan less ::= l::Expr r::Expr 
		// ourPrecedence = 4
		dc.PlessThan.localAttributes[dc.Init.ourPrecedence__ON__dc_lessThan] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)4); } };
		// ourAssociation = "left"
		dc.PlessThan.localAttributes[dc.Init.ourAssociation__ON__dc_lessThan] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// less.bpp = if wrapInParens(less.enclosingOpPrecedence, ourPrecedence, less.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " < " ++ r.bpp ++ ")" else l.bpp ++ " < " ++ r.bpp
		dc.PlessThan.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_lessThan), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_lessThan)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThan.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" < ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThan.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThan.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" < ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThan.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PlessThan.childInheritedAttributes[dc.PlessThan.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_lessThan)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PlessThan.childInheritedAttributes[dc.PlessThan.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_lessThan)); } };
		// l.leftOrRight = "left"
		dc.PlessThan.childInheritedAttributes[dc.PlessThan.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PlessThan.childInheritedAttributes[dc.PlessThan.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION lessThanOrEqualTo le ::= l::Expr r::Expr 
		// ourPrecedence = 4
		dc.PlessThanOrEqualTo.localAttributes[dc.Init.ourPrecedence__ON__dc_lessThanOrEqualTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)4); } };
		// ourAssociation = "left"
		dc.PlessThanOrEqualTo.localAttributes[dc.Init.ourAssociation__ON__dc_lessThanOrEqualTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// le.bpp = if wrapInParens(le.enclosingOpPrecedence, ourPrecedence, le.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " <= " ++ r.bpp ++ ")" else l.bpp ++ " <= " ++ r.bpp
		dc.PlessThanOrEqualTo.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_lessThanOrEqualTo), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_lessThanOrEqualTo)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThanOrEqualTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" <= ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThanOrEqualTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThanOrEqualTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" <= ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PlessThanOrEqualTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PlessThanOrEqualTo.childInheritedAttributes[dc.PlessThanOrEqualTo.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_lessThanOrEqualTo)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PlessThanOrEqualTo.childInheritedAttributes[dc.PlessThanOrEqualTo.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_lessThanOrEqualTo)); } };
		// l.leftOrRight = "left"
		dc.PlessThanOrEqualTo.childInheritedAttributes[dc.PlessThanOrEqualTo.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PlessThanOrEqualTo.childInheritedAttributes[dc.PlessThanOrEqualTo.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION greaterThan greater ::= l::Expr r::Expr 
		// ourPrecedence = 4
		dc.PgreaterThan.localAttributes[dc.Init.ourPrecedence__ON__dc_greaterThan] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)4); } };
		// ourAssociation = "left"
		dc.PgreaterThan.localAttributes[dc.Init.ourAssociation__ON__dc_greaterThan] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// greater.bpp = if wrapInParens(greater.enclosingOpPrecedence, ourPrecedence, greater.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " > " ++ r.bpp ++ ")" else l.bpp ++ " > " ++ r.bpp
		dc.PgreaterThan.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_greaterThan), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_greaterThan)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThan.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" > ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThan.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThan.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" > ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThan.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PgreaterThan.childInheritedAttributes[dc.PgreaterThan.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_greaterThan)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PgreaterThan.childInheritedAttributes[dc.PgreaterThan.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_greaterThan)); } };
		// l.leftOrRight = "left"
		dc.PgreaterThan.childInheritedAttributes[dc.PgreaterThan.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PgreaterThan.childInheritedAttributes[dc.PgreaterThan.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION greaterThanOrEqualTo ge ::= l::Expr r::Expr 
		// ourPrecedence = 4
		dc.PgreaterThanOrEqualTo.localAttributes[dc.Init.ourPrecedence__ON__dc_greaterThanOrEqualTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)4); } };
		// ourAssociation = "left"
		dc.PgreaterThanOrEqualTo.localAttributes[dc.Init.ourAssociation__ON__dc_greaterThanOrEqualTo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// ge.bpp = if wrapInParens(ge.enclosingOpPrecedence, ourPrecedence, ge.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " >= " ++ r.bpp ++ ")" else l.bpp ++ " >= " ++ r.bpp
		dc.PgreaterThanOrEqualTo.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_greaterThanOrEqualTo), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_greaterThanOrEqualTo)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThanOrEqualTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" >= ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThanOrEqualTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThanOrEqualTo.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" >= ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThanOrEqualTo.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.PgreaterThanOrEqualTo.childInheritedAttributes[dc.PgreaterThanOrEqualTo.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_greaterThanOrEqualTo)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.PgreaterThanOrEqualTo.childInheritedAttributes[dc.PgreaterThanOrEqualTo.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_greaterThanOrEqualTo)); } };
		// l.leftOrRight = "left"
		dc.PgreaterThanOrEqualTo.childInheritedAttributes[dc.PgreaterThanOrEqualTo.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.PgreaterThanOrEqualTo.childInheritedAttributes[dc.PgreaterThanOrEqualTo.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION add sum ::= l::Expr r::Expr 
		// sum.bpp = if wrapInParens(sum.enclosingOpPrecedence, 1, sum.leftOrRight, "left") then "(" ++ l.bpp ++ " + " ++ r.bpp ++ ")" else l.bpp ++ " + " ++ r.bpp
		dc.Padd.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), Integer.valueOf((int)1), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), (new common.StringCatter("left"))})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Padd.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" + ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Padd.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Padd.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" + ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Padd.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = 5
		dc.Padd.childInheritedAttributes[dc.Padd.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)5); } };
		// r.enclosingOpPrecedence = 5
		dc.Padd.childInheritedAttributes[dc.Padd.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)5); } };
		// l.leftOrRight = "left"
		dc.Padd.childInheritedAttributes[dc.Padd.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.Padd.childInheritedAttributes[dc.Padd.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION sub dff ::= l::Expr r::Expr 
		// dff.bpp = if wrapInParens(dff.enclosingOpPrecedence, 1, dff.leftOrRight, "left") then "(" ++ l.bpp ++ " - " ++ r.bpp ++ ")" else l.bpp ++ " - " ++ r.bpp
		dc.Psub.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), Integer.valueOf((int)1), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), (new common.StringCatter("left"))})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" - ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" - ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = 5
		dc.Psub.childInheritedAttributes[dc.Psub.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)5); } };
		// r.enclosingOpPrecedence = 5
		dc.Psub.childInheritedAttributes[dc.Psub.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)5); } };
		// l.leftOrRight = "left"
		dc.Psub.childInheritedAttributes[dc.Psub.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.Psub.childInheritedAttributes[dc.Psub.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION mul prd ::= l::Expr r::Expr 
		// prd.bpp = if wrapInParens(prd.enclosingOpPrecedence, 2, prd.leftOrRight, "left") then "(" ++ l.bpp ++ " * " ++ r.bpp ++ ")" else l.bpp ++ " * " ++ r.bpp
		dc.Pmul.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), Integer.valueOf((int)2), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), (new common.StringCatter("left"))})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pmul.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" * ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pmul.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pmul.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" * ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pmul.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = 6
		dc.Pmul.childInheritedAttributes[dc.Pmul.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)6); } };
		// r.enclosingOpPrecedence = 6
		dc.Pmul.childInheritedAttributes[dc.Pmul.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)6); } };
		// l.leftOrRight = "left"
		dc.Pmul.childInheritedAttributes[dc.Pmul.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.Pmul.childInheritedAttributes[dc.Pmul.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION div quo ::= l::Expr r::Expr 
		// ourPrecedence = 6
		dc.Pdiv.localAttributes[dc.Init.ourPrecedence__ON__dc_div] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)6); } };
		// ourAssociation = "left"
		dc.Pdiv.localAttributes[dc.Init.ourAssociation__ON__dc_div] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// quo.bpp = if wrapInParens(quo.enclosingOpPrecedence, ourPrecedence, quo.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " / " ++ r.bpp ++ ")" else l.bpp ++ " / " ++ r.bpp
		dc.Pdiv.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_div), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_div)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pdiv.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" / ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pdiv.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pdiv.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" / ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pdiv.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.Pdiv.childInheritedAttributes[dc.Pdiv.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_div)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.Pdiv.childInheritedAttributes[dc.Pdiv.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_div)); } };
		// l.leftOrRight = "left"
		dc.Pdiv.childInheritedAttributes[dc.Pdiv.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.Pdiv.childInheritedAttributes[dc.Pdiv.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION pow exp ::= l::Expr r::Expr 
		// ourPrecedence = 7
		dc.Ppow.localAttributes[dc.Init.ourPrecedence__ON__dc_pow] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)7); } };
		// ourAssociation = "right"
		dc.Ppow.localAttributes[dc.Init.ourAssociation__ON__dc_pow] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		// exp.bpp = if wrapInParens(exp.enclosingOpPrecedence, ourPrecedence, exp.leftOrRight, ourAssociation) then "(" ++ l.bpp ++ " ^ " ++ r.bpp ++ ")" else l.bpp ++ " ^ " ++ r.bpp
		dc.Ppow.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)dc.PwrapInParens.invoke(new Object[]{context.contextInheritedLazy(dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourPrecedence__ON__dc_pow), context.contextInheritedLazy(dc.Init.dc_leftOrRight__ON__dc_Expr), context.localAsIsLazy(dc.Init.ourAssociation__ON__dc_pow)})) ? new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Ppow.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ^ ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Ppow.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Ppow.i_l).synthesized(dc.Init.dc_bpp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ^ ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Ppow.i_r).synthesized(dc.Init.dc_bpp__ON__dc_Expr))))); } };
		// l.enclosingOpPrecedence = ourPrecedence
		dc.Ppow.childInheritedAttributes[dc.Ppow.i_l][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_pow)); } };
		// r.enclosingOpPrecedence = ourPrecedence
		dc.Ppow.childInheritedAttributes[dc.Ppow.i_r][dc.Init.dc_enclosingOpPrecedence__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.localAsIs(dc.Init.ourPrecedence__ON__dc_pow)); } };
		// l.leftOrRight = "left"
		dc.Ppow.childInheritedAttributes[dc.Ppow.i_l][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("left")); } };
		// r.leftOrRight = "right"
		dc.Ppow.childInheritedAttributes[dc.Ppow.i_r][dc.Init.dc_leftOrRight__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("right")); } };
		//ASPECT PRODUCTION integerConstant e ::= i::IntLit_t 
		// e.bpp = i.lexeme
		dc.PintegerConstant.synthesizedAttributes[dc.Init.dc_bpp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((common.TerminalRecord)context.childAsIs(dc.PintegerConstant.i_i)).lexeme); } };
	}

	public static int count_local__ON__dc_parse = 0;
	public static int count_local__ON__dc_main = 0;
	public static int count_inh__ON__Root_c = 0;
	public static int count_syn__ON__Root_c = 0;
	public static int count_local__ON__dc_root_c = 0;
	public static int count_inh__ON__LogiOr_c = 0;
	public static int count_syn__ON__LogiOr_c = 0;
	public static int count_inh__ON__LogiAnd_c = 0;
	public static int count_syn__ON__LogiAnd_c = 0;
	public static int count_inh__ON__Cmpe_c = 0;
	public static int count_syn__ON__Cmpe_c = 0;
	public static int count_inh__ON__Cmplg_c = 0;
	public static int count_syn__ON__Cmplg_c = 0;
	public static int count_inh__ON__Expr_c = 0;
	public static int count_syn__ON__Expr_c = 0;
	public static int count_inh__ON__Term_c = 0;
	public static int count_syn__ON__Term_c = 0;
	public static int count_inh__ON__Phrase_c = 0;
	public static int count_syn__ON__Phrase_c = 0;
	public static int count_inh__ON__Factor_c = 0;
	public static int count_syn__ON__Factor_c = 0;
	public static int count_inh__ON__LogiNot_c = 0;
	public static int count_syn__ON__LogiNot_c = 0;
	public static int count_local__ON__dc_orOp_c = 0;
	public static int count_local__ON__dc_andOp_c = 0;
	public static int count_local__ON__dc_notEqualTo_c = 0;
	public static int count_local__ON__dc_equalTo_c = 0;
	public static int count_local__ON__dc_lessThan_c = 0;
	public static int count_local__ON__dc_lessThanOrEqualTo_c = 0;
	public static int count_local__ON__dc_greaterThan_c = 0;
	public static int count_local__ON__dc_greaterThanOrEqualTo_c = 0;
	public static int count_local__ON__dc_add_c = 0;
	public static int count_local__ON__dc_sub_c = 0;
	public static int count_local__ON__dc_mul_c = 0;
	public static int count_local__ON__dc_div_c = 0;
	public static int count_local__ON__dc_pow_c = 0;
	public static int count_local__ON__dc_LogiOrLogiAnd_c = 0;
	public static int count_local__ON__dc_LogiAndCmpe_c = 0;
	public static int count_local__ON__dc_CmpeCmlg_c = 0;
	public static int count_local__ON__dc_CmplgExpr_c = 0;
	public static int count_local__ON__dc_exprTerm_c = 0;
	public static int count_local__ON__dc_termPhrase_c = 0;
	public static int count_local__ON__dc_phraseFactor_c = 0;
	public static int count_local__ON__dc_FactorLogiNot_c = 0;
	public static int count_local__ON__dc_nested_c = 0;
	public static int count_local__ON__dc_integerConstant_c = 0;
	public static int count_inh__ON__Root = 0;
	public static int count_syn__ON__Root = 0;
	public static int count_local__ON__dc_root = 0;
	public static int count_local__ON__dc_toInteger = 0;
	public static int count_inh__ON__Expr = 0;
	public static int count_syn__ON__Expr = 0;
	public static int count_local__ON__dc_lessThan = 0;
	public static int count_local__ON__dc_lessThanOrEqualTo = 0;
	public static int count_local__ON__dc_greaterThan = 0;
	public static int count_local__ON__dc_greaterThanOrEqualTo = 0;
	public static int count_local__ON__dc_equalTo = 0;
	public static int count_local__ON__dc_notEqualTo = 0;
	public static int count_local__ON__dc_toBoolean = 0;
	public static int count_local__ON__dc_andOp = 0;
	public static int count_local__ON__dc_orOp = 0;
	public static int count_local__ON__dc_notOp = 0;
	public static int count_local__ON__dc_add = 0;
	public static int count_local__ON__dc_sub = 0;
	public static int count_local__ON__dc_mul = 0;
	public static int count_local__ON__dc_div = 0;
	public static int count_local__ON__dc_pow_helper = 0;
	public static int count_local__ON__dc_pow = 0;
	public static int count_local__ON__dc_integerConstant = 0;
	public static int count_local__ON__dc_wrapInParens = 0;
public static final int args__ON__dc_main = dc.Init.count_local__ON__dc_main++;
public static final int result__ON__dc_main = dc.Init.count_local__ON__dc_main++;
public static final int r_cst__ON__dc_main = dc.Init.count_local__ON__dc_main++;
public static final int r_ast__ON__dc_main = dc.Init.count_local__ON__dc_main++;
public static final int print_success__ON__dc_main = dc.Init.count_local__ON__dc_main++;
public static final int print_failure__ON__dc_main = dc.Init.count_local__ON__dc_main++;
public static final int dc_pp__ON__dc_Root_c = dc.Init.count_syn__ON__Root_c++;
public static final int dc_ast_Root__ON__dc_Root_c = dc.Init.count_syn__ON__Root_c++;
public static final int dc_pp__ON__dc_LogiOr_c = dc.Init.count_syn__ON__LogiOr_c++;
public static final int dc_ast_Expr__ON__dc_LogiOr_c = dc.Init.count_syn__ON__LogiOr_c++;
public static final int dc_pp__ON__dc_LogiAnd_c = dc.Init.count_syn__ON__LogiAnd_c++;
public static final int dc_ast_Expr__ON__dc_LogiAnd_c = dc.Init.count_syn__ON__LogiAnd_c++;
public static final int dc_pp__ON__dc_Cmpe_c = dc.Init.count_syn__ON__Cmpe_c++;
public static final int dc_ast_Expr__ON__dc_Cmpe_c = dc.Init.count_syn__ON__Cmpe_c++;
public static final int dc_pp__ON__dc_Cmplg_c = dc.Init.count_syn__ON__Cmplg_c++;
public static final int dc_ast_Expr__ON__dc_Cmplg_c = dc.Init.count_syn__ON__Cmplg_c++;
public static final int dc_pp__ON__dc_Expr_c = dc.Init.count_syn__ON__Expr_c++;
public static final int dc_ast_Expr__ON__dc_Expr_c = dc.Init.count_syn__ON__Expr_c++;
public static final int dc_pp__ON__dc_Term_c = dc.Init.count_syn__ON__Term_c++;
public static final int dc_ast_Expr__ON__dc_Term_c = dc.Init.count_syn__ON__Term_c++;
public static final int dc_pp__ON__dc_Phrase_c = dc.Init.count_syn__ON__Phrase_c++;
public static final int dc_ast_Expr__ON__dc_Phrase_c = dc.Init.count_syn__ON__Phrase_c++;
public static final int dc_pp__ON__dc_Factor_c = dc.Init.count_syn__ON__Factor_c++;
public static final int dc_ast_Expr__ON__dc_Factor_c = dc.Init.count_syn__ON__Factor_c++;
public static final int dc_pp__ON__dc_LogiNot_c = dc.Init.count_syn__ON__LogiNot_c++;
public static final int dc_ast_Expr__ON__dc_LogiNot_c = dc.Init.count_syn__ON__LogiNot_c++;
public static final int dc_pp__ON__dc_Root = dc.Init.count_syn__ON__Root++;
public static final int dc_value__ON__dc_Root = dc.Init.count_syn__ON__Root++;
public static final int dc_pp__ON__dc_Expr = dc.Init.count_syn__ON__Expr++;
public static final int dc_value__ON__dc_Expr = dc.Init.count_syn__ON__Expr++;
public static final int dc_bpp__ON__dc_Root = dc.Init.count_syn__ON__Root++;
public static final int dc_bpp__ON__dc_Expr = dc.Init.count_syn__ON__Expr++;
public static final int dc_enclosingOpPrecedence__ON__dc_Expr = dc.Init.count_inh__ON__Expr++;
public static final int dc_leftOrRight__ON__dc_Expr = dc.Init.count_inh__ON__Expr++;
public static final int ourPrecedence__ON__dc_orOp = dc.Init.count_local__ON__dc_orOp++;
public static final int ourAssociation__ON__dc_orOp = dc.Init.count_local__ON__dc_orOp++;
public static final int ourPrecedence__ON__dc_andOp = dc.Init.count_local__ON__dc_andOp++;
public static final int ourAssociation__ON__dc_andOp = dc.Init.count_local__ON__dc_andOp++;
public static final int ourPrecedence__ON__dc_notOp = dc.Init.count_local__ON__dc_notOp++;
public static final int ourAssociation__ON__dc_notOp = dc.Init.count_local__ON__dc_notOp++;
public static final int ourPrecedence__ON__dc_equalTo = dc.Init.count_local__ON__dc_equalTo++;
public static final int ourAssociation__ON__dc_equalTo = dc.Init.count_local__ON__dc_equalTo++;
public static final int ourPrecedence__ON__dc_notEqualTo = dc.Init.count_local__ON__dc_notEqualTo++;
public static final int ourAssociation__ON__dc_notEqualTo = dc.Init.count_local__ON__dc_notEqualTo++;
public static final int ourPrecedence__ON__dc_lessThan = dc.Init.count_local__ON__dc_lessThan++;
public static final int ourAssociation__ON__dc_lessThan = dc.Init.count_local__ON__dc_lessThan++;
public static final int ourPrecedence__ON__dc_lessThanOrEqualTo = dc.Init.count_local__ON__dc_lessThanOrEqualTo++;
public static final int ourAssociation__ON__dc_lessThanOrEqualTo = dc.Init.count_local__ON__dc_lessThanOrEqualTo++;
public static final int ourPrecedence__ON__dc_greaterThan = dc.Init.count_local__ON__dc_greaterThan++;
public static final int ourAssociation__ON__dc_greaterThan = dc.Init.count_local__ON__dc_greaterThan++;
public static final int ourPrecedence__ON__dc_greaterThanOrEqualTo = dc.Init.count_local__ON__dc_greaterThanOrEqualTo++;
public static final int ourAssociation__ON__dc_greaterThanOrEqualTo = dc.Init.count_local__ON__dc_greaterThanOrEqualTo++;
public static final int ourPrecedence__ON__dc_div = dc.Init.count_local__ON__dc_div++;
public static final int ourAssociation__ON__dc_div = dc.Init.count_local__ON__dc_div++;
public static final int ourPrecedence__ON__dc_pow = dc.Init.count_local__ON__dc_pow++;
public static final int ourAssociation__ON__dc_pow = dc.Init.count_local__ON__dc_pow++;
}
