package silver.langutil.pp;

public final class Pbraces extends common.FunctionNode {

	public static final int i_d = 0;

	public static final Class<?> childTypes[] = {silver.langutil.pp.NDocument.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_braces;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_d] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	}

	public Pbraces(final Object c_d) {
		this(new Object[]{c_d});
	}

	public Pbraces(final Object[] args) {
		super(args);
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
		return "silver:langutil:pp:braces";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pbraces(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//cat(cat(text("{"), d), text("}"))
		 return (silver.langutil.pp.NDocument)(((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("{")))); } }, common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pbraces.i_d)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("}")))); } })));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:braces", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Pbraces.invoke(args);
		}

	};
}
