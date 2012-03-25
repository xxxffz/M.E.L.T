package simple.abstractsyntax;

// e::Expr ::= l::Expr r::Expr 
public final class Padd extends simple.abstractsyntax.NExpr {

	public static final int i_l = 0;
	public static final int i_r = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_add;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public Padd(final Object c_l, final Object c_r) {
		this(new Object[]{c_l, c_r});
	}

	public Padd(final Object[] args) {
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
		return "simple:abstractsyntax:add";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = ppoperator(l.pp, "+", r.pp)
		simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)simple.abstractsyntax.Pppoperator.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_l, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), (new common.StringCatter("+")), context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_r, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr)})); } };
		// e.errors := l.errors ++ r.errors
		if(simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] == null)
			simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr);
		((common.CollectionAttribute)simple.abstractsyntax.Padd.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_l, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr), context.childSynthesizedLazy(simple.abstractsyntax.Padd.i_r, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr)})); } });
	}

	public static final common.NodeFactory<Padd> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Padd> {

		@Override
		public Padd invoke(final Object[] children) {
			return new Padd(children);
		}

	};
}
