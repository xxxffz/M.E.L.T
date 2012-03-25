package silver.langutil.pp;

public final class Pimplode extends common.FunctionNode {

	public static final int i_sep = 0;
	public static final int i_ds = 1;

	public static final Class<?> childTypes[] = {silver.langutil.pp.NDocument.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_implode;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_sep] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	}

	public Pimplode(final Object c_sep, final Object c_ds) {
		this(new Object[]{c_sep, c_ds});
	}

	public Pimplode(final Object[] args) {
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
		return "silver:langutil:pp:implode";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pimplode(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(ds) then notext() else if null(tail(ds)) then head(ds) else cat(cat(head(ds), sep), implode(sep, tail(ds)))
		 return (silver.langutil.pp.NDocument)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pimplode.i_ds)})) ? ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pnotext()) : (((Boolean)core.Pnull.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pimplode.i_ds)})); } }})) ? ((silver.langutil.pp.NDocument)core.Phead.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pimplode.i_ds)})) : ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)core.Phead.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pimplode.i_ds)})); } }, common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pimplode.i_sep)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pimplode.invoke(new Object[]{common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pimplode.i_sep)), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pimplode.i_ds)})); } }})); } })))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:implode", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Pimplode.invoke(args);
		}

	};
}
