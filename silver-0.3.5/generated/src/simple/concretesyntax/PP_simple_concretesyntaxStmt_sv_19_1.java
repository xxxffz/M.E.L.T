package simple.concretesyntax;

// ss::Stmts ::= s::Stmt rest::Stmts 
public final class PP_simple_concretesyntaxStmt_sv_19_1 extends simple.concretesyntax.NStmts {

	public static final int i_s = 0;
	public static final int i_rest = 1;

	public static final Class<?> childTypes[] = {simple.concretesyntax.NStmt.class, simple.concretesyntax.NStmts.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_P_simple_concretesyntaxStmt_sv_19_1;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.concretesyntax.NStmts.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.concretesyntax.NStmts.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_s] = new common.Lazy[simple.concretesyntax.NStmt.num_inh_attrs];
	childInheritedAttributes[i_rest] = new common.Lazy[simple.concretesyntax.NStmts.num_inh_attrs];
	}

	public PP_simple_concretesyntaxStmt_sv_19_1(final Object c_s, final Object c_rest) {
		this(new Object[]{c_s, c_rest});
	}

	public PP_simple_concretesyntaxStmt_sv_19_1(final Object[] args) {
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
		return "simple:concretesyntax:P_simple_concretesyntaxStmt_sv_19_1";
	}

	static void initProductionAttributeDefinitions() {
		// ss.unparse = s.unparse ++ rest.unparse
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmts] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.i_s).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmt)), (common.StringCatter)((common.StringCatter)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.i_rest).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Stmts))); } };
		// ss.ast = case rest of stmtNone() -> s.ast | _ -> ast:seq(s.ast, rest.ast) end
		simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.synthesizedAttributes[simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmts] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NStmt)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_1065 = new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pseq(context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.i_s, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmt), context.childSynthesizedLazy(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.i_rest, simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmts))); } };
return new common.PatternLazy<common.DecoratedNode, simple.abstractsyntax.NStmt>() { public final simple.abstractsyntax.NStmt eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.concretesyntax.PstmtNone) {  return (simple.abstractsyntax.NStmt)((simple.abstractsyntax.NStmt)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.i_s).synthesized(simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Stmt)); }scrutineeIter = scrutineeIter.forward();}return ((simple.abstractsyntax.NStmt)(__SV_LOCAL___fail_1065.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1.i_rest)); } }).eval()); } };
	}

	public static final common.NodeFactory<PP_simple_concretesyntaxStmt_sv_19_1> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_simple_concretesyntaxStmt_sv_19_1> {

		@Override
		public PP_simple_concretesyntaxStmt_sv_19_1 invoke(final Object[] children) {
			return new PP_simple_concretesyntaxStmt_sv_19_1(children);
		}

	};
}
