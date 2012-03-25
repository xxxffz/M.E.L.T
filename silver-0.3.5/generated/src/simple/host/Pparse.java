package simple.host;

public final class Pparse extends common.FunctionNode {

	public static final int i_stringToParse = 0;
	public static final int i_filenameToReport = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_host_parse;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pparse(final Object c_stringToParse, final Object c_filenameToReport) {
		this(new Object[]{c_stringToParse, c_filenameToReport});
	}

	public Pparse(final Object[] args) {
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
		return "simple:host:parse";
	}

	public static core.NParseResult invoke(final Object[] args) {
		try {
		try {
			return new core.PparseSucceeded( new simple.host.Parser_simple_host_parse().parse(new java.io.StringReader(((common.StringCatter)common.Util.demand(args[0])).toString()), ((common.StringCatter)common.Util.demand(args[1])).toString()) );
		} catch(edu.umn.cs.melt.copper.runtime.logging.CopperParserException e) {
			return new core.PparseFailed( new common.StringCatter(e.getMessage()) );
		} catch(Throwable t) {
			throw new common.exceptions.TraceException("An error occured while parsing", t);
		}
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:host:parse", t); }
	}
	public static final common.NodeFactory<core.NParseResult> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NParseResult> {

		@Override
		public core.NParseResult invoke(final Object[] args) {
			return Pparse.invoke(args);
		}

	};
}
