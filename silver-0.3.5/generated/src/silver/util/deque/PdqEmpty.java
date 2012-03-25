package silver.util.deque;

public final class PdqEmpty extends common.FunctionNode {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_util_deque_dqEmpty;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PdqEmpty() {
		this(new Object[]{});
	}

	public PdqEmpty(final Object[] args) {
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
		return "silver:util:deque:dqEmpty";
	}

	public static silver.util.deque.NDeque invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PdqEmpty(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//deque(0, [], 0, [])
		 return (silver.util.deque.NDeque)(((silver.util.deque.NDeque)new silver.util.deque.Pdeque(Integer.valueOf((int)0), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }, Integer.valueOf((int)0), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } })));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:util:deque:dqEmpty", t); }
	}
	public static final common.NodeFactory<silver.util.deque.NDeque> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.util.deque.NDeque> {

		@Override
		public silver.util.deque.NDeque invoke(final Object[] args) {
			return PdqEmpty.invoke(args);
		}

	};
}
