package silver.langutil.pp;

public final class Penter extends common.FunctionNode {

	public static final int i_p = 0;
	public static final int i_q = 1;

	public static final Class<?> childTypes[] = {Integer.class, silver.util.deque.NDeque.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_enter;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_q] = new common.Lazy[silver.util.deque.NDeque.num_inh_attrs];
	}

	public Penter(final Object c_p, final Object c_q) {
		this(new Object[]{c_p, c_q});
	}

	public Penter(final Object[] args) {
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
		return "silver:langutil:pp:enter";
	}

	public static silver.util.deque.NDeque invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Penter(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//dqSnoc(q, pair(p, []))
		 return (silver.util.deque.NDeque)(((silver.util.deque.NDeque)silver.util.deque.PdqSnoc.invoke(new Object[]{common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Penter.i_q)), new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NPair)new core.Ppair(context.childAsIsLazy(silver.langutil.pp.Penter.i_p), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } })); } }})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:enter", t); }
	}
	public static final common.NodeFactory<silver.util.deque.NDeque> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.util.deque.NDeque> {

		@Override
		public silver.util.deque.NDeque invoke(final Object[] args) {
			return Penter.invoke(args);
		}

	};
}
