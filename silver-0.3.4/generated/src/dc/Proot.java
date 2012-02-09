package dc;

// r::Root ::= e::Expr 
public final class Proot extends dc.NRoot {

	public static final int i_e = 0;

	public static final Class<?> childTypes[] = {dc.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_root;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NRoot.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NRoot.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_e] = new common.Lazy[dc.NExpr.num_inh_attrs];
	}

	public Proot(final Object c_e) {
		this(new Object[]{c_e});
	}

	public Proot(final Object[] args) {
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
		return "dc:root";
	}

	static void initProductionAttributeDefinitions() {
		// r.pp = e.pp
		dc.Proot.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.Proot.i_e).synthesized(dc.Init.dc_pp__ON__dc_Expr)); } };
		// r.value = e.value
		dc.Proot.synthesizedAttributes[dc.Init.dc_value__ON__dc_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.childDecorated(dc.Proot.i_e).synthesized(dc.Init.dc_value__ON__dc_Expr)); } };
	}

	public static final common.NodeFactory<Proot> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Proot> {

		@Override
		public Proot invoke(final Object[] children) {
			return new Proot(children);
		}

	};
}
