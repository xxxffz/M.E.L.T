package dc;

// logiAnd::LogiAnd_c ::= cmpe::Cmpe_c 
public final class PLogiAndCmpe_c extends dc.NLogiAnd_c {

	public static final int i_cmpe = 0;

	public static final Class<?> childTypes[] = {dc.NCmpe_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_LogiAndCmpe_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NLogiAnd_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NLogiAnd_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_cmpe] = new common.Lazy[dc.NCmpe_c.num_inh_attrs];
	}

	public PLogiAndCmpe_c(final Object c_cmpe) {
		this(new Object[]{c_cmpe});
	}

	public PLogiAndCmpe_c(final Object[] args) {
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
		return "dc:LogiAndCmpe_c";
	}

	static void initProductionAttributeDefinitions() {
		// logiAnd.pp = cmpe.pp
		dc.PLogiAndCmpe_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_LogiAnd_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.PLogiAndCmpe_c.i_cmpe).synthesized(dc.Init.dc_pp__ON__dc_Cmpe_c)); } };
		// logiAnd.ast_Expr = cmpe.ast_Expr
		dc.PLogiAndCmpe_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_LogiAnd_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.PLogiAndCmpe_c.i_cmpe).synthesized(dc.Init.dc_ast_Expr__ON__dc_Cmpe_c)); } };
	}

	public static final common.NodeFactory<PLogiAndCmpe_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PLogiAndCmpe_c> {

		@Override
		public PLogiAndCmpe_c invoke(final Object[] children) {
			return new PLogiAndCmpe_c(children);
		}

	};
}
