package dc;

// p::Phrase_c ::= f::Factor_c 
public final class PphraseFactor_c extends dc.NPhrase_c {

	public static final int i_f = 0;

	public static final Class<?> childTypes[] = {dc.NFactor_c.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_phraseFactor_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[dc.NPhrase_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[dc.NPhrase_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_f] = new common.Lazy[dc.NFactor_c.num_inh_attrs];
	}

	public PphraseFactor_c(final Object c_f) {
		this(new Object[]{c_f});
	}

	public PphraseFactor_c(final Object[] args) {
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
		return "dc:phraseFactor_c";
	}

	static void initProductionAttributeDefinitions() {
		// p.pp = f.pp
		dc.PphraseFactor_c.synthesizedAttributes[dc.Init.dc_pp__ON__dc_Phrase_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(dc.PphraseFactor_c.i_f).synthesized(dc.Init.dc_pp__ON__dc_Factor_c)); } };
		// p.ast_Expr = f.ast_Expr
		dc.PphraseFactor_c.synthesizedAttributes[dc.Init.dc_ast_Expr__ON__dc_Phrase_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((dc.NExpr)context.childDecorated(dc.PphraseFactor_c.i_f).synthesized(dc.Init.dc_ast_Expr__ON__dc_Factor_c)); } };
	}

	public static final common.NodeFactory<PphraseFactor_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PphraseFactor_c> {

		@Override
		public PphraseFactor_c invoke(final Object[] children) {
			return new PphraseFactor_c(children);
		}

	};
}
