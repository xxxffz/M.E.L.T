package simple.abstractsyntax;

public final class PemptyEnv extends common.FunctionNode {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_emptyEnv;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PemptyEnv() {
		this(new Object[]{});
	}

	public PemptyEnv(final Object[] args) {
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
		return "simple:abstractsyntax:emptyEnv";
	}

	public static simple.abstractsyntax.NEnv invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PemptyEnv(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//emptyEnv_p()
		 return (simple.abstractsyntax.NEnv)(((simple.abstractsyntax.NEnv)new simple.abstractsyntax.PemptyEnv_p()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:emptyEnv", t); }
	}
	public static final common.NodeFactory<simple.abstractsyntax.NEnv> factory = new Factory();

	public static final class Factory extends common.NodeFactory<simple.abstractsyntax.NEnv> {

		@Override
		public simple.abstractsyntax.NEnv invoke(final Object[] args) {
			return PemptyEnv.invoke(args);
		}

	};
}
