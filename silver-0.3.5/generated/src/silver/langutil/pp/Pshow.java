package silver.langutil.pp;

public final class Pshow extends common.FunctionNode {

	public static final int i_width = 0;
	public static final int i_d = 1;

	public static final Class<?> childTypes[] = {Integer.class, silver.langutil.pp.NDocument.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_show;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_d] = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];
	}

	public Pshow(final Object c_width, final Object c_d) {
		this(new Object[]{c_width, c_d});
	}

	public Pshow(final Object[] args) {
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
		return "silver:langutil:pp:show";
	}

	public static common.StringCatter invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pshow(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//d.result
		 return (common.StringCatter)(((common.StringCatter)context.childDecorated(silver.langutil.pp.Pshow.i_d).synthesized(silver.langutil.pp.Init.silver_langutil_pp_result__ON__silver_langutil_pp_Document)));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:show", t); }
	}
	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {

		@Override
		public common.StringCatter invoke(final Object[] args) {
			return Pshow.invoke(args);
		}

	};
}
