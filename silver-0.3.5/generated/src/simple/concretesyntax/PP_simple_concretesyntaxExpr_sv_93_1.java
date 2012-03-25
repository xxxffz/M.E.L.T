package simple.concretesyntax;

// e::Expr ::= l::term:FloatLiteral 
public final class PP_simple_concretesyntaxExpr_sv_93_1 extends simple.concretesyntax.NExpr {

	public static final int i_l = 0;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_93_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PP_simple_concretesyntaxExpr_sv_93_1(final Object c_l) {
		this(new Object[]{c_l});
	}

	public PP_simple_concretesyntaxExpr_sv_93_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxExpr_sv_93_1";
	}

	static void initProductionAttributeDefinitions() {
		// e.unparse = l.lexeme
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.i_l)).lexeme); } };
		// e.ast = ast:floatLit(loc(l.filename, l.line, l.column), l.lexeme)
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.PfloatLit(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new silver.langutil.Ploc(((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.i_l)).filename), ((Integer)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.i_l)).line), ((Integer)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.i_l)).column))); } }, ((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1.i_l)).lexeme))); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxExpr_sv_93_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxExpr_sv_93_1> {

		@Override
		public PP_simple_concretesyntaxExpr_sv_93_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxExpr_sv_93_1(children);
		}

	};
}
