package simple.extensions.expr_let;

// e::Expr ::= s::Stmt e1::Expr 
public final class PletExpr extends simple.abstractsyntax.NExpr {

	public static final int i_s = 0;
	public static final int i_e1 = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NStmt.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_expr_let_letExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_s] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	childInheritedAttributes[i_e1] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public PletExpr(final Object c_s, final Object c_e1) {
		this(new Object[]{c_s, c_e1});
	}

	public PletExpr(final Object[] args) {
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
		return "simple:extensions:expr_let:letExpr";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = box(concat([ text("let "), box(s.pp), line(), text(" in "), box(e1.pp), line(), text("end") ]))
		simple.extensions.expr_let.PletExpr.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pbox(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("let ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pbox(context.childSynthesizedLazy(simple.extensions.expr_let.PletExpr.i_s, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(" in ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pbox(context.childSynthesizedLazy(simple.extensions.expr_let.PletExpr.i_e1, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("end")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }})); } }})); } }})); } }})); } }})); } }})); } }})); } })); } };
		// e.type = e1.type
		simple.extensions.expr_let.PletExpr.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)context.childDecorated(simple.extensions.expr_let.PletExpr.i_e1).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_Expr)); } };
		// e.errors := s.errors ++ e1.errors
		if(simple.extensions.expr_let.PletExpr.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.extensions.expr_let.PletExpr.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.extensions.expr_let.PletExpr.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.expr_let.PletExpr.i_s, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt), context.childSynthesizedLazy(simple.extensions.expr_let.PletExpr.i_e1, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr)})); } });
		// e1.env = appendEnv(s.defs, e.env)
		simple.extensions.expr_let.PletExpr.childInheritedAttributes[simple.extensions.expr_let.PletExpr.i_e1][simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PappendEnv.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.expr_let.PletExpr.i_s, simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt), context.contextInheritedLazy(simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Expr)})); } };
		// e.c_code = "({" ++ s.c_code ++ e1.c_code ++ ";})"
		simple.extensions.expr_let.PletExpr.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("({")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_let.PletExpr.i_s).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Stmt)), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_let.PletExpr.i_e1).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(";})"))))); } };
	}

	public static final common.NodeFactory<PletExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PletExpr> {

		@Override
		public PletExpr invoke(final Object[] children) {
			return new PletExpr(children);
		}

	};
}
