package dc;

// d::Term_c ::= t::Term_c '/' f::Phrase_c 
public final class Pdiv_c extends dc.NTerm_c {

	public static final int i_t = 0;
	public static final int i__G_1 = 1;
	public static final int i_f = 2;

	public static final Class<?> childTypes[] = {dc.NTerm_c.class, common.TerminalRecord.class, dc.NPhrase_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_div_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NTerm_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NTerm_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_t] = new common.Lazy[dc.NTerm_c.num_inh_attrs];
	childInheritedAttributes[i_f] = new common.Lazy[dc.NPhrase_c.num_inh_attrs];
	}

	public Pdiv_c(final Object c_t, final Object c__G_1, final Object c_f) {
		this(new Object[]{c_t, c__G_1, c_f});
	}

	public Pdiv_c(final Object[] args) {
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
		return "dc:div_c";
	}

	static void initProductionAttributeDefinitions() {
		// d.pp = t.pp ++ " / " ++ f.pp
		dc.Pdiv_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Term_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pdiv_c.i_t).synthesized(dc.Init.dc_pp__ON__dc_Term_c)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" / ")), (common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pdiv_c.i_f).synthesized(dc.Init.dc_pp__ON__dc_Phrase_c)))); } };
		// d.ast_Expr = div(t.ast_Expr, f.ast_Expr)
		dc.Pdiv_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Term_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.Pdiv(context.childSynthesizedLazy(dc.Pdiv_c.i_t, dc.Init.dc_ast_Expr__ON__dc_Term_c), context.childSynthesizedLazy(dc.Pdiv_c.i_f, dc.Init.dc_ast_Expr__ON__dc_Phrase_c))); } };
	}

	public static final common.NodeFactory<Pdiv_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pdiv_c> {

		@Override
		public Pdiv_c invoke(final Object[] children) {
			return new Pdiv_c(children);
		}

	};
}
