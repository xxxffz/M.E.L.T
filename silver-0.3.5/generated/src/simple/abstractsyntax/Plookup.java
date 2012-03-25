package simple.abstractsyntax;

public final class Plookup extends common.FunctionNode {

	public static final int i_n = 0;
	public static final int i_e = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, simple.abstractsyntax.NEnv.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_lookup;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_e] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	}

	public Plookup(final Object c_n, final Object c_e) {
		this(new Object[]{c_n, c_e});
	}

	public Plookup(final Object[] args) {
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
		return "simple:abstractsyntax:lookup";
	}

	public static core.NMaybe invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Plookup(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(matches) then nothing() else just(head(matches))
		 return (core.NMaybe)((((Boolean)core.Pnull.invoke(new Object[]{context.localAsIsLazy(simple.abstractsyntax.Init.matches__ON__simple_abstractsyntax_lookup)})) ? ((core.NMaybe)new core.Pnothing()) : ((core.NMaybe)new core.Pjust(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Phead.invoke(new Object[]{context.localAsIsLazy(simple.abstractsyntax.Init.matches__ON__simple_abstractsyntax_lookup)})); } }))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:lookup", t); }
	}
	public static final common.NodeFactory<core.NMaybe> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NMaybe> {

		@Override
		public core.NMaybe invoke(final Object[] args) {
			return Plookup.invoke(args);
		}

	};
}
