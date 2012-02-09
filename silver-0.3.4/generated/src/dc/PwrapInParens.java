package dc;

public final class PwrapInParens extends common.FunctionNode {

	public static final int i_enclosingPrecedence = 0;
	public static final int i_thisPrecedence = 1;
	public static final int i_thisPosition = 2;
	public static final int i_opAssociativity = 3;

	public static final Class<?> childTypes[] = {Integer.class, Integer.class, common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__dc_wrapInParens;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PwrapInParens(final Object c_enclosingPrecedence, final Object c_thisPrecedence, final Object c_thisPosition, final Object c_opAssociativity) {
		this(new Object[]{c_enclosingPrecedence, c_thisPrecedence, c_thisPosition, c_opAssociativity});
	}

	public PwrapInParens(final Object[] args) {
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
		return "dc:wrapInParens";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PwrapInParens(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//enclosingPrecedence > thisPrecedence || (enclosingPrecedence == thisPrecedence && thisPosition != opAssociativity)
		 return (Boolean)(((((Integer)context.childAsIs(dc.PwrapInParens.i_enclosingPrecedence)) > ((Integer)context.childAsIs(dc.PwrapInParens.i_thisPrecedence))) || (((Integer)context.childAsIs(dc.PwrapInParens.i_enclosingPrecedence)).equals(((Integer)context.childAsIs(dc.PwrapInParens.i_thisPrecedence))) && !((common.StringCatter)context.childAsIs(dc.PwrapInParens.i_thisPosition)).equals(((common.StringCatter)context.childAsIs(dc.PwrapInParens.i_opAssociativity))))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function dc:wrapInParens", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PwrapInParens.invoke(args);
		}

	};
}
