package dc;

// or::LogiOr_c ::= logiOr::LogiOr_c '||' logiAnd::LogiAnd_c 
public final class PorOp_c extends dc.NLogiOr_c {

	public static final int i_logiOr = 0;
	public static final int i__G_1 = 1;
	public static final int i_logiAnd = 2;

	public static final Class<?> childTypes[] = {dc.NLogiOr_c.class, common.TerminalRecord.class, dc.NLogiAnd_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_orOp_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NLogiOr_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NLogiOr_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_logiOr] = new common.Lazy[dc.NLogiOr_c.num_inh_attrs];
	childInheritedAttributes[i_logiAnd] = new common.Lazy[dc.NLogiAnd_c.num_inh_attrs];
	}

	public PorOp_c(final Object c_logiOr, final Object c__G_1, final Object c_logiAnd) {
		this(new Object[]{c_logiOr, c__G_1, c_logiAnd});
	}

	public PorOp_c(final Object[] args) {
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
		return "dc:orOp_c";
	}

	static void initProductionAttributeDefinitions() {
		// or.pp = logiOr.pp ++ " || " ++ logiAnd.pp
		dc.PorOp_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_LogiOr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PorOp_c.i_logiOr).synthesized(dc.Init.dc_pp__ON__dc_LogiOr_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" || ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PorOp_c.i_logiAnd).synthesized(dc.Init.dc_pp__ON__dc_LogiAnd_c)))); } };
		// or.ast_Expr = orOp(logiOr.ast_Expr, logiAnd.ast_Expr)
		dc.PorOp_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_LogiOr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.PorOp(context.childSynthesizedLazy(dc.PorOp_c.i_logiOr, dc.Init.dc_ast_Expr__ON__dc_LogiOr_c), context.childSynthesizedLazy(dc.PorOp_c.i_logiAnd, dc.Init.dc_ast_Expr__ON__dc_LogiAnd_c))); } };
	}

	public static final common.NodeFactory<PorOp_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PorOp_c> {

		@Override
		public PorOp_c invoke(final Object[] children) {
			return new PorOp_c(children);
		}

	};
}
