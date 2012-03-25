package simple.extensions.matrix;

// t::TypeExpr ::= 
public final class PtypeExprMatrix extends simple.abstractsyntax.NTypeExpr {


	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__simple_extensions_matrix_typeExprMatrix;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[simple.abstractsyntax.NTypeExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[simple.abstractsyntax.NTypeExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PtypeExprMatrix() {
		this(new Object[]{});
	}

	public PtypeExprMatrix(final Object[] args) {
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
		return "simple:extensions:matrix:typeExprMatrix";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = text("Matrix")
		simple.extensions.matrix.PtypeExprMatrix.synthesizedAttributes[simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("Matrix")))); } };
		// t.type = matrixType()
		simple.extensions.matrix.PtypeExprMatrix.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_type__ON__simple_abstractsyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NType)new simple.extensions.matrix.PmatrixType()); } };
		// t.c_code = "struct matrix"
		simple.extensions.matrix.PtypeExprMatrix.synthesizedAttributes[simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_TypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("struct matrix")); } };
	}

	public static final common.NodeFactory<PtypeExprMatrix> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtypeExprMatrix> {

		@Override
		public PtypeExprMatrix invoke(final Object[] children) {
			return new PtypeExprMatrix(children);
		}

	};
}
