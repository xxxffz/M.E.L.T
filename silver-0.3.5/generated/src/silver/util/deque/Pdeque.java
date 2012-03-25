package silver.util.deque;

// top::Deque<a> ::= ln::Integer l::Decorated core:List<a> rn::Integer r::Decorated core:List<a> 
public final class Pdeque extends silver.util.deque.NDeque {

	public static final int i_ln = 0;
	public static final int i_l = 1;
	public static final int i_rn = 2;
	public static final int i_r = 3;

	public static final Class<?> childTypes[] = {Integer.class, common.DecoratedNode.class, Integer.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_util_deque_deque;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.util.deque.NDeque.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.util.deque.NDeque.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pdeque(final Object c_ln, final Object c_l, final Object c_rn, final Object c_r) {
		this(new Object[]{c_ln, c_l, c_rn, c_r});
	}

	public Pdeque(final Object[] args) {
		super(args);
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
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
	public common.Node getForward(final common.DecoratedNode context) {
		return null;
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
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
		return "silver:util:deque:deque";
	}

	static void initProductionAttributeDefinitions() {
	}

	public static final common.NodeFactory<Pdeque> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pdeque> {

		@Override
		public Pdeque invoke(final Object[] children) {
			return new Pdeque(children);
		}

	};
}
