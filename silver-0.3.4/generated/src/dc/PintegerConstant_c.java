package dc;

// ic::LogiNot_c ::= i::IntLit_t 
public final class PintegerConstant_c extends dc.NLogiNot_c {

	public static final int i_i = 0;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_integerConstant_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NLogiNot_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NLogiNot_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PintegerConstant_c(final Object c_i) {
		this(new Object[]{c_i});
	}

	public PintegerConstant_c(final Object[] args) {
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
		return "dc:integerConstant_c";
	}

	static void initProductionAttributeDefinitions() {
		// ic.pp = i.lexeme
		dc.PintegerConstant_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_LogiNot_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((common.TerminalRecord)context.childAsIs(dc.PintegerConstant_c.i_i)).lexeme); } };
		// ic.ast_Expr = integerConstant(i)
		dc.PintegerConstant_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_LogiNot_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)new dc.PintegerConstant(context.childAsIsLazy(dc.PintegerConstant_c.i_i))); } };
	}

	public static final common.NodeFactory<PintegerConstant_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PintegerConstant_c> {

		@Override
		public PintegerConstant_c invoke(final Object[] children) {
			return new PintegerConstant_c(children);
		}

	};
}
