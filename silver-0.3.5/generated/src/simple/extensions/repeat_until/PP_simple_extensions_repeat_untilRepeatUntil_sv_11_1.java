package simple.extensions.repeat_until;

// s::cst:StmtMatched ::= 'repeat' body::cst:Stmts 'until' cond::cst:Expr ';' 
public final class PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1 extends simple.concretesyntax.NStmtMatched {

	public static final int i__G_4 = 0;
	public static final int i_body = 1;
	public static final int i__G_2 = 2;
	public static final int i_cond = 3;
	public static final int i__G_0 = 4;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, simple.concretesyntax.NStmts.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_repeat_until_P_simple_extensions_repeat_untilRepeatUntil_sv_11_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NStmtMatched.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[5][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_body] = new common.Lazy[simple.concretesyntax.NStmts.num_inh_attrs];
	childInheritedAttributes[i_cond] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	}

	public PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1(final Object c__G_4, final Object c_body, final Object c__G_2, final Object c_cond, final Object c__G_0) {
		this(new Object[]{c__G_4, c_body, c__G_2, c_cond, c__G_0});
	}

	public PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1(final Object[] args) {
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
		return "simple:extensions:repeat_until:P_simple_extensions_repeat_untilRepeatUntil_sv_11_1";
	}

	static void initProductionAttributeDefinitions() {
		// s.unparse = "repeat \n" ++ body.unparse ++ "\n" ++ "until " ++ cond.unparse ++ "; \n"
		simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("repeat \n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.i_body).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmts)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("until ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.i_cond).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)(new common.StringCatter("; \n"))))))); } };
		// s.ast = repeatStmt(body.ast, cond.ast)
		simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_StmtMatched] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NStmt)new simple.extensions.repeat_until.PrepeatStmt(context.childSynthesizedLazy(simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.i_body, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmts), context.childSynthesizedLazy(simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1.i_cond, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr))); } };
	}

	public static final common.NodeFactory<PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1> {

		@Override
		public PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1 invoke(final Object[] children) {
			return new PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1(children);
		}

	};
}
