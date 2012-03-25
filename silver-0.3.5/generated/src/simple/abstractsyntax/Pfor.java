package simple.abstractsyntax;

// s::Stmt ::= i::Name lower::Expr upper::Expr body::Stmt 
public final class Pfor extends simple.abstractsyntax.NStmt {

	public static final int i_i = 0;
	public static final int i_lower = 1;
	public static final int i_upper = 2;
	public static final int i_body = 3;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NName.class, simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NExpr.class, simple.abstractsyntax.NStmt.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_for;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_i] = new common.Lazy[simple.abstractsyntax.NName.num_inh_attrs];
	childInheritedAttributes[i_lower] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_upper] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_body] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	}

	public Pfor(final Object c_i, final Object c_lower, final Object c_upper, final Object c_body) {
		this(new Object[]{c_i, c_lower, c_upper, c_body});
	}

	public Pfor(final Object[] args) {
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
		return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pseq(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Passignment(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_i)), common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_lower)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pwhile(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Plte(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.PvarRef(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_i)))); } }, common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_upper)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pblock(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Pseq(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_body)), new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NStmt)new simple.abstractsyntax.Passignment(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_i)), new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Padd(new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.PvarRef(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_i)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.PintLit(context.childSynthesizedLazy(simple.abstractsyntax.Pfor.i_i, simple.abstractsyntax.Init.silver_langutil_location__ON__simple_abstractsyntax_Name), (new common.StringCatter("1")))); } })); } })); } })); } })); } })); } }));
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
		return "simple:abstractsyntax:for";
	}

	static void initProductionAttributeDefinitions() {
		// s.pp = concat([ text("for"), parens(concat([ i.pp, text(" = "), lower.pp, text(" to "), upper.pp ])), ppblock(body) ])
		simple.abstractsyntax.Pfor.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("for")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pfor.i_i, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(" = ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pfor.i_lower, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(" to ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pfor.i_upper, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }})); } }})); } }})); } }})); } }})); } }})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)simple.abstractsyntax.Pppblock.invoke(new Object[]{common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.abstractsyntax.Pfor.i_body))})); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})); } }})); } }})); } }})); } };
	}

	public static final common.NodeFactory<Pfor> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pfor> {

		@Override
		public Pfor invoke(final Object[] children) {
			return new Pfor(children);
		}

	};
}
