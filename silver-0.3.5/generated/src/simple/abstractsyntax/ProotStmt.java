package simple.abstractsyntax;

// r::Root ::= s::Stmt 
public final class ProotStmt extends simple.abstractsyntax.NRoot {

	public static final int i_s = 0;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NStmt.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_rootStmt;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NRoot.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NRoot.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_s] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	}

	public ProotStmt(final Object c_s) {
		this(new Object[]{c_s});
	}

	public ProotStmt(final Object[] args) {
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
		return "simple:abstractsyntax:rootStmt";
	}

	static void initProductionAttributeDefinitions() {
		// r.pp = cat(text("main() "), braces(nestlines(3, s.pp)))
		simple.abstractsyntax.ProotStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("main() ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pbraces.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pnestlines.invoke(new Object[]{Integer.valueOf((int)3), context.childSynthesizedLazy(simple.abstractsyntax.ProotStmt.i_s, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt)})); } }})); } })); } };
		// s.env = emptyEnv()
		simple.abstractsyntax.ProotStmt.childInheritedAttributes[simple.abstractsyntax.ProotStmt.i_s][simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PemptyEnv.invoke(new Object[]{})); } };
		// r.errors := s.errors
		if(simple.abstractsyntax.ProotStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Root] == null)
			simple.abstractsyntax.ProotStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Root] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Root);
		((common.CollectionAttribute)simple.abstractsyntax.ProotStmt.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Root]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(simple.abstractsyntax.ProotStmt.i_s).synthesized(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt)); } });
	}

	public static final common.NodeFactory<ProotStmt> factory = new Factory();

	public static final class Factory extends common.NodeFactory<ProotStmt> {

		@Override
		public ProotStmt invoke(final Object[] children) {
			return new ProotStmt(children);
		}

	};
}
