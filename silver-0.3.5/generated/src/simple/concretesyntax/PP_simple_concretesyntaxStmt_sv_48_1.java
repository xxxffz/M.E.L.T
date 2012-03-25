package simple.concretesyntax;

// s::StmtMatched ::= id::term:Id '=' value::Expr ';' 
public final class PP_simple_concretesyntaxStmt_sv_48_1 extends simple.concretesyntax.NStmtMatched {

	public static final int i_id = 0;
	public static final int i__G_2 = 1;
	public static final int i_value = 2;
	public static final int i__G_0 = 3;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_48_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_value] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	}

	public PP_simple_concretesyntaxStmt_sv_48_1(final Object c_id, final Object c__G_2, final Object c_value, final Object c__G_0) {
		this(new Object[]{c_id, c__G_2, c_value, c__G_0});
	}

	public PP_simple_concretesyntaxStmt_sv_48_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxStmt_sv_48_1";
	}

	static void initProductionAttributeDefinitions() {
		// s.unparse = id.lexeme ++ " = " ++ value.unparse ++ ";\n"
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1.i_id)).lexeme), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" = ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1.i_value).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)(new common.StringCatter(";\n"))))); } };
		// s.ast = ast:assignment(name(id), value.ast)
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Passignment(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1.i_id)})); } }, context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1.i_value, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr))); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxStmt_sv_48_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxStmt_sv_48_1> {

		@Override
		public PP_simple_concretesyntaxStmt_sv_48_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxStmt_sv_48_1(children);
		}

	};
}
