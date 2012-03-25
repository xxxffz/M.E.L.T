package simple.host.driver;

public final class Pdriver extends common.FunctionNode {

	public static final int i_args = 0;
	public static final int i_io_in = 1;
	public static final int i_the_parser = 2;

	public static final Class<?> childTypes[] = {common.StringCatter.class, Object.class, common.NodeFactory.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_host_driver_driver;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pdriver(final Object c_args, final Object c_io_in, final Object c_the_parser) {
		this(new Object[]{c_args, c_io_in, c_the_parser});
	}

	public Pdriver(final Object[] args) {
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
		return "simple:host:driver:driver";
	}

	public static Object invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pdriver(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if ! isF.iovalue then error("\n\nFile \"" ++ args ++ "\" not found.\n") else if result.parseSuccess then write_success else print_failure
		 return (Object)(((!((Boolean)context.localDecorated(simple.host.driver.Init.isF__ON__simple_host_driver_driver).synthesized(core.Init.core_iovalue__ON__core_IOVal))) ? ((Object)core.Perror.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\nFile \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childAsIs(simple.host.driver.Pdriver.i_args)), (common.StringCatter)(new common.StringCatter("\" not found.\n")))); } }})) : (((Boolean)context.localDecorated(simple.host.driver.Init.result__ON__simple_host_driver_driver).synthesized(core.Init.core_parseSuccess__ON__core_ParseResult)) ? ((Object)context.localAsIs(simple.host.driver.Init.write_success__ON__simple_host_driver_driver)) : ((Object)context.localAsIs(simple.host.driver.Init.print_failure__ON__simple_host_driver_driver)))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:host:driver:driver", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return Pdriver.invoke(args);
		}

	};
}
