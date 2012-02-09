package dc;

// e::Expr ::= i::IntLit_t 
public final class PintegerConstant extends dc.NExpr {

	public static final int i_i = 0;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_integerConstant;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PintegerConstant(final Object c_i) {
		this(new Object[]{c_i});
	}

	public PintegerConstant(final Object[] args) {
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
		return "dc:integerConstant";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = i.lexeme
		dc.PintegerConstant.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((common.TerminalRecord)context.childAsIs(dc.PintegerConstant.i_i)).lexeme); } };
		// e.value = toInt(i.lexeme)
		dc.PintegerConstant.synthesizedAttributes[dc.Init.dc_value__ON__dc_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(((common.StringCatter)((common.TerminalRecord)context.childAsIs(dc.PintegerConstant.i_i)).lexeme).toString()); } };
	}

	public static final common.NodeFactory<PintegerConstant> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PintegerConstant> {

		@Override
		public PintegerConstant invoke(final Object[] children) {
			return new PintegerConstant(children);
		}

	};
}
