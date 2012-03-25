package simple.abstractsyntax;

// s::Stmt ::= body::Stmt 
public final class Pblock extends simple.abstractsyntax.NStmt {

	public static final int i_body = 0;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NStmt.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_block;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_body] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	}

	public Pblock(final Object c_body) {
		this(new Object[]{c_body});
	}

	public Pblock(final Object[] args) {
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
		return "simple:abstractsyntax:block";
	}

	static void initProductionAttributeDefinitions() {
		// s.pp = braces(nestlines(3, body.pp))
		simple.abstractsyntax.Pblock.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pbraces.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pnestlines.invoke(new Object[]{Integer.valueOf((int)3), context.childSynthesizedLazy(simple.abstractsyntax.Pblock.i_body, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt)})); } }})); } };
		// s.defs = emptyEnv()
		simple.abstractsyntax.Pblock.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PemptyEnv.invoke(new Object[]{})); } };
		// s.errors := body.errors
		if(simple.abstractsyntax.Pblock.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.Pblock.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.Pblock.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(simple.abstractsyntax.Pblock.i_body).synthesized(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt)); } });
	}

	public static final common.NodeFactory<Pblock> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pblock> {

		@Override
		public Pblock invoke(final Object[] children) {
			return new Pblock(children);
		}

	};
}
