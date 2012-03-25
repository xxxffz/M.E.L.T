package simple.abstractsyntax;

// s::Stmt ::= 
public final class Pskip extends simple.abstractsyntax.NStmt {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_skip;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pskip() {
		this(new Object[]{});
	}

	public Pskip(final Object[] args) {
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
		return "simple:abstractsyntax:skip";
	}

	static void initProductionAttributeDefinitions() {
		// s.pp = semi()
		simple.abstractsyntax.Pskip.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Psemi.invoke(new Object[]{})); } };
		// s.defs = emptyEnv()
		simple.abstractsyntax.Pskip.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PemptyEnv.invoke(new Object[]{})); } };
		// s.errors := []
		if(simple.abstractsyntax.Pskip.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.Pskip.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.Pskip.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } });
	}

	public static final common.NodeFactory<Pskip> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pskip> {

		@Override
		public Pskip invoke(final Object[] children) {
			return new Pskip(children);
		}

	};
}
