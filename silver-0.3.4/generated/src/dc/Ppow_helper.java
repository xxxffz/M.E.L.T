package dc;

public final class Ppow_helper extends common.FunctionNode {

	public static final int i_base = 0;
	public static final int i_ex = 1;

	public static final Class<?> childTypes[] = {Integer.class, Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_pow_helper;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Ppow_helper(final Object c_base, final Object c_ex) {
		this(new Object[]{c_base, c_ex});
	}

	public Ppow_helper(final Object[] args) {
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
		return "dc:pow_helper";
	}

	public static Integer invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Ppow_helper(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if ex == 0 then 1 else base * pow_helper(base, ex - 1)
		 return (Integer)((((Integer)context.childAsIs(dc.Ppow_helper.i_ex)).equals(Integer.valueOf((int)0)) ? Integer.valueOf((int)1) : Integer.valueOf(((Integer)context.childAsIs(dc.Ppow_helper.i_base)) * ((Integer)dc.Ppow_helper.invoke(new Object[]{context.childAsIsLazy(dc.Ppow_helper.i_base), new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(dc.Ppow_helper.i_ex)) - Integer.valueOf((int)1)); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function dc:pow_helper", t); }
	}
	public static final common.NodeFactory<Integer> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Integer> {

		@Override
		public Integer invoke(final Object[] args) {
			return Ppow_helper.invoke(args);
		}

	};
}
