package simple.abstractsyntax;

// s::Stmt ::= id::Name e::Expr 
public final class Passignment extends simple.abstractsyntax.NStmt {

	public static final int i_id = 0;
	public static final int i_e = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NName.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_assignment;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_id] = new common.Lazy[simple.abstractsyntax.NName.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public Passignment(final Object c_id, final Object c_e) {
		this(new Object[]{c_id, c_e});
	}

	public Passignment(final Object[] args) {
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
		return "simple:abstractsyntax:assignment";
	}

	static void initProductionAttributeDefinitions() {
		// s.pp = concat([ id.pp, text(" = "), e.pp, semi() ])
		simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Passignment.i_id, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(" = ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Passignment.i_e, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Psemi.invoke(new Object[]{})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }})); } }})); } }})); } }})); } };
		// s.defs = emptyEnv()
		simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PemptyEnv.invoke(new Object[]{})); } };
		// s.errors := case id.lookup of just(_) -> [] | nothing() -> [ err(id.location, "variable \"" ++ id.name ++ "\" was not declared.") ] end
		if(simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof core.Pjust) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_251 = new common.Thunk<Object>(context) { public final Object doEval() { return (Object)scrutinee.childAsIs(0); } };
 return (common.ConsCell)((common.ConsCell)core.Pnil.invoke(new Object[]{})); }
else if(scrutineeNode instanceof core.Pnothing) {  return (common.ConsCell)((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(context.childSynthesizedLazy(simple.abstractsyntax.Passignment.i_id, simple.abstractsyntax.Init.silver_langutil_location__ON__simple_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("variable \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(simple.abstractsyntax.Passignment.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name)), (common.StringCatter)(new common.StringCatter("\" was not declared.")))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); }scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at simple:abstractsyntax 'Stmt.sv', 87, 14\n"))}));}}.eval(context, (common.DecoratedNode)((core.NMaybe)context.childDecorated(simple.abstractsyntax.Passignment.i_id).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_lookup__ON__simple_abstractsyntax_Name)).decorate(context, (common.Lazy[])null)); } });
		// s.errors <- e.errors
		if(simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.Passignment.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(simple.abstractsyntax.Passignment.i_e).synthesized(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Expr)); } });
	}

	public static final common.NodeFactory<Passignment> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Passignment> {

		@Override
		public Passignment invoke(final Object[] children) {
			return new Passignment(children);
		}

	};
}
