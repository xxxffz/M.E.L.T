package simple.extensions.expr_if;

// e::cst:Expr ::= 'if' c::cst:Expr 'then' t::cst:Expr Else e1::cst:Expr 
public final class PP_simple_extensions_expr_ifExpr_sv_12_1 extends simple.concretesyntax.NExpr {

	public static final int i__G_5 = 0;
	public static final int i_c = 1;
	public static final int i__G_3 = 2;
	public static final int i_t = 3;
	public static final int i__G_1 = 4;
	public static final int i_e1 = 5;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_expr_if_P_simple_extensions_expr_ifExpr_sv_12_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[6][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_c] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_e1] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	}

	public PP_simple_extensions_expr_ifExpr_sv_12_1(final Object c__G_5, final Object c_c, final Object c__G_3, final Object c_t, final Object c__G_1, final Object c_e1) {
		this(new Object[]{c__G_5, c_c, c__G_3, c_t, c__G_1, c_e1});
	}

	public PP_simple_extensions_expr_ifExpr_sv_12_1(final Object[] args) {
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
		return "simple:extensions:expr_if:P_simple_extensions_expr_ifExpr_sv_12_1";
	}

	static void initProductionAttributeDefinitions() {
		// e.unparse = "if " ++ c.unparse ++ " then " ++ t.unparse ++ " else " ++ e1.unparse
		simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("if ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.i_c).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" then ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.i_t).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" else ")), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.i_e1).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr))))))); } };
		// e.ast = ifthenelse(c.ast, t.ast, e1.ast)
		simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NExpr)new simple.extensions.expr_if.Pifthenelse(context.childSynthesizedLazy(simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.i_c, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.i_t, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1.i_e1, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr))); } };
	}

	public static final common.NodeFactory<PP_simple_extensions_expr_ifExpr_sv_12_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_extensions_expr_ifExpr_sv_12_1> {

		@Override
		public PP_simple_extensions_expr_ifExpr_sv_12_1 invoke(final Object[] children) {
			return new PP_simple_extensions_expr_ifExpr_sv_12_1(children);
		}

	};
}
