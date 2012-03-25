package simple.abstractsyntax;

// e::Env<a> ::= e1::Env<a> e2::Env<a> 
public final class PappendEnv_p extends simple.abstractsyntax.NEnv {

	public static final int i_e1 = 0;
	public static final int i_e2 = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NEnv.class, simple.abstractsyntax.NEnv.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_appendEnv_p;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NEnv.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_e1] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	childInheritedAttributes[i_e2] = new common.Lazy[simple.abstractsyntax.NEnv.num_inh_attrs];
	}

	public PappendEnv_p(final Object c_e1, final Object c_e2) {
		this(new Object[]{c_e1, c_e2});
	}

	public PappendEnv_p(final Object[] args) {
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
		return "simple:abstractsyntax:appendEnv_p";
	}

	static void initProductionAttributeDefinitions() {
		// e.bindings = e1.bindings ++ e2.bindings
		simple.abstractsyntax.PappendEnv_p.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childSynthesizedLazy(simple.abstractsyntax.PappendEnv_p.i_e1, simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env), context.childSynthesizedLazy(simple.abstractsyntax.PappendEnv_p.i_e2, simple.abstractsyntax.Init.simple_abstractsyntax_bindings__ON__simple_abstractsyntax_Env)})); } };
	}

	public static final common.NodeFactory<PappendEnv_p> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PappendEnv_p> {

		@Override
		public PappendEnv_p invoke(final Object[] children) {
			return new PappendEnv_p(children);
		}

	};
}
