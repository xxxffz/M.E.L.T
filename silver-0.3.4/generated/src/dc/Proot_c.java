package dc;

// r::Root_c ::= e::LogiOr_c 
public final class Proot_c extends dc.NRoot_c {

	public static final int i_e = 0;

	public static final Class<?> childTypes[] = {dc.NLogiOr_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_root_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NRoot_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NRoot_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_e] = new common.Lazy[dc.NLogiOr_c.num_inh_attrs];
	}

	public Proot_c(final Object c_e) {
		this(new Object[]{c_e});
	}

	public Proot_c(final Object[] args) {
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
		return "dc:root_c";
	}

	static void initProductionAttributeDefinitions() {
		// r.pp = e.pp
		dc.Proot_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Root_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.Proot_c.i_e).synthesized(dc.Init.dc_pp__ON__dc_LogiOr_c)); } };
		// r.ast_Root = root(e.ast_Expr)
		dc.Proot_c.synthesizedAttributes[dc.Init.dc_ast_Root__ON__dc_Root_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NRoot)new dc.Proot(context.childSynthesizedLazy(dc.Proot_c.i_e, dc.Init.dc_ast_Expr__ON__dc_LogiOr_c))); } };
	}

	public static final common.NodeFactory<Proot_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Proot_c> {

		@Override
		public Proot_c invoke(final Object[] children) {
			return new Proot_c(children);
		}

	};
}
