package simple.concretesyntax;

// s::Stmt ::= d::Decl 
public final class PP_simple_concretesyntaxStmt_sv_37_1 extends simple.concretesyntax.NStmt {

	public static final int i_d = 0;

	public static final Class<?> childTypes[] = {simple.concretesyntax.NDecl.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_37_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_d] = new common.Lazy[simple.concretesyntax.NDecl.num_inh_attrs];
	}

	public PP_simple_concretesyntaxStmt_sv_37_1(final Object c_d) {
		this(new Object[]{c_d});
	}

	public PP_simple_concretesyntaxStmt_sv_37_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxStmt_sv_37_1";
	}

	static void initProductionAttributeDefinitions() {
		// s.unparse = d.unparse
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_37_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_37_1.i_d).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Decl)); } };
		// s.ast = ast:declStmt(d.ast)
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_37_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.PdeclStmt(context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_37_1.i_d, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Decl))); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxStmt_sv_37_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxStmt_sv_37_1> {

		@Override
		public PP_simple_concretesyntaxStmt_sv_37_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxStmt_sv_37_1(children);
		}

	};
}
