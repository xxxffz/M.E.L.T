package simple.abstractsyntax;

// l::Location ::= 
public final class PlocUnknown extends silver.langutil.NLocation {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_locUnknown;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.langutil.NLocation.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.langutil.NLocation.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PlocUnknown() {
		this(new Object[]{});
	}

	public PlocUnknown(final Object[] args) {
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
		return "simple:abstractsyntax:locUnknown";
	}

	static void initProductionAttributeDefinitions() {
		// l.unparse = "??"
		simple.abstractsyntax.PlocUnknown.synthesizedAttributes[silver.langutil.Init.silver_langutil_unparse__ON__silver_langutil_Location] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("??")); } };
	}

	public static final common.NodeFactory<PlocUnknown> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PlocUnknown> {

		@Override
		public PlocUnknown invoke(final Object[] children) {
			return new PlocUnknown(children);
		}

	};
}
