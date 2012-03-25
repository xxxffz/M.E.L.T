package silver.langutil;

public final class PmessageLte extends common.FunctionNode {

	public static final int i_m1 = 0;
	public static final int i_m2 = 1;

	public static final Class<?> childTypes[] = {silver.langutil.NMessage.class, silver.langutil.NMessage.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_messageLte;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_m1] = new common.Lazy[silver.langutil.NMessage.num_inh_attrs];
	childInheritedAttributes[i_m2] = new common.Lazy[silver.langutil.NMessage.num_inh_attrs];
	}

	public PmessageLte(final Object c_m1, final Object c_m2) {
		this(new Object[]{c_m1, c_m2});
	}

	public PmessageLte(final Object[] args) {
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
		return "silver:langutil:messageLte";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PmessageLte(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//locationLte(m1.location, m2.location)
		 return (Boolean)(((Boolean)silver.langutil.PlocationLte.invoke(new Object[]{context.childSynthesizedLazy(silver.langutil.PmessageLte.i_m1, silver.langutil.Init.silver_langutil_location__ON__silver_langutil_Message), context.childSynthesizedLazy(silver.langutil.PmessageLte.i_m2, silver.langutil.Init.silver_langutil_location__ON__silver_langutil_Message)})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:messageLte", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PmessageLte.invoke(args);
		}

	};
}
