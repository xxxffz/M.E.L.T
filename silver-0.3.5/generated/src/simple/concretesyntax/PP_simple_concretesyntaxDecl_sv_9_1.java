package simple.concretesyntax;

// d::Decl ::= te::TypeExpr id::term:Id ';' 
public final class PP_simple_concretesyntaxDecl_sv_9_1 extends simple.concretesyntax.NDecl {

	public static final int i_te = 0;
	public static final int i_id = 1;
	public static final int i__G_0 = 2;

	public static final Class<?> childTypes[] = {simple.concretesyntax.NTypeExpr.class, common.TerminalRecord.class, common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxDecl_sv_9_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_te] = new common.Lazy[simple.concretesyntax.NTypeExpr.num_inh_attrs];
	}

	public PP_simple_concretesyntaxDecl_sv_9_1(final Object c_te, final Object c_id, final Object c__G_0) {
		this(new Object[]{c_te, c_id, c__G_0});
	}

	public PP_simple_concretesyntaxDecl_sv_9_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxDecl_sv_9_1";
	}

	static void initProductionAttributeDefinitions() {
		// d.unparse = te.unparse ++ " " ++ id.lexeme ++ "; \n"
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Decl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1.i_te).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_TypeExpr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1.i_id)).lexeme), (common.StringCatter)(new common.StringCatter("; \n"))))); } };
		// d.ast = ast:decl(te.ast, name(id))
		simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Decl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NDecl)new simple.abstractsyntax.Pdecl(context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1.i_te, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_TypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NName)simple.concretesyntax.Pname.invoke(new Object[]{context.childAsIsLazy(simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1.i_id)})); } })); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxDecl_sv_9_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxDecl_sv_9_1> {

		@Override
		public PP_simple_concretesyntaxDecl_sv_9_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxDecl_sv_9_1(children);
		}

	};
}
