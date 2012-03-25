package silver.util.deque;

public final class PdqCheck extends common.FunctionNode {

	public static final int i_lenf = 0;
	public static final int i_f = 1;
	public static final int i_lenr = 2;
	public static final int i_r = 3;

	public static final Class<?> childTypes[] = {Integer.class, common.DecoratedNode.class, Integer.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_util_deque_dqCheck;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PdqCheck(final Object c_lenf, final Object c_f, final Object c_lenr, final Object c_r) {
		this(new Object[]{c_lenf, c_f, c_lenr, c_r});
	}

	public PdqCheck(final Object[] args) {
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
		return "silver:util:deque:dqCheck";
	}

	public static silver.util.deque.NDeque invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PdqCheck(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if lenf > 2 * lenr + 1 then let fprime :: Decorated core:List<a> = take(mid, f), rprime :: Decorated core:List<a> = r ++ reverse(drop(mid, f)) in deque(mid, fprime, rest, rprime) end else if lenr > 2 * lenf + 1 then let rprime :: Decorated core:List<a> = take(mid, r), fprime :: Decorated core:List<a> = f ++ reverse(drop(mid, r)) in deque(rest, fprime, mid, rprime) end else deque(lenf, f, lenr, r)
		 return (silver.util.deque.NDeque)(((((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenf)) > Integer.valueOf(Integer.valueOf(Integer.valueOf((int)2) * ((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenr))) + Integer.valueOf((int)1))) ? ((silver.util.deque.NDeque)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_fprime = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptake.invoke(new Object[]{context.localAsIsLazy(silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck), context.childAsIsLazy(silver.util.deque.PdqCheck.i_f)})); } };
final common.Thunk<Object> __SV_LOCAL_rprime = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childAsIsLazy(silver.util.deque.PdqCheck.i_r), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Preverse.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pdrop.invoke(new Object[]{context.localAsIsLazy(silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck), context.childAsIsLazy(silver.util.deque.PdqCheck.i_f)})); } }})); } }})); } };
return ((silver.util.deque.NDeque)new silver.util.deque.Pdeque(context.localAsIsLazy(silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck), __SV_LOCAL_fprime, context.localAsIsLazy(silver.util.deque.Init.rest__ON__silver_util_deque_dqCheck), __SV_LOCAL_rprime)); } }).eval()) : ((((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenr)) > Integer.valueOf(Integer.valueOf(Integer.valueOf((int)2) * ((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenf))) + Integer.valueOf((int)1))) ? ((silver.util.deque.NDeque)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_rprime = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptake.invoke(new Object[]{context.localAsIsLazy(silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck), context.childAsIsLazy(silver.util.deque.PdqCheck.i_r)})); } };
final common.Thunk<Object> __SV_LOCAL_fprime = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new Object[]{context.childAsIsLazy(silver.util.deque.PdqCheck.i_f), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Preverse.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pdrop.invoke(new Object[]{context.localAsIsLazy(silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck), context.childAsIsLazy(silver.util.deque.PdqCheck.i_r)})); } }})); } }})); } };
return ((silver.util.deque.NDeque)new silver.util.deque.Pdeque(context.localAsIsLazy(silver.util.deque.Init.rest__ON__silver_util_deque_dqCheck), __SV_LOCAL_fprime, context.localAsIsLazy(silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck), __SV_LOCAL_rprime)); } }).eval()) : ((silver.util.deque.NDeque)new silver.util.deque.Pdeque(context.childAsIsLazy(silver.util.deque.PdqCheck.i_lenf), context.childAsIsLazy(silver.util.deque.PdqCheck.i_f), context.childAsIsLazy(silver.util.deque.PdqCheck.i_lenr), context.childAsIsLazy(silver.util.deque.PdqCheck.i_r))))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:util:deque:dqCheck", t); }
	}
	public static final common.NodeFactory<silver.util.deque.NDeque> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.util.deque.NDeque> {

		@Override
		public silver.util.deque.NDeque invoke(final Object[] args) {
			return PdqCheck.invoke(args);
		}

	};
}
