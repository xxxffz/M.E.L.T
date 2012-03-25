package simple.abstractsyntax;

public final class PaddBinding extends common.FunctionNode {

	public static final int i_n = 0;
	public static final int i_v = 1;
	public static final int i_env = 2;

	public static final Class<?> childTypes[] = {common.StringCatter.class, Object.class, simple.abstractsyntax.NEnv.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_addBinding;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_env] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	}

	public PaddBinding(final Object c_n, final Object c_v, final Object c_env) {
		this(new Object[]{c_n, c_v, c_env});
	}

	public PaddBinding(final Object[] args) {
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
		return "simple:abstractsyntax:addBinding";
	}

	public static simple.abstractsyntax.NEnv invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PaddBinding(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//addBinding_p(n, v, env)
		 return (simple.abstractsyntax.NEnv)(((simple.abstractsyntax.NEnv)new simple.abstractsyntax.PaddBinding_p(context.childAsIsLazy(simple.abstractsyntax.PaddBinding.i_n), context.childAsIsLazy(simple.abstractsyntax.PaddBinding.i_v), common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.PaddBinding.i_env)))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:addBinding", t); }
	}
	public static final common.NodeFactory<simple.abstractsyntax.NEnv> factory = new Factory();

	public static final class Factory extends common.NodeFactory<simple.abstractsyntax.NEnv> {

		@Override
		public simple.abstractsyntax.NEnv invoke(final Object[] args) {
			return PaddBinding.invoke(args);
		}

	};
}
