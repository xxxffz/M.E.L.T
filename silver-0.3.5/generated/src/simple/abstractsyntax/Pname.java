package simple.abstractsyntax;

// n::Name ::= l::Location s::String 
public final class Pname extends simple.abstractsyntax.NName {

	public static final int i_l = 0;
	public static final int i_s = 1;

	public static final Class<?> childTypes[] = {silver.langutil.NLocation.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_name;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NName.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NName.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l] = new common.Lazy[silver.langutil.NLocation.num_inh_attrs];
	}

	public Pname(final Object c_l, final Object c_s) {
		this(new Object[]{c_l, c_s});
	}

	public Pname(final Object[] args) {
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
		return "simple:abstractsyntax:name";
	}

	static void initProductionAttributeDefinitions() {
		// n.name = s
		simple.abstractsyntax.Pname.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_name__ON__simple_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(simple.abstractsyntax.Pname.i_s)); } };
		// n.pp = text(s)
		simple.abstractsyntax.Pname.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext(context.childAsIsLazy(simple.abstractsyntax.Pname.i_s))); } };
		// n.location = l
		simple.abstractsyntax.Pname.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_location__ON__simple_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.childDecorated(simple.abstractsyntax.Pname.i_l).undecorate(); } };
		// n.lookup = lookup(s, n.env)
		simple.abstractsyntax.Pname.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_lookup__ON__simple_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)simple.abstractsyntax.Plookup.invoke(new Object[]{context.childAsIsLazy(simple.abstractsyntax.Pname.i_s), context.contextInheritedLazy(simple.abstractsyntax.Init.simple_abstractsyntax_env__ON__simple_abstractsyntax_Name)})); } };
	}

	public static final common.NodeFactory<Pname> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pname> {

		@Override
		public Pname invoke(final Object[] children) {
			return new Pname(children);
		}

	};
}
