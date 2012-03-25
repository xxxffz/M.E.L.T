package simple.host;

public final class Pmain extends common.FunctionNode {

	public static final int i_largs = 0;
	public static final int i_io_in = 1;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_host_main;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pmain(final Object c_largs, final Object c_io_in) {
		this(new Object[]{c_largs, c_io_in});
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
		return "simple:host:main";
	}

	public static core.NIOVal invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pmain(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//ioval(driver(args, io_in, parse), 0)
		 return (core.NIOVal)(((core.NIOVal)new core.Pioval(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)simple.host.driver.Pdriver.invoke(new Object[]{context.localAsIsLazy(simple.host.Init.args__ON__simple_host_main), context.childAsIsLazy(simple.host.Pmain.i_io_in), simple.host.Pparse.factory})); } }, Integer.valueOf((int)0))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:host:main", t); }
	}
	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {

		@Override
		public core.NIOVal invoke(final Object[] args) {
			return Pmain.invoke(args);
		}

	};
}
