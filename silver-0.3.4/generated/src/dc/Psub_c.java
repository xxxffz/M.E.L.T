package dc;

// dff::Expr_c ::= e::Expr_c '-' t::Term_c 
public final class Psub_c extends dc.NExpr_c {

	public static final int i_e = 0;
	public static final int i__G_1 = 1;
	public static final int i_t = 2;

	public static final Class<?> childTypes[] = {dc.NExpr_c.class, common.TerminalRecord.class, dc.NTerm_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_sub_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NExpr_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NExpr_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_e] = new common.Lazy[dc.NExpr_c.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[dc.NTerm_c.num_inh_attrs];
	}

	public Psub_c(final Object c_e, final Object c__G_1, final Object c_t) {
		this(new Object[]{c_e, c__G_1, c_t});
	}

	public Psub_c(final Object[] args) {
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
		return "dc:sub_c";
	}

	static void initProductionAttributeDefinitions() {
		// dff.pp = e.pp ++ " - " ++ t.pp
		dc.Psub_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Expr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub_c.i_e).synthesized(dc.Init.dc_pp__ON__dc_Expr_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" - ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub_c.i_t).synthesized(dc.Init.dc_pp__ON__dc_Term_c)))); } };
		// dff.ast_Expr = sub(e.ast_Expr, t.ast_Expr)
		dc.Psub_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Expr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.Psub(context.childSynthesizedLazy(dc.Psub_c.i_e, dc.Init.dc_ast_Expr__ON__dc_Expr_c), context.childSynthesizedLazy(dc.Psub_c.i_t, dc.Init.dc_ast_Expr__ON__dc_Term_c))); } };
	}

	public static final common.NodeFactory<Psub_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Psub_c> {

		@Override
		public Psub_c invoke(final Object[] children) {
			return new Psub_c(children);
		}

	};
}
