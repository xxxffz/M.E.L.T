package simple.concretesyntax;

// e::Expr ::= id::term:Id 
public final class PP_simple_concretesyntaxExpr_sv_85_1 extends simple.concretesyntax.NExpr {

	public static final int i_id = 0;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxExpr_sv_85_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PP_simple_concretesyntaxExpr_sv_85_1(final Object c_id) {
		this(new Object[]{c_id});
	}

	public PP_simple_concretesyntaxExpr_sv_85_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxExpr_sv_85_1";
	}

	static void initProductionAttributeDefinitions() {
		// e.unparse = id.lexeme
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_85_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_85_1.i_id)).lexeme); } };
		// e.ast = ast:varRef(name(id))
		simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_85_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.PvarRef(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_85_1.i_id)})); } })); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxExpr_sv_85_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxExpr_sv_85_1> {

		@Override
		public PP_simple_concretesyntaxExpr_sv_85_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxExpr_sv_85_1(children);
		}

	};
}
