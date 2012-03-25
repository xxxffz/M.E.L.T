package silver.langutil.pp;

public final class Pgroupnest extends common.FunctionNode {

	public static final int i_n = 0;
	public static final int i_inner = 1;

	public static final Class<?> childTypes[] = {Integer.class, silver.langutil.pp.NDocument.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_groupnest;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_inner] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	}

	public Pgroupnest(final Object c_n, final Object c_inner) {
		this(new Object[]{c_n, c_inner});
	}

	public Pgroupnest(final Object[] args) {
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
		return "silver:langutil:pp:groupnest";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pgroupnest(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//group(nest(n, inner))
		 return (silver.langutil.pp.NDocument)(((silver.langutil.pp.NDocument)new silver.langutil.pp.Pgroup(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pnest(context.childAsIsLazy(silver.langutil.pp.Pgroupnest.i_n), common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pgroupnest.i_inner)))); } })));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:groupnest", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Pgroupnest.invoke(args);
		}

	};
}
