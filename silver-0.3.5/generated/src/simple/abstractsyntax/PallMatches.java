package simple.abstractsyntax;

public final class PallMatches extends common.FunctionNode {

	public static final int i_n = 0;
	public static final int i_e = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, simple.abstractsyntax.NEnv.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_allMatches;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_e] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	}

	public PallMatches(final Object c_n, final Object c_e) {
		this(new Object[]{c_n, c_e});
	}

	public PallMatches(final Object[] args) {
		super(args);
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
		return "simple:abstractsyntax:allMatches";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PallMatches(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//allMatches_helper(n, e.bindings)
		 return (common.ConsCell)(((common.ConsCell)simple.abstractsyntax.PallMatches_helper.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.PallMatches.i_n), context.childSynthesizedLazy(simple.abstractsyntax.PallMatches.i_e, simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env)})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:allMatches", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PallMatches.invoke(args);
		}

	};
}
