package simple.concretesyntax;

// t::TypeExpr ::= 'Float' 
public final class PP_simple_concretesyntaxDecl_sv_21_1 extends simple.concretesyntax.NTypeExpr {

	public static final int i__G_0 = 0;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxDecl_sv_21_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NTypeExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NTypeExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PP_simple_concretesyntaxDecl_sv_21_1(final Object c__G_0) {
		this(new Object[]{c__G_0});
	}

	public PP_simple_concretesyntaxDecl_sv_21_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxDecl_sv_21_1";
	}

	static void initProductionAttributeDefinitions() {
		// t.unparse = "Float"
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_21_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("Float")); } };
		// t.ast = ast:typeExprFloat()
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_21_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NTypeExpr)new simple.abstractsyntax.PtypeExprFloat()); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxDecl_sv_21_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxDecl_sv_21_1> {

		@Override
		public PP_simple_concretesyntaxDecl_sv_21_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxDecl_sv_21_1(children);
		}

	};
}
