package core;

public final class PzipWith extends common.FunctionNode {

	public static final int i_f = 0;
	public static final int i_l1 = 1;
	public static final int i_l2 = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_zipWith;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PzipWith(final Object c_f, final Object c_l1, final Object c_l2) {
		this(new Object[]{c_f, c_l1, c_l2});
	}

	public PzipWith(final Object[] args) {
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
		return "core:zipWith";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PzipWith(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(l1) || null(l2) then [] else (f(head(l1), head(l2)) :: zipWith(f, tail(l1), tail(l2)))
		 return (common.ConsCell)(((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PzipWith.i_l1)})) || ((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PzipWith.i_l2)}))) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)((common.NodeFactory<Object>)context.childAsIs(core.PzipWith.i_f)).invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PzipWith.i_l1)})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PzipWith.i_l2)})); } }})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.PzipWith.invoke(new Object[]{context.childAsIsLazy(core.PzipWith.i_f), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PzipWith.i_l1)})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PzipWith.i_l2)})); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:zipWith", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PzipWith.invoke(args);
		}

	};
}
