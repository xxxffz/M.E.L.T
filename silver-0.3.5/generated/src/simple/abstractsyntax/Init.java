package simple.abstractsyntax;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.abstractsyntax.Init.preInit) return;

		simple.abstractsyntax.Init.preInit = true;

		core.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();

	}

	public static void init(){
		if(simple.abstractsyntax.Init.init) return;

		simple.abstractsyntax.Init.init = true;

		simple.abstractsyntax.Init.setupInheritedAttributes();

		core.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();

		simple.abstractsyntax.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.abstractsyntax.Init.postInit) return;

		simple.abstractsyntax.Init.postInit = true;

		core.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();


		common.Decorator.applyDecorators(simple.abstractsyntax.NName.decorators, Pname.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, PintLit.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, PfloatLit.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, PboolLit.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, PstringLit.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, PvarRef.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Padd.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Psub.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pmul.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pdiv.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Peq.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Plt.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pneq.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Plte.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pgt.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pgte.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pand.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Pnot.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NExpr.decorators, Por.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pfor.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, PdeclStmt.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pblock.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pseq.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, PprintStmt.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pskip.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pwhile.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pifthen.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Pifelse.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NStmt.decorators, Passignment.class);
		common.Decorator.applyDecorators(silver.langutil.NLocation.decorators, PlocUnknown.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NRoot.decorators, ProotStmt.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NDecl.decorators, Pdecl.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NTypeExpr.decorators, PtypeExprInteger.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NTypeExpr.decorators, PtypeExprFloat.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NTypeExpr.decorators, PtypeExprBoolean.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NTypeExpr.decorators, PtypeExprString.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NType.decorators, PintegerType.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NType.decorators, PfloatType.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NType.decorators, PbooleanType.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NType.decorators, PstringType.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NType.decorators, PerrorType.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NEnv.decorators, PemptyEnv_p.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NEnv.decorators, PaddBinding_p.class);
		common.Decorator.applyDecorators(simple.abstractsyntax.NEnv.decorators, PappendEnv_p.class);
	}

	private static void setupInheritedAttributes(){
		simple.abstractsyntax.NName.occurs_syn[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Name] = "silver:langutil:pp";
		simple.abstractsyntax.NName.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name] = "simple:abstractsyntax:name";
		simple.abstractsyntax.NName.occurs_syn[simple.abstractsyntax.Init.silver_langutil_location__ON__simple_abstractsyntax_Name] = "silver:langutil:location";
		simple.abstractsyntax.NName.occurs_inh[simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Name] = "simple:abstractsyntax:env";
		simple.abstractsyntax.NName.decorators.add(simple.abstractsyntax.Denv.singleton);
		simple.abstractsyntax.NName.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_lookup__ON__simple_abstractsyntax_Name] = "simple:abstractsyntax:lookup";
		simple.abstractsyntax.NExpr.occurs_syn[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = "silver:langutil:pp";
		simple.abstractsyntax.NExpr.occurs_inh[simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Expr] = "simple:abstractsyntax:env";
		simple.abstractsyntax.NExpr.decorators.add(simple.abstractsyntax.Denv.singleton);
		simple.abstractsyntax.NExpr.occurs_syn[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = "silver:langutil:errors";
		simple.abstractsyntax.NStmt.occurs_syn[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt] = "silver:langutil:pp";
		simple.abstractsyntax.NStmt.occurs_inh[simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Stmt] = "simple:abstractsyntax:env";
		simple.abstractsyntax.NStmt.decorators.add(simple.abstractsyntax.Denv.singleton);
		simple.abstractsyntax.NStmt.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt] = "simple:abstractsyntax:defs";
		simple.abstractsyntax.NStmt.occurs_syn[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = "silver:langutil:errors";
		simple.abstractsyntax.NExpr.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = "simple:abstractsyntax:type";
		simple.abstractsyntax.NRoot.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Root] = "simple:abstractsyntax:c_code";
		simple.abstractsyntax.NStmt.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = "simple:abstractsyntax:c_code";
		simple.abstractsyntax.NDecl.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Decl] = "simple:abstractsyntax:c_code";
		simple.abstractsyntax.NExpr.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = "simple:abstractsyntax:c_code";
		simple.abstractsyntax.NTypeExpr.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr] = "simple:abstractsyntax:c_code";
		simple.abstractsyntax.NRoot.occurs_syn[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Root] = "silver:langutil:pp";
		simple.abstractsyntax.NRoot.occurs_syn[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Root] = "silver:langutil:errors";
		simple.abstractsyntax.NDecl.occurs_syn[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Decl] = "silver:langutil:pp";
		simple.abstractsyntax.NDecl.occurs_inh[simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Decl] = "simple:abstractsyntax:env";
		simple.abstractsyntax.NDecl.decorators.add(simple.abstractsyntax.Denv.singleton);
		simple.abstractsyntax.NDecl.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Decl] = "simple:abstractsyntax:defs";
		simple.abstractsyntax.NDecl.occurs_syn[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Decl] = "silver:langutil:errors";
		simple.abstractsyntax.NTypeExpr.occurs_syn[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_TypeExpr] = "silver:langutil:pp";
		simple.abstractsyntax.NTypeExpr.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_TypeExpr] = "simple:abstractsyntax:type";
		simple.abstractsyntax.NType.occurs_syn[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Type] = "silver:langutil:pp";
		simple.abstractsyntax.Plookup.occurs_local[simple.abstractsyntax.Init.matches__ON__simple_abstractsyntax_lookup] = "simple:abstractsyntax:lookup:local:matches";
		simple.abstractsyntax.NEnv.occurs_syn[simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env] = "simple:abstractsyntax:bindings";
		simple.abstractsyntax.PallMatches_helper.occurs_local[simple.abstractsyntax.Init.thisMatch__ON__simple_abstractsyntax_allMatches_helper] = "simple:abstractsyntax:allMatches_helper:local:thisMatch";
	}

	private static void initProductionAttributeDefinitions(){
		simple.abstractsyntax.Pname.initProductionAttributeDefinitions();
		simple.abstractsyntax.PintLit.initProductionAttributeDefinitions();
		simple.abstractsyntax.PfloatLit.initProductionAttributeDefinitions();
		simple.abstractsyntax.PboolLit.initProductionAttributeDefinitions();
		simple.abstractsyntax.PstringLit.initProductionAttributeDefinitions();
		simple.abstractsyntax.PvarRef.initProductionAttributeDefinitions();
		//FUNCTION ppoperator Document ::= d1::Document op::String d2::Document 
		simple.abstractsyntax.Padd.initProductionAttributeDefinitions();
		simple.abstractsyntax.Psub.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pmul.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pdiv.initProductionAttributeDefinitions();
		simple.abstractsyntax.Peq.initProductionAttributeDefinitions();
		simple.abstractsyntax.Plt.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pneq.initProductionAttributeDefinitions();
		simple.abstractsyntax.Plte.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pgt.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pgte.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pand.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pnot.initProductionAttributeDefinitions();
		simple.abstractsyntax.Por.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pfor.initProductionAttributeDefinitions();
		//FUNCTION ppblock Document ::= s::Stmt 
		simple.abstractsyntax.PdeclStmt.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pblock.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pseq.initProductionAttributeDefinitions();
		simple.abstractsyntax.PprintStmt.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pskip.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pwhile.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pifthen.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pifelse.initProductionAttributeDefinitions();
		simple.abstractsyntax.Passignment.initProductionAttributeDefinitions();
		simple.abstractsyntax.PlocUnknown.initProductionAttributeDefinitions();
		//ASPECT PRODUCTION intLit e ::= l::Location s::String 
		// e.type = integerType()
		simple.abstractsyntax.PintLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PintegerType()); } };
		//ASPECT PRODUCTION floatLit e ::= l::Location s::String 
		// e.type = floatType()
		simple.abstractsyntax.PfloatLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PfloatType()); } };
		//ASPECT PRODUCTION boolLit e ::= l::Location s::String 
		// e.type = booleanType()
		simple.abstractsyntax.PboolLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PbooleanType()); } };
		//ASPECT PRODUCTION stringLit e ::= l::Location s::String 
		// e.type = stringType()
		simple.abstractsyntax.PstringLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PstringType()); } };
		//ASPECT PRODUCTION varRef e ::= id::Name 
		// e.type = case id.lookup of just(dte) -> dte.type | nothing() -> errorType() end
		simple.abstractsyntax.PvarRef.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.DecoratedNode, simple.abstractsyntax.NType>() { public final simple.abstractsyntax.NType eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof core.Pjust) { final common.Thunk<Object> __SV_LOCAL___sv_sc_279dte = new common.Thunk<Object>(context) { public final Object doEval() { return (Object)scrutinee.childAsIs(0); } };
 return (simple.abstractsyntax.NType)((simple.abstractsyntax.NType)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_dte = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)(__SV_LOCAL___sv_sc_279dte.eval())); } };
