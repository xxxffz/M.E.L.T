package simple.concretesyntax;

// s::StmtUnMatched ::= 'if' '(' c::Expr ')' t::StmtMatched 'else' e::StmtMatched 
public final class PP_simple_concretesyntaxStmt_sv_69_1 extends simple.concretesyntax.NStmtUnMatched {

	public static final int i__G_6 = 0;
	public static final int i__G_5 = 1;
	public static final int i_c = 2;
	public static final int i__G_3 = 3;
	public static final int i_t = 4;
	public static final int i__G_1 = 5;
	public static final int i_e = 6;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NStmtMatched.class, common.TerminalRecord.class, simple.concretesyntax.NStmtMatched.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_69_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NStmtUnMatched.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NStmtUnMatched.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[7][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_c] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[simple.concretesyntax.NStmtMatched.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[simple.concretesyntax.NStmtMatched.num_inh_attrs];
	}

	public PP_simple_concretesyntaxStmt_sv_69_1(final Object c__G_6, final Object c__G_5, final Object c_c, final Object c__G_3, final Object c_t, final Object c__G_1, final Object c_e) {
		this(new Object[]{c__G_6, c__G_5, c_c, c__G_3, c_t, c__G_1, c_e});
	}

	public PP_simple_concretesyntaxStmt_sv_69_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxStmt_sv_69_1";
	}

	static void initProductionAttributeDefinitions() {
		// s.unparse = "if (" ++ c.unparse ++ ") \n" ++ t.unparse ++ "else\n" ++ e.unparse
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtUnMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("if (")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.i_c).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(") \n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.i_t).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("else\n")), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.i_e).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched))))))); } };
		// s.ast = ast:ifelse(c.ast, t.ast, e.ast)
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtUnMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pifelse(context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.i_c, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.i_t, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched), context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1.i_e, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched))); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxStmt_sv_69_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxStmt_sv_69_1> {

		@Override
		public PP_simple_concretesyntaxStmt_sv_69_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxStmt_sv_69_1(children);
		}

	};
}
