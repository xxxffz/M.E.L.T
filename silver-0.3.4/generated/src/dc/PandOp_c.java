package dc;

// and::LogiAnd_c ::= logiAnd::LogiAnd_c '&&' cmpe::Cmpe_c 
public final class PandOp_c extends dc.NLogiAnd_c {

	public static final int i_logiAnd = 0;
	public static final int i__G_1 = 1;
	public static final int i_cmpe = 2;

	public static final Class<?> childTypes[] = {dc.NLogiAnd_c.class, common.TerminalRecord.class, dc.NCmpe_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_andOp_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NLogiAnd_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NLogiAnd_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_logiAnd] = new common.Lazy[dc.NLogiAnd_c.num_inh_attrs];
	childInheritedAttributes[i_cmpe] = new common.Lazy[dc.NCmpe_c.num_inh_attrs];
	}

	public PandOp_c(final Object c_logiAnd, final Object c__G_1, final Object c_cmpe) {
		this(new Object[]{c_logiAnd, c__G_1, c_cmpe});
	}

	public PandOp_c(final Object[] args) {
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
		return "dc:andOp_c";
	}

	static void initProductionAttributeDefinitions() {
		// and.pp = logiAnd.pp ++ " && " ++ cmpe.pp
		dc.PandOp_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_LogiAnd_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PandOp_c.i_logiAnd).synthesized(dc.Init.dc_pp__ON__dc_LogiAnd_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" && ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PandOp_c.i_cmpe).synthesized(dc.Init.dc_pp__ON__dc_Cmpe_c)))); } };
		// and.ast_Expr = andOp(logiAnd.ast_Expr, cmpe.ast_Expr)
		dc.PandOp_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_LogiAnd_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.PandOp(context.childSynthesizedLazy(dc.PandOp_c.i_logiAnd, dc.Init.dc_ast_Expr__ON__dc_LogiAnd_c), context.childSynthesizedLazy(dc.PandOp_c.i_cmpe, dc.Init.dc_ast_Expr__ON__dc_Cmpe_c))); } };
	}

	public static final common.NodeFactory<PandOp_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PandOp_c> {

		@Override
		public PandOp_c invoke(final Object[] children) {
			return new PandOp_c(children);
		}

	};
}
