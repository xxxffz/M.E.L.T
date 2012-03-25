package simple.concretesyntax;

public final class Pname extends common.FunctionNode {

	public static final int i_id = 0;

	public static final Class<?> childTypes[] = {common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_concretesyntax_name;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pname(final Object c_id) {
		this(new Object[]{c_id});
	}

	public Pname(final Object[] args) {
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
		return "simple:concretesyntax:name";
	}

	public static simple.abstractsyntax.NName invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pname(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//ast:name(loc(id.filename, id.line, id.column), id.lexeme)
		 return (simple.abstractsyntax.NName)(((simple.abstractsyntax.NName)new simple.abstractsyntax.Pname(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NLocation)new silver.langutil.Ploc(((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.Pname.i_id)).filename), ((Integer)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.Pname.i_id)).line), ((Integer)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.Pname.i_id)).column))); } }, ((common.StringCatter)((common.TerminalRecord)context.childAsIs(simple.concretesyntax.Pname.i_id)).lexeme))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:concretesyntax:name", t); }
	}
	public static final common.NodeFactory<simple.abstractsyntax.NName> factory = new Factory();

	public static final class Factory extends common.NodeFactory<simple.abstractsyntax.NName> {

		@Override
		public simple.abstractsyntax.NName invoke(final Object[] args) {
			return Pname.invoke(args);
		}

	};
}
