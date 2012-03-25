package simple.abstractsyntax;

public final class PappendEnv extends common.FunctionNode {

	public static final int i_e1 = 0;
	public static final int i_e2 = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NEnv.class, simple.abstractsyntax.NEnv.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_appendEnv;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_e1] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	childInheritedAttributes[i_e2] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	}

	public PappendEnv(final Object c_e1, final Object c_e2) {
		this(new Object[]{c_e1, c_e2});
	}

	public PappendEnv(final Object[] args) {
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
		return "simple:abstractsyntax:appendEnv";
	}

	public static simple.abstractsyntax.NEnv invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PappendEnv(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//appendEnv_p(e1, e2)
		 return (simple.abstractsyntax.NEnv)(((simple.abstractsyntax.NEnv)new simple.abstractsyntax.PappendEnv_p(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.PappendEnv.i_e1)), common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.PappendEnv.i_e2)))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:appendEnv", t); }
	}
	public static final common.NodeFactory<simple.abstractsyntax.NEnv> factory = new Factory();

	public static final class Factory extends common.NodeFactory<simple.abstractsyntax.NEnv> {

		@Override
		public simple.abstractsyntax.NEnv invoke(final Object[] args) {
			return PappendEnv.invoke(args);
		}

	};
}
