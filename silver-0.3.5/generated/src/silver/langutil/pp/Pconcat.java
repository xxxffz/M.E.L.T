package silver.langutil.pp;

public final class Pconcat extends common.FunctionNode {

	public static final int i_ds = 0;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_concat;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pconcat(final Object c_ds) {
		this(new Object[]{c_ds});
	}

	public Pconcat(final Object[] args) {
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
		return "silver:langutil:pp:concat";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pconcat(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(ds) then notext() else foldl(cat, head(ds), tail(ds))
		 return (silver.langutil.pp.NDocument)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pconcat.i_ds)})) ? ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pnotext()) : ((silver.langutil.pp.NDocument)core.Pfoldl.invoke(new Object[]{silver.langutil.pp.Pcat.factory, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)core.Phead.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pconcat.i_ds)})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pconcat.i_ds)})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:concat", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Pconcat.invoke(args);
		}

	};
}