return ((simple.abstractsyntax.NType)((common.DecoratedNode)(__SV_LOCAL_dte.eval())).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_TypeExpr)); } }).eval()); }
else if(scrutineeNode instanceof core.Pnothing) {  return (simple.abstractsyntax.NType)((simple.abstractsyntax.NType)new simple.abstractsyntax.PerrorType()); }scrutineeIter = scrutineeIter.forward();}return ((simple.abstractsyntax.NType)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at simple:abstractsyntax 'TypeChecking.sv', 68, 11\n"))}));}}.eval(context, (common.DecoratedNode)((core.NMaybe)context.childDecorated(simple.abstractsyntax.PvarRef.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_lookup__ON__simple_abstractsyntax_Name)).decorate(context, (common.Lazy[])null)); } };
		//ASPECT PRODUCTION add e ::= l::Expr r::Expr 
		// e.type = resolveNumericTypes(l.type, r.type)
		simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)simple.abstractsyntax.PresolveNumericTypes.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr), context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})); } };
		// e.errors <- (if isNumeric(l.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, l.pp) ++ "\" must be of type Integer or Float.\n") ]) ++ (if isNumeric(r.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, r.pp) ++ "\" must be of type Integer or Float.\n") ])
		if(simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }})); } });
		//ASPECT PRODUCTION sub e ::= l::Expr r::Expr 
		// e.type = resolveNumericTypes(l.type, r.type)
		simple.abstractsyntax.Psub.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)simple.abstractsyntax.PresolveNumericTypes.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Psub.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr), context.childSynthesizedLazy(simple.abstractsyntax.Psub.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})); } };
		// e.errors <- (if isNumeric(l.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, l.pp) ++ "\" must be of type Integer or Float.\n") ]) ++ (if isNumeric(r.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, r.pp) ++ "\" must be of type Integer or Float.\n") ])
		if(simple.abstractsyntax.Psub.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Psub.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Psub.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Psub.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Psub.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Psub.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Psub.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }})); } });
		//ASPECT PRODUCTION mul e ::= l::Expr r::Expr 
		// e.type = resolveNumericTypes(l.type, r.type)
		simple.abstractsyntax.Pmul.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)simple.abstractsyntax.PresolveNumericTypes.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pmul.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr), context.childSynthesizedLazy(simple.abstractsyntax.Pmul.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})); } };
		// e.errors <- (if isNumeric(l.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, l.pp) ++ "\" must be of type Integer or Float.\n") ]) ++ (if isNumeric(r.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, r.pp) ++ "\" must be of type Integer or Float.\n") ])
		if(simple.abstractsyntax.Pmul.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Pmul.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Pmul.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pmul.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pmul.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pmul.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pmul.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }})); } });
		//ASPECT PRODUCTION div e ::= l::Expr r::Expr 
		// e.type = resolveNumericTypes(l.type, r.type)
		simple.abstractsyntax.Pdiv.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)simple.abstractsyntax.PresolveNumericTypes.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pdiv.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr), context.childSynthesizedLazy(simple.abstractsyntax.Pdiv.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})); } };
		// e.errors <- (if isNumeric(l.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, l.pp) ++ "\" must be of type Integer or Float.\n") ]) ++ (if isNumeric(r.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, r.pp) ++ "\" must be of type Integer or Float.\n") ])
		if(simple.abstractsyntax.Pdiv.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Pdiv.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Pdiv.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pdiv.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pdiv.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pdiv.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pdiv.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }})); } });
		//FUNCTION resolveNumericTypes Type ::= lType::Type rType::Type 
		//FUNCTION isNumeric Boolean ::= t::Type 
		//ASPECT PRODUCTION eq e ::= l::Expr r::Expr 
		// e.type = booleanType()
		simple.abstractsyntax.Peq.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PbooleanType()); } };
		// e.errors <- (if isNumeric(l.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, l.pp) ++ "\" must be of type Integer or Float.\n") ]) ++ (if isNumeric(r.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, r.pp) ++ "\" must be of type Integer or Float.\n") ])
		if(simple.abstractsyntax.Peq.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Peq.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Peq.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Peq.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Peq.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Peq.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Peq.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }})); } });
		//ASPECT PRODUCTION lt e ::= l::Expr r::Expr 
		// e.type = booleanType()
		simple.abstractsyntax.Plt.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PbooleanType()); } };
		// e.errors <- (if isNumeric(l.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, l.pp) ++ "\" must be of type Integer or Float.\n") ]) ++ (if isNumeric(r.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, r.pp) ++ "\" must be of type Integer or Float.\n") ])
		if(simple.abstractsyntax.Plt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Plt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Plt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Plt.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Plt.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisNumeric.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Plt.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Plt.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Integer or Float.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }})); } });
		//ASPECT PRODUCTION and e ::= l::Expr r::Expr 
		// e.type = booleanType()
		simple.abstractsyntax.Pand.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PbooleanType()); } };
		// e.errors <- (if isBoolean(l.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, l.pp) ++ "\" must be of type Boolean.\n") ]) ++ (if isBoolean(r.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, r.pp) ++ "\" must be of type Boolean.\n") ])
		if(simple.abstractsyntax.Pand.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Pand.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Pand.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisBoolean.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pand.i_l, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pand.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Boolean.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)simple.abstractsyntax.PisBoolean.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pand.i_r, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pand.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Boolean.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }})); } });
		//ASPECT PRODUCTION not e ::= ne::Expr 
		// e.type = booleanType()
		simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PbooleanType()); } };
		// e.errors <- if isBoolean(ne.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, ne.pp) ++ "\" must be of type Boolean.\n") ]
		if(simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)simple.abstractsyntax.PisBoolean.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pnot.i_ne, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pnot.i_ne, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Boolean.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } });
		//FUNCTION isBoolean Boolean ::= t::Type 
		//ASPECT PRODUCTION ifthen s ::= c::Expr t::Stmt 
		// s.errors <- if isBoolean(c.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, c.pp) ++ "\" must be of type Boolean.\n") ]
		if(simple.abstractsyntax.Pifthen.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.Pifthen.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.Pifthen.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)simple.abstractsyntax.PisBoolean.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pifthen.i_c, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pifthen.i_c, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Boolean.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } });
		//ASPECT PRODUCTION ifelse s ::= c::Expr t::Stmt e::Stmt 
		// s.errors <- if isBoolean(c.type) then [] else [ err(locUnknown(), "Expression \"" ++ show(100, c.pp) ++ "\" must be of type Boolean.\n") ]
		if(simple.abstractsyntax.Pifelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.Pifelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.Pifelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)simple.abstractsyntax.PisBoolean.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pifelse.i_c, simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Expression \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.abstractsyntax.Pifelse.i_c, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter("\" must be of type Boolean.\n")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } });
		//ASPECT PRODUCTION rootStmt r ::= s::Stmt 
		// r.c_code = "#include <stdio.h>\n\n" ++ "int main() {\n " ++ s.c_code ++ "}\n\n"
		simple.abstractsyntax.ProotStmt.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("#include <stdio.h>\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("int main() {\n ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.ProotStmt.i_s).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt)), (common.StringCatter)(new common.StringCatter("}\n\n"))))); } };
		//ASPECT PRODUCTION declStmt s ::= d::Decl 
		// s.c_code = d.c_code
		simple.abstractsyntax.PdeclStmt.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(simple.abstractsyntax.PdeclStmt.i_d).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Decl)); } };
		//ASPECT PRODUCTION block s ::= body::Stmt 
		// s.c_code = "{\n" ++ body.c_code ++ "}\n"
		simple.abstractsyntax.Pblock.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("{\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pblock.i_body).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt)), (common.StringCatter)(new common.StringCatter("}\n")))); } };
		//ASPECT PRODUCTION seq s ::= s1::Stmt s2::Stmt 
		// s.c_code = s1.c_code ++ s2.c_code
		simple.abstractsyntax.Pseq.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pseq.i_s1).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt)), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pseq.i_s2).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt))); } };
		//ASPECT PRODUCTION printStmt s ::= e::Expr 
		// s.c_code = "printf (\"" ++ case e.type of integerType() -> "%d" | floatType() -> "%f" | booleanType() -> "%d" | stringType() -> "%s" end ++ "\", " ++ e.c_code ++ "); \n"
		simple.abstractsyntax.PprintStmt.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("printf (\"")), (common.StringCatter)new common.StringCatter((common.StringCatter)new common.PatternLazy<common.DecoratedNode, common.StringCatter>() { public final common.StringCatter eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PbooleanType) {  return (common.StringCatter)(new common.StringCatter("%d")); }
else if(scrutineeNode instanceof simple.abstractsyntax.PfloatType) {  return (common.StringCatter)(new common.StringCatter("%f")); }
else if(scrutineeNode instanceof simple.abstractsyntax.PintegerType) {  return (common.StringCatter)(new common.StringCatter("%d")); }
else if(scrutineeNode instanceof simple.abstractsyntax.PstringType) {  return (common.StringCatter)(new common.StringCatter("%s")); }scrutineeIter = scrutineeIter.forward();}return ((common.StringCatter)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at simple:abstractsyntax 'C-trans.sv', 41, 13\n"))}));}}.eval(context, (common.DecoratedNode)((simple.abstractsyntax.NType)context.childDecorated(simple.abstractsyntax.PprintStmt.i_e).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)).decorate(context, (common.Lazy[])null)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\", ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.PprintStmt.i_e).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter("); \n")))))); } };
		//ASPECT PRODUCTION skip s ::= 
		// s.c_code = ""
		simple.abstractsyntax.Pskip.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("")); } };
		//ASPECT PRODUCTION while s ::= c::Expr b::Stmt 
		// s.c_code = "while ( " ++ c.c_code ++ " )\n" ++ b.c_code
		simple.abstractsyntax.Pwhile.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("while ( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pwhile.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" )\n")), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pwhile.i_b).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt))))); } };
		//ASPECT PRODUCTION ifthen s ::= c::Expr t::Stmt 
		// s.c_code = "if ( " ++ c.c_code ++ " )\n" ++ t.c_code
		simple.abstractsyntax.Pifthen.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("if ( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pifthen.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" )\n")), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pifthen.i_t).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt))))); } };
		//ASPECT PRODUCTION ifelse s ::= c::Expr t::Stmt e::Stmt 
		// s.c_code = "if ( " ++ c.c_code ++ " )\n" ++ t.c_code ++ "else \n" ++ e.c_code
		simple.abstractsyntax.Pifelse.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("if ( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pifelse.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" )\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pifelse.i_t).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("else \n")), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pifelse.i_e).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt))))))); } };
		//ASPECT PRODUCTION assignment s ::= id::Name e::Expr 
		// s.c_code = id.name ++ " = " ++ e.c_code ++ "; \n"
		simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Passignment.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" = ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Passignment.i_e).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter("; \n"))))); } };
		//ASPECT PRODUCTION decl d ::= t::TypeExpr id::Name 
		// d.c_code = t.c_code ++ " " ++ id.name ++ "; \n"
		simple.abstractsyntax.Pdecl.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Decl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pdecl.i_t).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pdecl.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name)), (common.StringCatter)(new common.StringCatter("; \n"))))); } };
		//ASPECT PRODUCTION typeExprInteger t ::= 
		// t.c_code = "int"
		simple.abstractsyntax.PtypeExprInteger.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("int")); } };
		//ASPECT PRODUCTION typeExprFloat t ::= 
		// t.c_code = "double"
		simple.abstractsyntax.PtypeExprFloat.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("double")); } };
		//ASPECT PRODUCTION typeExprBoolean t ::= 
		// t.c_code = "int"
		simple.abstractsyntax.PtypeExprBoolean.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("int")); } };
		//ASPECT PRODUCTION typeExprString t ::= 
		// t.c_code = "char *"
		simple.abstractsyntax.PtypeExprString.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("char *")); } };
		//ASPECT PRODUCTION intLit e ::= l::Location s::String 
		// e.c_code = s
		simple.abstractsyntax.PintLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(simple.abstractsyntax.PintLit.i_s)); } };
		//ASPECT PRODUCTION floatLit e ::= l::Location s::String 
		// e.c_code = s
		simple.abstractsyntax.PfloatLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(simple.abstractsyntax.PfloatLit.i_s)); } };
		//ASPECT PRODUCTION boolLit e ::= l::Location s::String 
		// e.c_code = s
		simple.abstractsyntax.PboolLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(simple.abstractsyntax.PboolLit.i_s)); } };
		//ASPECT PRODUCTION stringLit e ::= l::Location s::String 
		// e.c_code = s
		simple.abstractsyntax.PstringLit.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(simple.abstractsyntax.PstringLit.i_s)); } };
		//ASPECT PRODUCTION varRef e ::= id::Name 
		// e.c_code = id.name
		simple.abstractsyntax.PvarRef.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(simple.abstractsyntax.PvarRef.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name)); } };
		//ASPECT PRODUCTION add e ::= l::Expr r::Expr 
		// e.c_code = "(" ++ l.c_code ++ " + " ++ r.c_code ++ ")"
		simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Padd.i_l).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" + ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Padd.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		//ASPECT PRODUCTION sub e ::= l::Expr r::Expr 
		// e.c_code = "(" ++ l.c_code ++ " - " ++ r.c_code ++ ")"
		simple.abstractsyntax.Psub.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Psub.i_l).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" - ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Psub.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		//ASPECT PRODUCTION mul e ::= l::Expr r::Expr 
		// e.c_code = "(" ++ l.c_code ++ " * " ++ r.c_code ++ ")"
		simple.abstractsyntax.Pmul.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pmul.i_l).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" * ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pmul.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		//ASPECT PRODUCTION div e ::= l::Expr r::Expr 
		// e.c_code = "(" ++ l.c_code ++ " / " ++ r.c_code ++ ")"
		simple.abstractsyntax.Pdiv.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pdiv.i_l).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" / ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pdiv.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		//ASPECT PRODUCTION eq e ::= l::Expr r::Expr 
		// e.c_code = "(" ++ l.c_code ++ " == " ++ r.c_code ++ ")"
		simple.abstractsyntax.Peq.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Peq.i_l).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" == ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Peq.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		//ASPECT PRODUCTION lt e ::= l::Expr r::Expr 
		// e.c_code = "(" ++ l.c_code ++ " < " ++ r.c_code ++ ")"
		simple.abstractsyntax.Plt.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Plt.i_l).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" < ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Plt.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		//ASPECT PRODUCTION and e ::= l::Expr r::Expr 
		// e.c_code = "(" ++ l.c_code ++ " && " ++ r.c_code ++ ")"
		simple.abstractsyntax.Pand.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pand.i_l).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" && ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pand.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		//ASPECT PRODUCTION not e ::= ne::Expr 
		// e.c_code = "( !" ++ ne.c_code ++ ")"
		simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( !")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Pnot.i_ne).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))); } };
		simple.abstractsyntax.ProotStmt.initProductionAttributeDefinitions();
		simple.abstractsyntax.Pdecl.initProductionAttributeDefinitions();
		simple.abstractsyntax.PtypeExprInteger.initProductionAttributeDefinitions();
		simple.abstractsyntax.PtypeExprFloat.initProductionAttributeDefinitions();
		simple.abstractsyntax.PtypeExprBoolean.initProductionAttributeDefinitions();
		simple.abstractsyntax.PtypeExprString.initProductionAttributeDefinitions();
		simple.abstractsyntax.PintegerType.initProductionAttributeDefinitions();
		simple.abstractsyntax.PfloatType.initProductionAttributeDefinitions();
		simple.abstractsyntax.PbooleanType.initProductionAttributeDefinitions();
		simple.abstractsyntax.PstringType.initProductionAttributeDefinitions();
		simple.abstractsyntax.PerrorType.initProductionAttributeDefinitions();
		//FUNCTION addBinding Env<a> ::= n::String v::a env::Env<a> 
		//FUNCTION appendEnv Env<a> ::= e1::Env<a> e2::Env<a> 
		//FUNCTION emptyEnv Env<a> ::= 
		//FUNCTION lookup Maybe<a> ::= n::String e::Env<a> 
		// matches = allMatches(n, e)
		simple.abstractsyntax.Plookup.localAttributes[simple.abstractsyntax.Init.matches__ON__simple_abstractsyntax_lookup] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)simple.abstractsyntax.PallMatches.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.Plookup.i_n), common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Plookup.i_e))})); } };
		//FUNCTION allMatches Decorated core:List<a> ::= n::String e::Env<a> 
		simple.abstractsyntax.PemptyEnv_p.initProductionAttributeDefinitions();
		simple.abstractsyntax.PaddBinding_p.initProductionAttributeDefinitions();
		simple.abstractsyntax.PappendEnv_p.initProductionAttributeDefinitions();
		//FUNCTION allMatches_helper Decorated core:List<a> ::= n::String ps::Decorated core:List<Pair<String a>> 
		// thisMatch = if n == head(ps).fst then [ head(ps).snd ] else []
		simple.abstractsyntax.PallMatches_helper.localAttributes[simple.abstractsyntax.Init.thisMatch__ON__simple_abstractsyntax_allMatches_helper] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((common.StringCatter)context.childAsIs(simple.abstractsyntax.PallMatches_helper.i_n)).equals(((common.StringCatter)((core.NPair)core.Phead.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.PallMatches_helper.i_ps)})).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_fst__ON__core_Pair))) ? ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)((core.NPair)core.Phead.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.PallMatches_helper.i_ps)})).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_snd__ON__core_Pair)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})) : ((common.ConsCell)core.Pnil.invoke(new Object[]{}))); } };
	}

	public static int count_inh__ON__Name = 0;
	public static int count_syn__ON__Name = 0;
	public static int count_local__ON__simple_abstractsyntax_name = 0;
	public static int count_inh__ON__Expr = 0;
	public static int count_syn__ON__Expr = 0;
	public static int count_local__ON__simple_abstractsyntax_intLit = 0;
	public static int count_local__ON__simple_abstractsyntax_floatLit = 0;
	public static int count_local__ON__simple_abstractsyntax_boolLit = 0;
	public static int count_local__ON__simple_abstractsyntax_stringLit = 0;
	public static int count_local__ON__simple_abstractsyntax_varRef = 0;
	public static int count_local__ON__simple_abstractsyntax_ppoperator = 0;
	public static int count_local__ON__simple_abstractsyntax_add = 0;
	public static int count_local__ON__simple_abstractsyntax_sub = 0;
	public static int count_local__ON__simple_abstractsyntax_mul = 0;
	public static int count_local__ON__simple_abstractsyntax_div = 0;
	public static int count_local__ON__simple_abstractsyntax_eq = 0;
	public static int count_local__ON__simple_abstractsyntax_lt = 0;
	public static int count_local__ON__simple_abstractsyntax_neq = 0;
	public static int count_local__ON__simple_abstractsyntax_lte = 0;
	public static int count_local__ON__simple_abstractsyntax_gt = 0;
	public static int count_local__ON__simple_abstractsyntax_gte = 0;
	public static int count_local__ON__simple_abstractsyntax_and = 0;
	public static int count_local__ON__simple_abstractsyntax_not = 0;
	public static int count_local__ON__simple_abstractsyntax_or = 0;
	public static int count_local__ON__simple_abstractsyntax_for = 0;
	public static int count_inh__ON__Stmt = 0;
	public static int count_syn__ON__Stmt = 0;
	public static int count_local__ON__simple_abstractsyntax_ppblock = 0;
	public static int count_local__ON__simple_abstractsyntax_declStmt = 0;
	public static int count_local__ON__simple_abstractsyntax_block = 0;
	public static int count_local__ON__simple_abstractsyntax_seq = 0;
	public static int count_local__ON__simple_abstractsyntax_printStmt = 0;
	public static int count_local__ON__simple_abstractsyntax_skip = 0;
	public static int count_local__ON__simple_abstractsyntax_while = 0;
	public static int count_local__ON__simple_abstractsyntax_ifthen = 0;
	public static int count_local__ON__simple_abstractsyntax_ifelse = 0;
	public static int count_local__ON__simple_abstractsyntax_assignment = 0;
	public static int count_local__ON__simple_abstractsyntax_locUnknown = 0;
	public static int count_local__ON__simple_abstractsyntax_resolveNumericTypes = 0;
	public static int count_local__ON__simple_abstractsyntax_isNumeric = 0;
	public static int count_local__ON__simple_abstractsyntax_isBoolean = 0;
	public static int count_inh__ON__Root = 0;
	public static int count_syn__ON__Root = 0;
	public static int count_local__ON__simple_abstractsyntax_rootStmt = 0;
	public static int count_inh__ON__Decl = 0;
	public static int count_syn__ON__Decl = 0;
	public static int count_local__ON__simple_abstractsyntax_decl = 0;
	public static int count_inh__ON__TypeExpr = 0;
	public static int count_syn__ON__TypeExpr = 0;
	public static int count_local__ON__simple_abstractsyntax_typeExprInteger = 0;
	public static int count_local__ON__simple_abstractsyntax_typeExprFloat = 0;
	public static int count_local__ON__simple_abstractsyntax_typeExprBoolean = 0;
	public static int count_local__ON__simple_abstractsyntax_typeExprString = 0;
	public static int count_inh__ON__Type = 0;
	public static int count_syn__ON__Type = 0;
	public static int count_local__ON__simple_abstractsyntax_integerType = 0;
	public static int count_local__ON__simple_abstractsyntax_floatType = 0;
	public static int count_local__ON__simple_abstractsyntax_booleanType = 0;
	public static int count_local__ON__simple_abstractsyntax_stringType = 0;
	public static int count_local__ON__simple_abstractsyntax_errorType = 0;
	public static int count_inh__ON__Env = 0;
	public static int count_syn__ON__Env = 0;
	public static int count_local__ON__simple_abstractsyntax_addBinding = 0;
	public static int count_local__ON__simple_abstractsyntax_appendEnv = 0;
	public static int count_local__ON__simple_abstractsyntax_emptyEnv = 0;
	public static int count_local__ON__simple_abstractsyntax_lookup = 0;
	public static int count_local__ON__simple_abstractsyntax_allMatches = 0;
	public static int count_local__ON__simple_abstractsyntax_emptyEnv_p = 0;
	public static int count_local__ON__simple_abstractsyntax_addBinding_p = 0;
	public static int count_local__ON__simple_abstractsyntax_appendEnv_p = 0;
	public static int count_local__ON__simple_abstractsyntax_allMatches_helper = 0;
