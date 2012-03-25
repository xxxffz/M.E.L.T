package simple.extensions.matrix;

// d::cst:Decl ::= 'Matrix' id::cst:Id '[' r::cst:Expr ',' c::cst:Expr ']' ri::cst:Id ',' ci::cst:Id '=' e::cst:Expr ';' 
public final class PP_simple_extensions_matrixDecl_sv_4_1 extends simple.concretesyntax.NDecl {

	public static final int i__G_12 = 0;
	public static final int i_id = 1;
	public static final int i__G_10 = 2;
	public static final int i_r = 3;
	public static final int i__G_8 = 4;
	public static final int i_c = 5;
	public static final int i__G_6 = 6;
	public static final int i_ri = 7;
	public static final int i__G_4 = 8;
	public static final int i_ci = 9;
	public static final int i__G_2 = 10;
	public static final int i_e = 11;
	public static final int i__G_0 = 12;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class, common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_matrix_P_simple_extensions_matrixDecl_sv_4_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[13][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_r] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_c] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	}

	public PP_simple_extensions_matrixDecl_sv_4_1(final Object c__G_12, final Object c_id, final Object c__G_10, final Object c_r, final Object c__G_8, final Object c_c, final Object c__G_6, final Object c_ri, final Object c__G_4, final Object c_ci, final Object c__G_2, final Object c_e, final Object c__G_0) {
		this(new Object[]{c__G_12, c_id, c__G_10, c_r, c__G_8, c_c, c__G_6, c_ri, c__G_4, c_ci, c__G_2, c_e, c__G_0});
	}

	public PP_simple_extensions_matrixDecl_sv_4_1(final Object[] args) {
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
		return "simple:extensions:matrix:P_simple_extensions_matrixDecl_sv_4_1";
	}

	static void initProductionAttributeDefinitions() {
		// d.unparse = "Matrix " ++ id.lexeme ++ "[" ++ r.unparse ++ ", " ++ c.unparse ++ "] " ++ ri.lexeme ++ "," ++ ci.lexeme ++ " = " ++ e.unparse ++ ";\n"
		simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Decl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Matrix ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_id)).lexeme), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("[")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_r).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(", ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_c).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("] ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_ri)).lexeme), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(",")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_ci)).lexeme), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" = ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_e).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)(new common.StringCatter(";\n")))))))))))))); } };
		// d.ast = declMatrix(cst:name(id), r.ast, c.ast, cst:name(ri), cst:name(ci), e.ast)
		simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Decl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NDecl)new simple.extensions.matrix.PdeclMatrix(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_id)})); } }, context.childSynthesizedLazy(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_r, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_c, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_ri)})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_ci)})); } }, context.childSynthesizedLazy(simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1.i_e, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr))); } };
	}

	public static final common.NodeFactory<PP_simple_extensions_matrixDecl_sv_4_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_extensions_matrixDecl_sv_4_1> {

		@Override
		public PP_simple_extensions_matrixDecl_sv_4_1 invoke(final Object[] children) {
			return new PP_simple_extensions_matrixDecl_sv_4_1(children);
		}

	};
}
