package simple.extensions.expr_if;

// e::Expr ::= c::Expr t::Expr e1::Expr 
public final class Pifthenelse extends simple.abstractsyntax.NExpr {

	public static final int i_c = 0;
	public static final int i_t = 1;
	public static final int i_e1 = 2;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_expr_if_ifthenelse;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_c] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_e1] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public Pifthenelse(final Object c_c, final Object c_t, final Object c_e1) {
		this(new Object[]{c_c, c_t, c_e1});
	}

	public Pifthenelse(final Object[] args) {
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
		return "simple:extensions:expr_if:ifthenelse";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = parens(box(concat([ text("if "), c.pp, line(), text("then "), t.pp, line(), text("else "), e1.pp ])))
		simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pbox(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("if ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_c, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("then ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_t, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("else ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_e1, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }})); } }})); } }})); } }})); } }})); } }})); } }})); } }})); } })); } }})); } };
		// e.type = t.type
		simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.expr_if.Pifthenelse.i_t).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)); } };
		// e.errors := c.errors ++ t.errors ++ e1.errors
		if(simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_c, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_t, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr), context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_e1, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr)})); } }})); } });
		// e.errors <- if show(100, t.type.pp) == show(100, e1.type.pp) then [] else [ err(locUnknown(), "if with condition " ++ show(100, c.pp) ++ " has mismatching branch types") ]
		if(simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.expr_if.Pifthenelse.i_t).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)).decorate(context, (common.Lazy[])null).synthesized(simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Type)); } }})).equals(((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.expr_if.Pifthenelse.i_e1).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)).decorate(context, (common.Lazy[])null).synthesized(simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Type)); } }}))) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("if with condition ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_c, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})), (common.StringCatter)(new common.StringCatter(" has mismatching branch types")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } });
		// e.errors <- case c.type of booleanType() -> [] | _ -> [ err(locUnknown(), "if has non-boolean condition " ++ show(100, c.pp)) ] end
		if(simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_294 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new simple.abstractsyntax.PlocUnknown()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("if has non-boolean condition ")), (common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), context.childSynthesizedLazy(simple.extensions.expr_if.Pifthenelse.i_c, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)}))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PbooleanType) {  return (common.ConsCell)((common.ConsCell)core.Pnil.invoke(new Object[]{})); }scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL___fail_294.eval()));}}.eval(context, (common.DecoratedNode)((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.expr_if.Pifthenelse.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)).decorate(context, (common.Lazy[])null)); } }).eval()); } });
		// e.c_code = "(" ++ c.c_code ++ " ? " ++ t.c_code ++ " : " ++ e1.c_code ++ ")"
		simple.extensions.expr_if.Pifthenelse.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_if.Pifthenelse.i_c).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ? ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_if.Pifthenelse.i_t).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" : ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_if.Pifthenelse.i_e1).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))))); } };
	}

	public static final common.NodeFactory<Pifthenelse> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pifthenelse> {

		@Override
		public Pifthenelse invoke(final Object[] children) {
			return new Pifthenelse(children);
		}

	};
}
