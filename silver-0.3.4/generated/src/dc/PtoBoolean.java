package dc;

public final class PtoBoolean extends common.FunctionNode {

	public static final int i_i = 0;

	public static final Class<?> childTypes[] = {Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_toBoolean;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PtoBoolean(final Object c_i) {
		this(new Object[]{c_i});
	}

	public PtoBoolean(final Object[] args) {
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
		return "dc:toBoolean";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PtoBoolean(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if i == 0 then false else true
		 return (Boolean)((((Integer)context.childAsIs(dc.PtoBoolean.i_i)).equals(Integer.valueOf((int)0)) ? false : true));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function dc:toBoolean", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PtoBoolean.invoke(args);
		}

	};
}
