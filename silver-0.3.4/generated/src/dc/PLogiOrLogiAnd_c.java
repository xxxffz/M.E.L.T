package dc;

// logiOr::LogiOr_c ::= logiAnd::LogiAnd_c 
public final class PLogiOrLogiAnd_c extends dc.NLogiOr_c {

	public static final int i_logiAnd = 0;

	public static final Class<?> childTypes[] = {dc.NLogiAnd_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_LogiOrLogiAnd_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NLogiOr_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NLogiOr_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_logiAnd] = new common.Lazy[dc.NLogiAnd_c.num_inh_attrs];
	}

	public PLogiOrLogiAnd_c(final Object c_logiAnd) {
		this(new Object[]{c_logiAnd});
	}

	public PLogiOrLogiAnd_c(final Object[] args) {
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
		return "dc:LogiOrLogiAnd_c";
	}

	static void initProductionAttributeDefinitions() {
		// logiOr.pp = logiAnd.pp
		dc.PLogiOrLogiAnd_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_LogiOr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.PLogiOrLogiAnd_c.i_logiAnd).synthesized(dc.Init.dc_pp__ON__dc_LogiAnd_c)); } };
		// logiOr.ast_Expr = logiAnd.ast_Expr
		dc.PLogiOrLogiAnd_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_LogiOr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.PLogiOrLogiAnd_c.i_logiAnd).synthesized(dc.Init.dc_ast_Expr__ON__dc_LogiAnd_c)); } };
	}

	public static final common.NodeFactory<PLogiOrLogiAnd_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PLogiOrLogiAnd_c> {

		@Override
		public PLogiOrLogiAnd_c invoke(final Object[] children) {
			return new PLogiOrLogiAnd_c(children);
		}

	};
}
