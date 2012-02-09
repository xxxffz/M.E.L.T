package dc;

// t::Term_c ::= p::Phrase_c 
public final class PtermPhrase_c extends dc.NTerm_c {

	public static final int i_p = 0;

	public static final Class<?> childTypes[] = {dc.NPhrase_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_termPhrase_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NTerm_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NTerm_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_p] = new common.Lazy[dc.NPhrase_c.num_inh_attrs];
	}

	public PtermPhrase_c(final Object c_p) {
		this(new Object[]{c_p});
	}

	public PtermPhrase_c(final Object[] args) {
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
		return "dc:termPhrase_c";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = p.pp
		dc.PtermPhrase_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Term_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.PtermPhrase_c.i_p).synthesized(dc.Init.dc_pp__ON__dc_Phrase_c)); } };
		// t.ast_Expr = p.ast_Expr
		dc.PtermPhrase_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Term_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.PtermPhrase_c.i_p).synthesized(dc.Init.dc_ast_Expr__ON__dc_Phrase_c)); } };
	}

	public static final common.NodeFactory<PtermPhrase_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtermPhrase_c> {

		@Override
		public PtermPhrase_c invoke(final Object[] children) {
			return new PtermPhrase_c(children);
		}

	};
}
