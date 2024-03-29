package dc;

// pw::Phrase_c ::= f::Factor_c '^' t::Phrase_c 
public final class Ppow_c extends dc.NPhrase_c {

	public static final int i_f = 0;
	public static final int i__G_1 = 1;
	public static final int i_t = 2;

	public static final Class<?> childTypes[] = {dc.NFactor_c.class, common.TerminalRecord.class, dc.NPhrase_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_pow_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NPhrase_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NPhrase_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_f] = new common.Lazy[dc.NFactor_c.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[dc.NPhrase_c.num_inh_attrs];
	}

	public Ppow_c(final Object c_f, final Object c__G_1, final Object c_t) {
		this(new Object[]{c_f, c__G_1, c_t});
	}

	public Ppow_c(final Object[] args) {
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
		return "dc:pow_c";
	}

	static void initProductionAttributeDefinitions() {
		// pw.pp = f.pp ++ " ^ " ++ t.pp
		dc.Ppow_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Phrase_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Ppow_c.i_f).synthesized(dc.Init.dc_pp__ON__dc_Factor_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ^ ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Ppow_c.i_t).synthesized(dc.Init.dc_pp__ON__dc_Phrase_c)))); } };
		// pw.ast_Expr = pow(f.ast_Expr, t.ast_Expr)
		dc.Ppow_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Phrase_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.Ppow(context.childSynthesizedLazy(dc.Ppow_c.i_f, dc.Init.dc_ast_Expr__ON__dc_Factor_c), context.childSynthesizedLazy(dc.Ppow_c.i_t, dc.Init.dc_ast_Expr__ON__dc_Phrase_c))); } };
	}

	public static final common.NodeFactory<Ppow_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Ppow_c> {

		@Override
		public Ppow_c invoke(final Object[] children) {
			return new Ppow_c(children);
		}

	};
}
