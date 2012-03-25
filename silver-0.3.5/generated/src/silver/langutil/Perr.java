package silver.langutil;

// top::Message ::= l::Location m::String 
public final class Perr extends silver.langutil.NMessage {

	public static final int i_l = 0;
	public static final int i_m = 1;

	public static final Class<?> childTypes[] = {silver.langutil.NLocation.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_err;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.langutil.NMessage.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.langutil.NMessage.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l] = new common.Lazy[silver.langutil.NLocation.num_inh_attrs];
	}

	public Perr(final Object c_l, final Object c_m) {
		this(new Object[]{c_l, c_m});
	}

	public Perr(final Object[] args) {
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
		return "silver:langutil:err";
	}

	static void initProductionAttributeDefinitions() {
		// top.unparse = l.unparse ++ ": error: " ++ m
		silver.langutil.Perr.synthesizedAttributes[silver.langutil.Init.silver_langutil_unparse__ON__silver_langutil_Message] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(silver.langutil.Perr.i_l).synthesized(silver.langutil.Init.silver_langutil_unparse__ON__silver_langutil_Location)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(": error: ")), (common.StringCatter)((common.StringCatter)context.childAsIs(silver.langutil.Perr.i_m)))); } };
		// top.location = l
		silver.langutil.Perr.synthesizedAttributes[silver.langutil.Init.silver_langutil_location__ON__silver_langutil_Message] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.childDecorated(silver.langutil.Perr.i_l).undecorate(); } };
	}

	public static final common.NodeFactory<Perr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Perr> {

		@Override
		public Perr invoke(final Object[] children) {
			return new Perr(children);
		}

	};
}
