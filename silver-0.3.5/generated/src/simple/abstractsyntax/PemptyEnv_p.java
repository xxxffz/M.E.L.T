package simple.abstractsyntax;

// e::Env<a> ::= 
public final class PemptyEnv_p extends simple.abstractsyntax.NEnv {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_emptyEnv_p;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NEnv.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PemptyEnv_p() {
		this(new Object[]{});
	}

	public PemptyEnv_p(final Object[] args) {
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
		return "simple:abstractsyntax:emptyEnv_p";
	}

	static void initProductionAttributeDefinitions() {
		// e.bindings = []
		simple.abstractsyntax.PemptyEnv_p.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } };
	}

	public static final common.NodeFactory<PemptyEnv_p> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PemptyEnv_p> {

		@Override
		public PemptyEnv_p invoke(final Object[] children) {
			return new PemptyEnv_p(children);
		}

	};
}
