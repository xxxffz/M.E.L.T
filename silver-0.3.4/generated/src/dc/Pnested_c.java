package dc;

// e::LogiNot_c ::= '(' inner::LogiOr_c ')' 
public final class Pnested_c extends dc.NLogiNot_c {

	public static final int i__G_2 = 0;
	public static final int i_inner = 1;
	public static final int i__G_0 = 2;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class, dc.NLogiOr_c.class, common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_nested_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NLogiNot_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NLogiNot_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_inner] = new common.Lazy[dc.NLogiOr_c.num_inh_attrs];
	}

	public Pnested_c(final Object c__G_2, final Object c_inner, final Object c__G_0) {
		this(new Object[]{c__G_2, c_inner, c__G_0});
	}

	public Pnested_c(final Object[] args) {
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
		return "dc:nested_c";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = "(" ++ inner.pp ++ ")"
		dc.Pnested_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_LogiNot_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Pnested_c.i_inner).synthesized(dc.Init.dc_pp__ON__dc_LogiOr_c)), (common.StringCatter)(new common.StringCatter(")")))); } };
		// e.ast_Expr = inner.ast_Expr
		dc.Pnested_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_LogiNot_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.Pnested_c.i_inner).synthesized(dc.Init.dc_ast_Expr__ON__dc_LogiOr_c)); } };
	}

	public static final common.NodeFactory<Pnested_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pnested_c> {

		@Override
		public Pnested_c invoke(final Object[] children) {
			return new Pnested_c(children);
		}

	};
}
