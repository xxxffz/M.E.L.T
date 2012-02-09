package dc;

// ge::Cmplg_c ::= cmplg::Cmplg_c '>=' e::Expr_c 
public final class PgreaterThanOrEqualTo_c extends dc.NCmplg_c {

	public static final int i_cmplg = 0;
	public static final int i__G_1 = 1;
	public static final int i_e = 2;

	public static final Class<?> childTypes[] = {dc.NCmplg_c.class, common.TerminalRecord.class, dc.NExpr_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_greaterThanOrEqualTo_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NCmplg_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NCmplg_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_cmplg] = new common.Lazy[dc.NCmplg_c.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[dc.NExpr_c.num_inh_attrs];
	}

	public PgreaterThanOrEqualTo_c(final Object c_cmplg, final Object c__G_1, final Object c_e) {
		this(new Object[]{c_cmplg, c__G_1, c_e});
	}

	public PgreaterThanOrEqualTo_c(final Object[] args) {
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
		return "dc:greaterThanOrEqualTo_c";
	}

	static void initProductionAttributeDefinitions() {
		// ge.pp = cmplg.pp ++ " < " ++ e.pp
		dc.PgreaterThanOrEqualTo_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Cmplg_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThanOrEqualTo_c.i_cmplg).synthesized(dc.Init.dc_pp__ON__dc_Cmplg_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" < ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PgreaterThanOrEqualTo_c.i_e).synthesized(dc.Init.dc_pp__ON__dc_Expr_c)))); } };
		// ge.ast_Expr = greaterThanOrEqualTo(cmplg.ast_Expr, e.ast_Expr)
		dc.PgreaterThanOrEqualTo_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Cmplg_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.PgreaterThanOrEqualTo(context.childSynthesizedLazy(dc.PgreaterThanOrEqualTo_c.i_cmplg, dc.Init.dc_ast_Expr__ON__dc_Cmplg_c), context.childSynthesizedLazy(dc.PgreaterThanOrEqualTo_c.i_e, dc.Init.dc_ast_Expr__ON__dc_Expr_c))); } };
	}

	public static final common.NodeFactory<PgreaterThanOrEqualTo_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgreaterThanOrEqualTo_c> {

		@Override
		public PgreaterThanOrEqualTo_c invoke(final Object[] children) {
			return new PgreaterThanOrEqualTo_c(children);
		}

	};
}
