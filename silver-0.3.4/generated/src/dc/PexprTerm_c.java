package dc;

// e::Expr_c ::= t::Term_c 
public final class PexprTerm_c extends dc.NExpr_c {

	public static final int i_t = 0;

	public static final Class<?> childTypes[] = {dc.NTerm_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_exprTerm_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NExpr_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NExpr_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_t] = new common.Lazy[dc.NTerm_c.num_inh_attrs];
	}

	public PexprTerm_c(final Object c_t) {
		this(new Object[]{c_t});
	}

	public PexprTerm_c(final Object[] args) {
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
		return "dc:exprTerm_c";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = t.pp
		dc.PexprTerm_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Expr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.PexprTerm_c.i_t).synthesized(dc.Init.dc_pp__ON__dc_Term_c)); } };
		// e.ast_Expr = t.ast_Expr
		dc.PexprTerm_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Expr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.PexprTerm_c.i_t).synthesized(dc.Init.dc_ast_Expr__ON__dc_Term_c)); } };
	}

	public static final common.NodeFactory<PexprTerm_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PexprTerm_c> {

		@Override
		public PexprTerm_c invoke(final Object[] children) {
			return new PexprTerm_c(children);
		}

	};
}
