package simple.concretesyntax;

// s::StmtMatched ::= 'for' '(' id::term:Id '=' lower::Expr 'to' upper::Expr ')' body::StmtMatched 
public final class PP_simple_concretesyntaxFor_sv_4_1 extends simple.concretesyntax.NStmtMatched {

	public static final int i__G_8 = 0;
	public static final int i__G_7 = 1;
	public static final int i_id = 2;
	public static final int i__G_5 = 3;
	public static final int i_lower = 4;
	public static final int i__G_3 = 5;
	public static final int i_upper = 6;
	public static final int i__G_1 = 7;
	public static final int i_body = 8;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NStmtMatched.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxFor_sv_4_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[9][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_lower] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_upper] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_body] = new common.Lazy[simple.concretesyntax.NStmtMatched.num_inh_attrs];
	}

	public PP_simple_concretesyntaxFor_sv_4_1(final Object c__G_8, final Object c__G_7, final Object c_id, final Object c__G_5, final Object c_lower, final Object c__G_3, final Object c_upper, final Object c__G_1, final Object c_body) {
		this(new Object[]{c__G_8, c__G_7, c_id, c__G_5, c_lower, c__G_3, c_upper, c__G_1, c_body});
	}

	public PP_simple_concretesyntaxFor_sv_4_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxFor_sv_4_1";
	}

	static void initProductionAttributeDefinitions() {
		// s.unparse = "for (" ++ id.lexeme ++ " = " ++ lower.unparse ++ " to " ++ upper.unparse ++ ")" ++ "\n" ++ body.unparse
		simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("for (")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_id)).lexeme), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" = ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_lower).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" to ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_upper).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(")")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_body).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched)))))))))); } };
		// s.ast = ast:for(name(id), lower.ast, upper.ast, body.ast)
		simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pfor(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_id)})); } }, context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_lower, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_upper, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1.i_body, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched))); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxFor_sv_4_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxFor_sv_4_1> {

		@Override
		public PP_simple_concretesyntaxFor_sv_4_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxFor_sv_4_1(children);
		}

	};
}
