package simple.concretesyntax;

// s::StmtMatched ::= ';' 
public final class PP_simple_concretesyntaxStmt_sv_50_1 extends simple.concretesyntax.NStmtMatched {

	public static final int i__G_0 = 0;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_50_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PP_simple_concretesyntaxStmt_sv_50_1(final Object c__G_0) {
		this(new Object[]{c__G_0});
	}

	public PP_simple_concretesyntaxStmt_sv_50_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxStmt_sv_50_1";
	}

	static void initProductionAttributeDefinitions() {
		// s.unparse = "; \n"
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_50_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("; \n")); } };
		// s.ast = ast:skip()
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_50_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pskip()); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxStmt_sv_50_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxStmt_sv_50_1> {

		@Override
		public PP_simple_concretesyntaxStmt_sv_50_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxStmt_sv_50_1(children);
		}

	};
}
