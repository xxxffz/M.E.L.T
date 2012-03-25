package simple.abstractsyntax;

public final class PisBoolean extends common.FunctionNode {

	public static final int i_t = 0;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NType.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_isBoolean;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_t] = new common.Lazy[simple.abstractsyntax.NType.num_inh_attrs];
	}

	public PisBoolean(final Object c_t) {
		this(new Object[]{c_t});
	}

	public PisBoolean(final Object[] args) {
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
		return "simple:abstractsyntax:isBoolean";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PisBoolean(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case t of booleanType() -> true | _ -> false end
		 return (Boolean)(((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_474 = new common.Thunk<Object>(context) { public final Object doEval() { return false; } };
return new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.PbooleanType) {  return (Boolean)true; }scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL___fail_474.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(simple.abstractsyntax.PisBoolean.i_t)); } }).eval()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:isBoolean", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PisBoolean.invoke(args);
		}

	};
}
