package simple.abstractsyntax;

// s::Stmt ::= s1::Stmt s2::Stmt 
public final class Pseq extends simple.abstractsyntax.NStmt {

	public static final int i_s1 = 0;
	public static final int i_s2 = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NStmt.class, simple.abstractsyntax.NStmt.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_seq;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NStmt.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_s1] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	childInheritedAttributes[i_s2] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	}

	public Pseq(final Object c_s1, final Object c_s2) {
		this(new Object[]{c_s1, c_s2});
	}

	public Pseq(final Object[] args) {
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
		return "simple:abstractsyntax:seq";
	}

	static void initProductionAttributeDefinitions() {
		// s.pp = cat(cat(s1.pp, line()), s2.pp)
		simple.abstractsyntax.Pseq.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(context.childSynthesizedLazy(simple.abstractsyntax.Pseq.i_s1, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } })); } }, context.childSynthesizedLazy(simple.abstractsyntax.Pseq.i_s2, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt))); } };
		// s.defs = appendEnv(s1.defs, s2.defs)
		simple.abstractsyntax.Pseq.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PappendEnv.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pseq.i_s1, simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt), context.childSynthesizedLazy(simple.abstractsyntax.Pseq.i_s2, simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt)})); } };
		// s.errors := s1.errors ++ s2.errors
		if(simple.abstractsyntax.Pseq.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] == null)
			simple.abstractsyntax.Pseq.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt] = new silver.langutil.CAerrors(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt);
		((common.CollectionAttribute)simple.abstractsyntax.Pseq.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pseq.i_s1, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt), context.childSynthesizedLazy(simple.abstractsyntax.Pseq.i_s2, simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Stmt)})); } });
		// s2.env = appendEnv(s1.defs, s.env)
		simple.abstractsyntax.Pseq.childInheritedAttributes[simple.abstractsyntax.Pseq.i_s2][simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NEnv)simple.abstractsyntax.PappendEnv.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.Pseq.i_s1, simple.abstractsyntax.Init.simple_abstractsyntax_defs__ON__simple_abstractsyntax_Stmt), context.contextInheritedLazy(simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Stmt)})); } };
	}

	public static final common.NodeFactory<Pseq> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pseq> {

		@Override
		public Pseq invoke(final Object[] children) {
			return new Pseq(children);
		}

	};
}
