package silver.langutil.pp;

public final class Psoftbreak extends common.FunctionNode {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_softbreak;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Psoftbreak() {
		this(new Object[]{});
	}

	public Psoftbreak(final Object[] args) {
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
		return "silver:langutil:pp:softbreak";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Psoftbreak(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//group(line())
		 return (silver.langutil.pp.NDocument)(((silver.langutil.pp.NDocument)new silver.langutil.pp.Pgroup(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } })));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:softbreak", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Psoftbreak.invoke(args);
		}

	};
}
