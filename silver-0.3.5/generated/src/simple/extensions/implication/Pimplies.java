package simple.extensions.implication;

// e::Expr ::= l::Expr r::Expr 
public final class Pimplies extends simple.abstractsyntax.NExpr {

	public static final int i_l = 0;
	public static final int i_r = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_implication_implies;
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

	public Pimplies(final Object c_l, final Object c_r) {
		this(new Object[]{c_l, c_r});
	}

	public Pimplies(final Object[] args) {
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
		return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Por(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Pnot(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.extensions.implication.Pimplies.i_l)))); } }, common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.extensions.implication.Pimplies.i_r))));
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
		return "simple:extensions:implication:implies";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = ppoperator(l.pp, "=>", r.pp)
		simple.extensions.implication.Pimplies.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)simple.abstractsyntax.Pppoperator.invoke(new Object[]{context.childSynthesizedLazy(simple.extensions.implication.Pimplies.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), (new common.StringCatter("=>")), context.childSynthesizedLazy(simple.extensions.implication.Pimplies.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})); } };
	}

	public static final common.NodeFactory<Pimplies> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pimplies> {

		@Override
		public Pimplies invoke(final Object[] children) {
			return new Pimplies(children);
		}

	};
}
