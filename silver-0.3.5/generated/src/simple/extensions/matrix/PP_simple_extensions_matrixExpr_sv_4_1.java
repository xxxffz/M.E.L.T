package simple.extensions.matrix;

// e::cst:Expr ::= id::cst:Id '[' r::cst:Expr ',' c::cst:Expr ']' 
public final class PP_simple_extensions_matrixExpr_sv_4_1 extends simple.concretesyntax.NExpr {

	public static final int i_id = 0;
	public static final int i__G_4 = 1;
	public static final int i_r = 2;
	public static final int i__G_2 = 3;
	public static final int i_c = 4;
	public static final int i__G_0 = 5;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_matrix_P_simple_extensions_matrixExpr_sv_4_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[6][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_r] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_c] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	}

	public PP_simple_extensions_matrixExpr_sv_4_1(final Object c_id, final Object c__G_4, final Object c_r, final Object c__G_2, final Object c_c, final Object c__G_0) {
		this(new Object[]{c_id, c__G_4, c_r, c__G_2, c_c, c__G_0});
	}

	public PP_simple_extensions_matrixExpr_sv_4_1(final Object[] args) {
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
		return "simple:extensions:matrix:P_simple_extensions_matrixExpr_sv_4_1";
	}

	static void initProductionAttributeDefinitions() {
		// e.unparse = id.lexeme
		simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1.i_id)).lexeme); } };
		// e.ast = matrixRef(cst:name(id), r.ast, c.ast)
		simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NExpr)new simple.extensions.matrix.PmatrixRef(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1.i_id)})); } }, context.childSynthesizedLazy(simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1.i_r, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1.i_c, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr))); } };
	}

	public static final common.NodeFactory<PP_simple_extensions_matrixExpr_sv_4_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_extensions_matrixExpr_sv_4_1> {

		@Override
		public PP_simple_extensions_matrixExpr_sv_4_1 invoke(final Object[] children) {
			return new PP_simple_extensions_matrixExpr_sv_4_1(children);
		}

	};
}
