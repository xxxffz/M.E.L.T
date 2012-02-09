package dc;

public final class PtoInteger extends common.FunctionNode {

	public static final int i_b = 0;

	public static final Class<?> childTypes[] = {Boolean.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_toInteger;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PtoInteger(final Object c_b) {
		this(new Object[]{c_b});
	}

	public PtoInteger(final Object[] args) {
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
		return "dc:toInteger";
	}

	public static Integer invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PtoInteger(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if b then 1 else 0
		 return (Integer)((((Boolean)context.childAsIs(dc.PtoInteger.i_b)) ? Integer.valueOf((int)1) : Integer.valueOf((int)0)));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function dc:toInteger", t); }
	}
	public static final common.NodeFactory<Integer> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Integer> {

		@Override
		public Integer invoke(final Object[] args) {
			return PtoInteger.invoke(args);
		}

	};
}
