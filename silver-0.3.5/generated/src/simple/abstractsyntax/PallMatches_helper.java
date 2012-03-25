package simple.abstractsyntax;

public final class PallMatches_helper extends common.FunctionNode {

	public static final int i_n = 0;
	public static final int i_ps = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_allMatches_helper;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PallMatches_helper(final Object c_n, final Object c_ps) {
		this(new Object[]{c_n, c_ps});
	}

	public PallMatches_helper(final Object[] args) {
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
		return "simple:abstractsyntax:allMatches_helper";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PallMatches_helper(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(ps) then [] else thisMatch ++ allMatches_helper(n, tail(ps))
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.PallMatches_helper.i_ps)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pappend.invoke(new Object[]{context.localAsIsLazy(simple.abstractsyntax.Init.thisMatch__ON__simple_abstractsyntax_allMatches_helper), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)simple.abstractsyntax.PallMatches_helper.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.PallMatches_helper.i_n), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.PallMatches_helper.i_ps)})); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:allMatches_helper", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PallMatches_helper.invoke(args);
		}

	};
}
