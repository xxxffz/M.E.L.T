package simple.abstractsyntax;

// e::Expr ::= l::Expr r::Expr 
public final class Plte extends simple.abstractsyntax.NExpr {

	public static final int i_l = 0;
	public static final int i_r = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_lte;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public Plte(final Object c_l, final Object c_r) {
		this(new Object[]{c_l, c_r});
	}

	public Plte(final Object[] args) {
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
		return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Por(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Plt(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Plte.i_l)), common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Plte.i_r)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Peq(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Plte.i_l)), common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Plte.i_r)))); } }));
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
		return "simple:abstractsyntax:lte";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = ppoperator(l.pp, "<=", r.pp)
		simple.abstractsyntax.Plte.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)simple.abstractsyntax.Pppoperator.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Plte.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), (new common.StringCatter("<=")), context.childSynthesizedLazy(simple.abstractsyntax.Plte.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})); } };
	}

	public static final common.NodeFactory<Plte> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Plte> {

		@Override
		public Plte invoke(final Object[] children) {
			return new Plte(children);
		}

	};
}
