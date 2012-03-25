package simple.abstractsyntax;

// d::Decl ::= t::TypeExpr id::Name 
public final class Pdecl extends simple.abstractsyntax.NDecl {

	public static final int i_t = 0;
	public static final int i_id = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NTypeExpr.class, simple.abstractsyntax.NName.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_decl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_t] = new common.Lazy[simple.abstractsyntax.NTypeExpr.num_inh_attrs];
	childInheritedAttributes[i_id] = new common.Lazy[simple.abstractsyntax.NName.num_inh_attrs];
	}

	public Pdecl(final Object c_t, final Object c_id) {
		this(new Object[]{c_t, c_id});
	}

	public Pdecl(final Object[] args) {
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
		return "simple:abstractsyntax:decl";
	}

	static void initProductionAttributeDefinitions() {
		// d.pp = concat([ t.pp, space(), id.pp, semi() ])
		simple.abstractsyntax.Pdecl.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Decl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pdecl.i_t, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_TypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke(new Object[]{})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pdecl.i_id, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Psemi.invoke(new Object[]{})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }})); } }})); } }})); } }})); } };
		// d.defs = addBinding(id.name, t, emptyEnv())
		simple.abstractsyntax.Pdecl.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Decl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PaddBinding.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pdecl.i_id, simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name), context.childDecoratedLazy(simple.abstractsyntax.Pdecl.i_t), new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PemptyEnv.invoke(new Object[]{})); } }})); } };
		// d.errors := []
		if(simple.abstractsyntax.Pdecl.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Decl] == null)
			simple.abstractsyntax.Pdecl.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Decl] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Decl);
		((common.CollectionAttribute)simple.abstractsyntax.Pdecl.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Decl]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } });
	}

	public static final common.NodeFactory<Pdecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pdecl> {

		@Override
		public Pdecl invoke(final Object[] children) {
			return new Pdecl(children);
		}

	};
}
