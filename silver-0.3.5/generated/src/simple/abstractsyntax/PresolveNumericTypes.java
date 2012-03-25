package simple.abstractsyntax;

public final class PresolveNumericTypes extends common.FunctionNode {

	public static final int i_lType = 0;
	public static final int i_rType = 1;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NType.class, simple.abstractsyntax.NType.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_resolveNumericTypes;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_lType] = new common.Lazy[simple.abstractsyntax.NType.num_inh_attrs];
	childInheritedAttributes[i_rType] = new common.Lazy[simple.abstractsyntax.NType.num_inh_attrs];
	}

	public PresolveNumericTypes(final Object c_lType, final Object c_rType) {
		this(new Object[]{c_lType, c_rType});
	}

	public PresolveNumericTypes(final Object[] args) {
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
		return "simple:abstractsyntax:resolveNumericTypes";
	}

	public static simple.abstractsyntax.NType invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PresolveNumericTypes(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case lType, rType of integerType(), integerType() -> integerType() | integerType(), floatType() -> floatType() | floatType(), integerType() -> floatType() | floatType(), floatType() -> floatType() | _, _ -> errorType() end
		 return (simple.abstractsyntax.NType)(((simple.abstractsyntax.NType)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_382 = new common.Thunk<Object>(context) { public final Object doEval() { return ((simple.abstractsyntax.NType)new simple.abstractsyntax.PerrorType()); } };
return new common.PatternLazy<common.DecoratedNode, simple.abstractsyntax.NType>() { public final simple.abstractsyntax.NType eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PfloatType) {  return (simple.abstractsyntax.NType)new common.PatternLazy<common.DecoratedNode, simple.abstractsyntax.NType>() { public final simple.abstractsyntax.NType eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PfloatType) {  return (simple.abstractsyntax.NType)((simple.abstractsyntax.NType)new simple.abstractsyntax.PfloatType()); }
else if(scrutineeNode instanceof simple.abstractsyntax.PintegerType) {  return (simple.abstractsyntax.NType)((simple.abstractsyntax.NType)new simple.abstractsyntax.PfloatType()); }scrutineeIter = scrutineeIter.forward();}return ((simple.abstractsyntax.NType)(__SV_LOCAL___fail_382.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(simple.abstractsyntax.PresolveNumericTypes.i_rType)); }
else if(scrutineeNode instanceof simple.abstractsyntax.PintegerType) {  return (simple.abstractsyntax.NType)new common.PatternLazy<common.DecoratedNode, simple.abstractsyntax.NType>() { public final simple.abstractsyntax.NType eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PfloatType) {  return (simple.abstractsyntax.NType)((simple.abstractsyntax.NType)new simple.abstractsyntax.PfloatType()); }
else if(scrutineeNode instanceof simple.abstractsyntax.PintegerType) {  return (simple.abstractsyntax.NType)((simple.abstractsyntax.NType)new simple.abstractsyntax.PintegerType()); }scrutineeIter = scrutineeIter.forward();}return ((simple.abstractsyntax.NType)(__SV_LOCAL___fail_382.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(simple.abstractsyntax.PresolveNumericTypes.i_rType)); }scrutineeIter = scrutineeIter.forward();}return ((simple.abstractsyntax.NType)(__SV_LOCAL___fail_382.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(simple.abstractsyntax.PresolveNumericTypes.i_lType)); } }).eval()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:resolveNumericTypes", t); }
	}
	public static final common.NodeFactory<simple.abstractsyntax.NType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<simple.abstractsyntax.NType> {

		@Override
		public simple.abstractsyntax.NType invoke(final Object[] args) {
			return PresolveNumericTypes.invoke(args);
		}

	};
}
