package simple.abstractsyntax;

// e::Env<a> ::= n::String v::a env::Env<a> 
public final class PaddBinding_p extends simple.abstractsyntax.NEnv {

	public static final int i_n = 0;
	public static final int i_v = 1;
	public static final int i_env = 2;

	public static final Class<?> childTypes[] = {common.StringCatter.class, Object.class, simple.abstractsyntax.NEnv.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_addBinding_p;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NEnv.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_env] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	}

	public PaddBinding_p(final Object c_n, final Object c_v, final Object c_env) {
		this(new Object[]{c_n, c_v, c_env});
	}

	public PaddBinding_p(final Object[] args) {
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
		return "simple:abstractsyntax:addBinding_p";
	}

	static void initProductionAttributeDefinitions() {
		// e.bindings = cons(pair(n, v), env.bindings)
		simple.abstractsyntax.PaddBinding_p.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NPair)new core.Ppair(context.childAsIsLazy(simple.abstractsyntax.PaddBinding_p.i_n), context.childAsIsLazy(simple.abstractsyntax.PaddBinding_p.i_v))); } }, context.childSynthesizedLazy(simple.abstractsyntax.PaddBinding_p.i_env, simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env)})); } };
	}

	public static final common.NodeFactory<PaddBinding_p> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PaddBinding_p> {

		@Override
		public PaddBinding_p invoke(final Object[] children) {
			return new PaddBinding_p(children);
		}

	};
}
