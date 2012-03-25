package simple.abstractsyntax;

// t::Type ::= 
public final class PstringType extends simple.abstractsyntax.NType {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_stringType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PstringType() {
		this(new Object[]{});
	}

	public PstringType(final Object[] args) {
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
		return "simple:abstractsyntax:stringType";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = text("String")
		simple.abstractsyntax.PstringType.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Type] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("String")))); } };
	}

	public static final common.NodeFactory<PstringType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PstringType> {

		@Override
		public PstringType invoke(final Object[] children) {
			return new PstringType(children);
		}

	};
}
