package silver.langutil;

// top::Location ::= file::String line::Integer column::Integer 
public final class Ploc extends silver.langutil.NLocation {

	public static final int i_file = 0;
	public static final int i_line = 1;
	public static final int i_column = 2;

	public static final Class<?> childTypes[] = {common.StringCatter.class, Integer.class, Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_loc;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.langutil.NLocation.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.langutil.NLocation.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Ploc(final Object c_file, final Object c_line, final Object c_column) {
		this(new Object[]{c_file, c_line, c_column});
	}

	public Ploc(final Object[] args) {
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
		return "silver:langutil:loc";
	}

	static void initProductionAttributeDefinitions() {
		// top.unparse = file ++ ":" ++ toString(line) ++ "." ++ toString(column)
		silver.langutil.Ploc.synthesizedAttributes[silver.langutil.Init.silver_langutil_unparse__ON__silver_langutil_Location] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childAsIs(silver.langutil.Ploc.i_file)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(":")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(String.valueOf(((Integer)context.childAsIs(silver.langutil.Ploc.i_line))))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(".")), (common.StringCatter)(new common.StringCatter(String.valueOf(((Integer)context.childAsIs(silver.langutil.Ploc.i_column))))))))); } };
		// top.line = line
		silver.langutil.Ploc.synthesizedAttributes[silver.langutil.Init.silver_langutil_line__ON__silver_langutil_Location] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.childAsIs(silver.langutil.Ploc.i_line)); } };
	}

	public static final common.NodeFactory<Ploc> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Ploc> {

		@Override
		public Ploc invoke(final Object[] children) {
			return new Ploc(children);
		}

	};
}
