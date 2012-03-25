package simple.abstractsyntax;

public final class Pppoperator extends common.FunctionNode {

	public static final int i_d1 = 0;
	public static final int i_op = 1;
	public static final int i_d2 = 2;

	public static final Class<?> childTypes[] = {silver.langutil.pp.NDocument.class, common.StringCatter.class, silver.langutil.pp.NDocument.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_ppoperator;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_d1] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	childInheritedAttributes[i_d2] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	}

	public Pppoperator(final Object c_d1, final Object c_op, final Object c_d2) {
		this(new Object[]{c_d1, c_op, c_d2});
	}

	public Pppoperator(final Object[] args) {
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
		return "simple:abstractsyntax:ppoperator";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pppoperator(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//parens(cat(cat(d1, text(" " ++ op ++ " ")), d2))
		 return (silver.langutil.pp.NDocument)(((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pppoperator.i_d1)), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter(" ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childAsIs(simple.abstractsyntax.Pppoperator.i_op)), (common.StringCatter)(new common.StringCatter(" ")))); } })); } })); } }, common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pppoperator.i_d2)))); } }})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:ppoperator", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Pppoperator.invoke(args);
		}

	};
}
