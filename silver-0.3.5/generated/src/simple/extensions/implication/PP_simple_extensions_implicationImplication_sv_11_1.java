package simple.extensions.implication;

// e::cst:Expr ::= l::cst:Expr '=>' r::cst:Expr 
public final class PP_simple_extensions_implicationImplication_sv_11_1 extends simple.concretesyntax.NExpr {

	public static final int i_l = 0;
	public static final int i__G_1 = 1;
	public static final int i_r = 2;

	public static final Class<?> childTypes[] = {simple.concretesyntax.NExpr.class, common.TerminalRecord.class, simple.concretesyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_implication_P_simple_extensions_implicationImplication_sv_11_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[simple.concretesyntax.NExpr.num_inh_attrs];
	}

	public PP_simple_extensions_implicationImplication_sv_11_1(final Object c_l, final Object c__G_1, final Object c_r) {
		this(new Object[]{c_l, c__G_1, c_r});
	}

	public PP_simple_extensions_implicationImplication_sv_11_1(final Object[] args) {
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
		return "simple:extensions:implication:P_simple_extensions_implicationImplication_sv_11_1";
	}

	static void initProductionAttributeDefinitions() {
		// e.unparse = "(" ++ l.unparse ++ " => " ++ r.unparse ++ ")"
		simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1.i_l).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" => ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1.i_r).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		// e.ast = implies(l.ast, r.ast)
		simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NExpr)new simple.extensions.implication.Pimplies(context.childSynthesizedLazy(simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1.i_l, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr), context.childSynthesizedLazy(simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1.i_r, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Expr))); } };
	}

	public static final common.NodeFactory<PP_simple_extensions_implicationImplication_sv_11_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_extensions_implicationImplication_sv_11_1> {

		@Override
		public PP_simple_extensions_implicationImplication_sv_11_1 invoke(final Object[] children) {
			return new PP_simple_extensions_implicationImplication_sv_11_1(children);
		}

	};
}
