package simple.abstractsyntax;

// e::Expr ::= ne::Expr 
public final class Pnot extends simple.abstractsyntax.NExpr {

	public static final int i_ne = 0;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_not;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_ne] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public Pnot(final Object c_ne) {
		this(new Object[]{c_ne});
	}

	public Pnot(final Object[] args) {
		super(args);
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
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
	public common.Node getForward(final common.DecoratedNode context) {
		return null;
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
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
		return "simple:abstractsyntax:not";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = cat(text("!"), parens(ne.pp))
		simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("!")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pnot.i_ne, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})); } })); } };
		// e.errors := ne.errors
		if(simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Pnot.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(simple.abstractsyntax.Pnot.i_ne).synthesized(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr)); } });
	}

	public static final common.NodeFactory<Pnot> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pnot> {

		@Override
		public Pnot invoke(final Object[] children) {
			return new Pnot(children);
		}

	};
}
