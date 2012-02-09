package dc;

// dff::Expr ::= l::Expr r::Expr 
public final class Psub extends dc.NExpr {

	public static final int i_l = 0;
	public static final int i_r = 1;

	public static final Class<?> childTypes[] = {dc.NExpr.class, dc.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_sub;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l] = new common.Lazy[dc.NExpr.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[dc.NExpr.num_inh_attrs];
	}

	public Psub(final Object c_l, final Object c_r) {
		this(new Object[]{c_l, c_r});
	}

	public Psub(final Object[] args) {
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
		return "dc:sub";
	}

	static void initProductionAttributeDefinitions() {
		// dff.pp = "(" ++ l.pp ++ " - " ++ r.pp ++ ")"
		dc.Psub.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("(")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub.i_l).synthesized(dc.Init.dc_pp__ON__dc_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" - ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(dc.Psub.i_r).synthesized(dc.Init.dc_pp__ON__dc_Expr)), (common.StringCatter)(new common.StringCatter(")")))))); } };
		// dff.value = l.value - r.value
		dc.Psub.synthesizedAttributes[dc.Init.dc_value__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(((Integer)context.childDecorated(dc.Psub.i_l).synthesized(dc.Init.dc_value__ON__dc_Expr)) - ((Integer)context.childDecorated(dc.Psub.i_r).synthesized(dc.Init.dc_value__ON__dc_Expr))); } };
	}

	public static final common.NodeFactory<Psub> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Psub> {

		@Override
		public Psub invoke(final Object[] children) {
			return new Psub(children);
		}

	};
}
