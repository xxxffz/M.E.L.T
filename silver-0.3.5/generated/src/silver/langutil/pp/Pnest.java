package silver.langutil.pp;

// top::Document ::= depth::Integer d::Document 
public final class Pnest extends silver.langutil.pp.NDocument {

	public static final int i_depth = 0;
	public static final int i_d = 1;

	public static final Class<?> childTypes[] = {Integer.class, silver.langutil.pp.NDocument.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_nest;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.langutil.pp.NDocument.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_d] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	}

	public Pnest(final Object c_depth, final Object c_d) {
		this(new Object[]{c_depth, c_d});
	}

	public Pnest(final Object[] args) {
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
		return context.childDecorated(silver.langutil.pp.Pnest.i_d).undecorate();
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
		return "silver:langutil:pp:nest";
	}

	static void initProductionAttributeDefinitions() {
		// forward.indent = top.indent + depth
		silver.langutil.pp.Pnest.forwardInheritedAttributes[silver.langutil.pp.Init.silver_langutil_pp_indent__ON__silver_langutil_pp_Document] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(((Integer)context.inherited(silver.langutil.pp.Init.silver_langutil_pp_indent__ON__silver_langutil_pp_Document)) + ((Integer)context.childAsIs(silver.langutil.pp.Pnest.i_depth))); } };
	}

	public static final common.NodeFactory<Pnest> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pnest> {

		@Override
		public Pnest invoke(final Object[] children) {
			return new Pnest(children);
		}

	};
}
