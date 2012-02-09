package dc;

// ne::Cmpe_c ::= cmpe::Cmpe_c '!=' cmplg::Cmplg_c 
public final class PnotEqualTo_c extends dc.NCmpe_c {

	public static final int i_cmpe = 0;
	public static final int i__G_1 = 1;
	public static final int i_cmplg = 2;

	public static final Class<?> childTypes[] = {dc.NCmpe_c.class, common.TerminalRecord.class, dc.NCmplg_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_notEqualTo_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NCmpe_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NCmpe_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_cmpe] = new common.Lazy[dc.NCmpe_c.num_inh_attrs];
	childInheritedAttributes[i_cmplg] = new common.Lazy[dc.NCmplg_c.num_inh_attrs];
	}

	public PnotEqualTo_c(final Object c_cmpe, final Object c__G_1, final Object c_cmplg) {
		this(new Object[]{c_cmpe, c__G_1, c_cmplg});
	}

	public PnotEqualTo_c(final Object[] args) {
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
		return "dc:notEqualTo_c";
	}

	static void initProductionAttributeDefinitions() {
		// ne.pp = cmpe.pp ++ " != " ++ cmplg.pp
		dc.PnotEqualTo_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Cmpe_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotEqualTo_c.i_cmpe).synthesized(dc.Init.dc_pp__ON__dc_Cmpe_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" != ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.PnotEqualTo_c.i_cmplg).synthesized(dc.Init.dc_pp__ON__dc_Cmplg_c)))); } };
		// ne.ast_Expr = notEqualTo(cmpe.ast_Expr, cmplg.ast_Expr)
		dc.PnotEqualTo_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Cmpe_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.PnotEqualTo(context.childSynthesizedLazy(dc.PnotEqualTo_c.i_cmpe, dc.Init.dc_ast_Expr__ON__dc_Cmpe_c), context.childSynthesizedLazy(dc.PnotEqualTo_c.i_cmplg, dc.Init.dc_ast_Expr__ON__dc_Cmplg_c))); } };
	}

	public static final common.NodeFactory<PnotEqualTo_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PnotEqualTo_c> {

		@Override
		public PnotEqualTo_c invoke(final Object[] children) {
			return new PnotEqualTo_c(children);
		}

	};
}
