package silver.langutil.pp;

public final class Pterminate extends common.FunctionNode {

	public static final int i_sep = 0;
	public static final int i_ds = 1;

	public static final Class<?> childTypes[] = {silver.langutil.pp.NDocument.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_terminate;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_sep] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	}

	public Pterminate(final Object c_sep, final Object c_ds) {
		this(new Object[]{c_sep, c_ds});
	}

	public Pterminate(final Object[] args) {
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
		return "silver:langutil:pp:terminate";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pterminate(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//cat(implode(sep, ds), sep)
		 return (silver.langutil.pp.NDocument)(((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pimplode.invoke(new Object[]{common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pterminate.i_sep)), context.childAsIsLazy(silver.langutil.pp.Pterminate.i_ds)})); } }, common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pterminate.i_sep)))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:terminate", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Pterminate.invoke(args);
		}

	};
}
