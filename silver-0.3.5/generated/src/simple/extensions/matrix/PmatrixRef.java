package simple.extensions.matrix;

// e::Expr ::= id::Name r::Expr c::Expr 
public final class PmatrixRef extends simple.abstractsyntax.NExpr {

	public static final int i_id = 0;
	public static final int i_r = 1;
	public static final int i_c = 2;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NName.class, simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_matrix_matrixRef;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_id] = new common.Lazy[simple.abstractsyntax.NName.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_c] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public PmatrixRef(final Object c_id, final Object c_r, final Object c_c) {
		this(new Object[]{c_id, c_r, c_c});
	}

	public PmatrixRef(final Object[] args) {
		super(args);
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
	}

	@Override
	public common.Lazy[] getLocalInheritedAttributes(final int key) {
		return localInheritedAttributes[key];
	}

	@Override
	public common.Lazy[] getChildInheritedAttributes(final int key) {
		return childInheritedAttributes[key];
	}

	@Override
	public common.Node getForward(final common.DecoratedNode context) {
		return null;
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
	}

	@Override
	public common.Lazy getLocal(final int key) {
		return localAttributes[key];
	}

	@Override
	public final int getNumberOfLocalAttrs() {
		return num_local_attrs;
	}

	@Override
	public final String getNameOfLocalAttr(final int index) {
		return occurs_local[index];
	}

	@Override
	public String getName() {
		return "simple:extensions:matrix:matrixRef";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = cat(id.pp, brackets(concat([ r.pp, text(", "), c.pp ])))
		simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_id, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pbrackets.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(", ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_c, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }})); } }})); } }})); } }})); } })); } };
		// e.type = floatType()
		simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PfloatType()); } };
		// e.errors := case id.lookup of just(typeExprMatrix()) -> [] | just(t) -> [ err(id.location, "variable \"" ++ id.name ++ "\" is not a Matrix but a " ++ show(100, t.pp)) ] | nothing() -> [ err(id.location, "variable \"" ++ id.name ++ "\" was not declared.") ] end
		if(simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof core.Pjust) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_36 = new common.Thunk<Object>(context) { public final Object doEval() { return (Object)scrutinee.childAsIs(0); } };
 return (common.ConsCell)((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_35 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_t = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)(__SV_LOCAL___sv_tmp_pv_36.eval())); } };
return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_id, simple.abstractsyntax.Init.silver_langutil_location__ON__simple_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("variable \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\" is not a Matrix but a ")), (common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)((common.DecoratedNode)(__SV_LOCAL_t.eval())).synthesized(simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_TypeExpr)); } }}))))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }).eval()); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.extensions.matrix.PtypeExprMatrix) {  return (common.ConsCell)((common.ConsCell)core.Pnil.invoke(new Object[]{})); }scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL___fail_35.eval()));}}.eval(context, (common.DecoratedNode)((common.DecoratedNode)(__SV_LOCAL___sv_tmp_pv_36.eval()))); } }).eval()); }
else if(scrutineeNode instanceof core.Pnothing) {  return (common.ConsCell)((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_id, simple.abstractsyntax.Init.silver_langutil_location__ON__simple_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("variable \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name)), (common.StringCatter)(new common.StringCatter("\" was not declared.")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); }scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at simple:extensions:matrix 'Expr.sv', 14, 14\n"))}));}}.eval(context, (common.DecoratedNode)((core.NMaybe)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_lookup__ON__simple_abstractsyntax_Name)).decorate(context, (common.Lazy[])null)); } });
		// e.errors <- r.errors ++ c.errors
		if(simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_r, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr), context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_c, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr)})); } });
		// e.errors <- case r.type of integerType() -> [] | t -> [ err(locUnknown(), show(100, r.pp) ++ " is supposed to be Integer type") ] end
		if(simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_87 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_t = new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)); } };
return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter(" is supposed to be Integer type"))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }).eval()); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PintegerType) {  return (common.ConsCell)((common.ConsCell)core.Pnil.invoke(new Object[]{})); }scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL___fail_87.eval()));}}.eval(context, (common.DecoratedNode)((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)).decorate(context, (common.Lazy[])null)); } }).eval()); } });
		// e.errors <- case c.type of integerType() -> [] | t -> [ err(locUnknown(), show(100, c.pp) ++ " is supposed to be Integer type") ] end
		if(simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_109 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_t = new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)); } };
return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.extensions.matrix.PmatrixRef.i_c, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter(" is supposed to be Integer type"))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }).eval()); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PintegerType) {  return (common.ConsCell)((common.ConsCell)core.Pnil.invoke(new Object[]{})); }scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL___fail_109.eval()));}}.eval(context, (common.DecoratedNode)((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)).decorate(context, (common.Lazy[])null)); } }).eval()); } });
		// e.c_code = id.name ++ "[" ++ r.c_code ++ "][" ++ c.c_code ++ "]"
		simple.extensions.matrix.PmatrixRef.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("[")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_r).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("][")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PmatrixRef.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter("]"))))))); } };
	}

	public static final common.NodeFactory<PmatrixRef> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PmatrixRef> {

		@Override
		public PmatrixRef invoke(final Object[] children) {
			return new PmatrixRef(children);
		}

	};
}
