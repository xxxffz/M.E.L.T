package silver.langutil;

public final class PppMessages extends common.FunctionNode {

	public static final int i_msgs = 0;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_ppMessages;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PppMessages(final Object c_msgs) {
		this(new Object[]{c_msgs});
	}

	public PppMessages(final Object[] args) {
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
		return "silver:langutil:ppMessages";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PppMessages(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//map((.unparse), msgs)
		 return (common.ConsCell)(((common.ConsCell)core.Pmap.invoke(new Object[]{new common.AttributeSection.Undecorated(silver.langutil.Init.silver_langutil_unparse__ON__silver_langutil_Message), context.childAsIsLazy(silver.langutil.PppMessages.i_msgs)})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:ppMessages", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PppMessages.invoke(args);
		}

	};
}
