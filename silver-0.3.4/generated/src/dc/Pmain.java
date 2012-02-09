package dc;

public final class Pmain extends common.FunctionNode {

	public static final int i_largs = 0;
	public static final int i_ioin = 1;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_main;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pmain(final Object c_largs, final Object c_ioin) {
		this(new Object[]{c_largs, c_ioin});
	}

	public Pmain(final Object[] args) {
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
		return "dc:main";
	}

	public static core.NIOVal invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pmain(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//ioval(if result.parseSuccess then print_success else print_failure, 0)
		 return (core.NIOVal)(((core.NIOVal)new core.Pioval(new common.Closure(context) { public final Object eval() { return (((Boolean)context.localDecorated(dc.Init.result__ON__dc_main).synthesized(core.Init.core_parseSuccess__ON__core_ParseResult)) ? ((Object)context.localAsIs(dc.Init.print_success__ON__dc_main)) : ((Object)context.localAsIs(dc.Init.print_failure__ON__dc_main))); } }, Integer.valueOf((int)0))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function dc:main", t); }
	}
	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {

		@Override
		public core.NIOVal invoke(final Object[] args) {
			return Pmain.invoke(args);
		}

	};
}
