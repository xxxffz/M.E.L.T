package dc;

// f::Factor_c ::= logiNot::LogiNot_c 
public final class PFactorLogiNot_c extends dc.NFactor_c {

	public static final int i_logiNot = 0;

	public static final Class<?> childTypes[] = {dc.NLogiNot_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_FactorLogiNot_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NFactor_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NFactor_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_logiNot] = new common.Lazy[dc.NLogiNot_c.num_inh_attrs];
	}

	public PFactorLogiNot_c(final Object c_logiNot) {
		this(new Object[]{c_logiNot});
	}

	public PFactorLogiNot_c(final Object[] args) {
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
		return "dc:FactorLogiNot_c";
	}

	static void initProductionAttributeDefinitions() {
		// f.pp = logiNot.pp
		dc.PFactorLogiNot_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Factor_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.PFactorLogiNot_c.i_logiNot).synthesized(dc.Init.dc_pp__ON__dc_LogiNot_c)); } };
		// f.ast_Expr = logiNot.ast_Expr
		dc.PFactorLogiNot_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Factor_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.PFactorLogiNot_c.i_logiNot).synthesized(dc.Init.dc_ast_Expr__ON__dc_LogiNot_c)); } };
	}

	public static final common.NodeFactory<PFactorLogiNot_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PFactorLogiNot_c> {

		@Override
		public PFactorLogiNot_c invoke(final Object[] children) {
			return new PFactorLogiNot_c(children);
		}

	};
}
