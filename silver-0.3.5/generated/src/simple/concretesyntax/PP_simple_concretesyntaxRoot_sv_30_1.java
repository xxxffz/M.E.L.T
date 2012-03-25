package simple.concretesyntax;

// r::Root ::= 'main' '(' ')' '{' s::Stmts '}' 
public final class PP_simple_concretesyntaxRoot_sv_30_1 extends simple.concretesyntax.NRoot {

	public static final int i__G_5 = 0;
	public static final int i__G_4 = 1;
	public static final int i__G_3 = 2;
	public static final int i__G_2 = 3;
	public static final int i_s = 4;
	public static final int i__G_0 = 5;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, common.TerminalRecord.class, simple.concretesyntax.NStmts.class, common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxRoot_sv_30_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NRoot.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NRoot.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[6][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_s] = new common.Lazy[simple.concretesyntax.NStmts.num_inh_attrs];
	}

	public PP_simple_concretesyntaxRoot_sv_30_1(final Object c__G_5, final Object c__G_4, final Object c__G_3, final Object c__G_2, final Object c_s, final Object c__G_0) {
		this(new Object[]{c__G_5, c__G_4, c__G_3, c__G_2, c_s, c__G_0});
	}

	public PP_simple_concretesyntaxRoot_sv_30_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxRoot_sv_30_1";
	}

	static void initProductionAttributeDefinitions() {
		// r.unparse = "main () {\n" ++ s.unparse ++ "}\n"
		simple.concretesyntax.PP_simple_concretesyntaxRoot_sv_30_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("main () {\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxRoot_sv_30_1.i_s).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmts)), (common.StringCatter)(new common.StringCatter("}\n")))); } };
		// r.ast = ast:rootStmt(s.ast)
		simple.concretesyntax.PP_simple_concretesyntaxRoot_sv_30_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NRoot)new simple.abstractsyntax.ProotStmt(context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxRoot_sv_30_1.i_s, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmts))); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxRoot_sv_30_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxRoot_sv_30_1> {

		@Override
		public PP_simple_concretesyntaxRoot_sv_30_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxRoot_sv_30_1(children);
		}

	};
}
