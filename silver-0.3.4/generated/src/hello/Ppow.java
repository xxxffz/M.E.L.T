package hello;

public final class Ppow extends common.FunctionNode {

	public static final int i_base = 0;
	public static final int i_ex = 1;

	public static final Class<?> childTypes[] = {Integer.class, Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__hello_pow;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Ppow(final Object c_base, final Object c_ex) {
		this(new Object[]{c_base, c_ex});
	}

	public Ppow(final Object[] args) {
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
		return "hello:pow";
	}

	public static Integer invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Ppow(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if ex == 0 then 1 else base * pow(base, ex - 1)
		 return (Integer)((((Integer)context.childAsIs(hello.Ppow.i_ex)).equals(Integer.valueOf((int)0)) ? Integer.valueOf((int)1) : Integer.valueOf(((Integer)context.childAsIs(hello.Ppow.i_base)) * ((Integer)hello.Ppow.invoke(new Object[]{context.childAsIsLazy(hello.Ppow.i_base), new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(hello.Ppow.i_ex)) - Integer.valueOf((int)1)); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function hello:pow", t); }
	}
	public static final common.NodeFactory<Integer> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Integer> {

		@Override
		public Integer invoke(final Object[] args) {
			return Ppow.invoke(args);
		}

	};
}