public static final int silver_langutil_pp__ON__simple_abstractsyntax_Name = simple.abstractsyntax.Init.count_syn__ON__Name++;
public static final int simple_abstractsyntax_name__ON__simple_abstractsyntax_Name = simple.abstractsyntax.Init.count_syn__ON__Name++;
public static final int silver_langutil_location__ON__simple_abstractsyntax_Name = simple.abstractsyntax.Init.count_syn__ON__Name++;
public static final int simple_abstractsyntax_env__ON__simple_abstractsyntax_Name = simple.abstractsyntax.Init.count_inh__ON__Name++;
public static final int simple_abstractsyntax_lookup__ON__simple_abstractsyntax_Name = simple.abstractsyntax.Init.count_syn__ON__Name++;
public static final int silver_langutil_pp__ON__simple_abstractsyntax_Expr = simple.abstractsyntax.Init.count_syn__ON__Expr++;
public static final int simple_abstractsyntax_env__ON__simple_abstractsyntax_Expr = simple.abstractsyntax.Init.count_inh__ON__Expr++;
public static final int silver_langutil_errors__ON__simple_abstractsyntax_Expr = simple.abstractsyntax.Init.count_syn__ON__Expr++;
public static final int silver_langutil_pp__ON__simple_abstractsyntax_Stmt = simple.abstractsyntax.Init.count_syn__ON__Stmt++;
public static final int simple_abstractsyntax_env__ON__simple_abstractsyntax_Stmt = simple.abstractsyntax.Init.count_inh__ON__Stmt++;
public static final int simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt = simple.abstractsyntax.Init.count_syn__ON__Stmt++;
public static final int silver_langutil_errors__ON__simple_abstractsyntax_Stmt = simple.abstractsyntax.Init.count_syn__ON__Stmt++;
public static final int simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr = simple.abstractsyntax.Init.count_syn__ON__Expr++;
public static final int simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Root = simple.abstractsyntax.Init.count_syn__ON__Root++;
public static final int simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt = simple.abstractsyntax.Init.count_syn__ON__Stmt++;
public static final int simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Decl = simple.abstractsyntax.Init.count_syn__ON__Decl++;
public static final int simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr = simple.abstractsyntax.Init.count_syn__ON__Expr++;
public static final int simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr = simple.abstractsyntax.Init.count_syn__ON__TypeExpr++;
public static final int silver_langutil_pp__ON__simple_abstractsyntax_Root = simple.abstractsyntax.Init.count_syn__ON__Root++;
public static final int silver_langutil_errors__ON__simple_abstractsyntax_Root = simple.abstractsyntax.Init.count_syn__ON__Root++;
public static final int silver_langutil_pp__ON__simple_abstractsyntax_Decl = simple.abstractsyntax.Init.count_syn__ON__Decl++;
public static final int simple_abstractsyntax_env__ON__simple_abstractsyntax_Decl = simple.abstractsyntax.Init.count_inh__ON__Decl++;
public static final int simple_abstractsyntax_defs__ON__simple_abstractsyntax_Decl = simple.abstractsyntax.Init.count_syn__ON__Decl++;
public static final int silver_langutil_errors__ON__simple_abstractsyntax_Decl = simple.abstractsyntax.Init.count_syn__ON__Decl++;
public static final int silver_langutil_pp__ON__simple_abstractsyntax_TypeExpr = simple.abstractsyntax.Init.count_syn__ON__TypeExpr++;
public static final int simple_abstractsyntax_type__ON__simple_abstractsyntax_TypeExpr = simple.abstractsyntax.Init.count_syn__ON__TypeExpr++;
public static final int silver_langutil_pp__ON__simple_abstractsyntax_Type = simple.abstractsyntax.Init.count_syn__ON__Type++;
public static final int matches__ON__simple_abstractsyntax_lookup = simple.abstractsyntax.Init.count_local__ON__simple_abstractsyntax_lookup++;
public static final int simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env = simple.abstractsyntax.Init.count_syn__ON__Env++;
public static final int thisMatch__ON__simple_abstractsyntax_allMatches_helper = simple.abstractsyntax.Init.count_local__ON__simple_abstractsyntax_allMatches_helper++;
}
