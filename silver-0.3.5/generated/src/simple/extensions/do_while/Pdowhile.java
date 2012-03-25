package simple.extensions.do_while;

// s::Stmt ::= body::Stmt cond::Expr 
public final class Pdowhile extends simple.abstractsyntax.NStmt {

	public static final int i_body = 0;
	public static final int i_cond = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NStmt.class, simple.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_do_while_dowhile;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_body] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	childInheritedAttributes[i_cond] = new common.Lazy[simple.abstractsyntax.NExpr.num_inh_attrs];
	}

	public Pdowhile(final Object c_body, final Object c_cond) {
		this(new Object[]{c_body, c_cond});
	}

	public Pdowhile(final Object[] args) {
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
		return ((simple.abstractsyntax.NStmt)new simple.extensions.repeat_until.PrepeatStmt(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.extensions.do_while.Pdowhile.i_body)), new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NExpr)new simple.abstractsyntax.Pnot(common.Thunk.transformUndecorate(context.childDecoratedLazy(simple.extensions.do_while.Pdowhile.i_cond)))); } }));
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
		return "simple:extensions:do_while:dowhile";
	}

	static void initProductionAttributeDefinitions() {
	}

	public static final common.NodeFactory<Pdowhile> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pdowhile> {

		@Override
		public Pdowhile invoke(final Object[] children) {
			return new Pdowhile(children);
		}

	};
}
