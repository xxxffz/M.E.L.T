package dc;

// cmpe::Cmpe_c ::= cmplg::Cmplg_c 
public final class PCmpeCmlg_c extends dc.NCmpe_c {

	public static final int i_cmplg = 0;

	public static final Class<?> childTypes[] = {dc.NCmplg_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_CmpeCmlg_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NCmpe_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NCmpe_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_cmplg] = new common.Lazy[dc.NCmplg_c.num_inh_attrs];
	}

	public PCmpeCmlg_c(final Object c_cmplg) {
		this(new Object[]{c_cmplg});
	}

	public PCmpeCmlg_c(final Object[] args) {
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
		return "dc:CmpeCmlg_c";
	}

	static void initProductionAttributeDefinitions() {
		// cmpe.pp = cmplg.pp
		dc.PCmpeCmlg_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Cmpe_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.PCmpeCmlg_c.i_cmplg).synthesized(dc.Init.dc_pp__ON__dc_Cmplg_c)); } };
		// cmpe.ast_Expr = cmplg.ast_Expr
		dc.PCmpeCmlg_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Cmpe_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.PCmpeCmlg_c.i_cmplg).synthesized(dc.Init.dc_ast_Expr__ON__dc_Cmplg_c)); } };
	}

	public static final common.NodeFactory<PCmpeCmlg_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PCmpeCmlg_c> {

		@Override
		public PCmpeCmlg_c invoke(final Object[] children) {
			return new PCmpeCmlg_c(children);
		}

	};
}
