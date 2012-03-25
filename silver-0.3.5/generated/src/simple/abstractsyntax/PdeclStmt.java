package simple.abstractsyntax;

// s::Stmt ::= d::Decl 
public final class PdeclStmt extends simple.abstractsyntax.NStmt {

	public static final int i_d = 0;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NDecl.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_declStmt;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_d] = new common.Lazy[simple.abstractsyntax.NDecl.num_inh_attrs];
	}

	public PdeclStmt(final Object c_d) {
		this(new Object[]{c_d});
	}

	public PdeclStmt(final Object[] args) {
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
		return "simple:abstractsyntax:declStmt";
	}

	static void initProductionAttributeDefinitions() {
		// s.pp = d.pp
		simple.abstractsyntax.PdeclStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(simple.abstractsyntax.PdeclStmt.i_d).synthesized(simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Decl)); } };
		// s.defs = d.defs
		simple.abstractsyntax.PdeclStmt.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)context.childDecorated(simple.abstractsyntax.PdeclStmt.i_d).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Decl)); } };
		// s.errors := d.errors
		if(simple.abstractsyntax.PdeclStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.PdeclStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.PdeclStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(simple.abstractsyntax.PdeclStmt.i_d).synthesized(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Decl)); } });
	}

	public static final common.NodeFactory<PdeclStmt> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PdeclStmt> {

		@Override
		public PdeclStmt invoke(final Object[] children) {
			return new PdeclStmt(children);
		}

	};
}
