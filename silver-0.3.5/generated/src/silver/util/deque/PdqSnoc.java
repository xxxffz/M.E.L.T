package silver.util.deque;

public final class PdqSnoc extends common.FunctionNode {

	public static final int i_q = 0;
	public static final int i_e = 1;

	public static final Class<?> childTypes[] = {silver.util.deque.NDeque.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_util_deque_dqSnoc;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_q] = new common.Lazy[silver.util.deque.NDeque.num_inh_attrs];
	}

	public PdqSnoc(final Object c_q, final Object c_e) {
		this(new Object[]{c_q, c_e});
	}

	public PdqSnoc(final Object[] args) {
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
		return "silver:util:deque:dqSnoc";
	}

	public static silver.util.deque.NDeque invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PdqSnoc(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case q of deque(r, rn, l, ln) -> dqCheck(ln, l, rn + 1, (e :: r)) end
		 return (silver.util.deque.NDeque)(new common.PatternLazy<common.DecoratedNode, silver.util.deque.NDeque>() { public final silver.util.deque.NDeque eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.util.deque.Pdeque) { final common.Thunk<Object> __SV_LOCAL___sv_sc_867ln = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_868l = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(1); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_869rn = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(2); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_870r = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(3); } };
 return (silver.util.deque.NDeque)((silver.util.deque.NDeque)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_r = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)(__SV_LOCAL___sv_sc_870r.eval())); } };
return ((silver.util.deque.NDeque)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_rn = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_869rn.eval())); } };
return ((silver.util.deque.NDeque)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_l = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)(__SV_LOCAL___sv_sc_868l.eval())); } };
return ((silver.util.deque.NDeque)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_ln = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_867ln.eval())); } };
return ((silver.util.deque.NDeque)silver.util.deque.PdqCheck.invoke(new Object[]{__SV_LOCAL_ln, __SV_LOCAL_l, new common.Thunk<Object>(context) { public final Object doEval() { return Integer.valueOf(((Integer)(__SV_LOCAL_rn.eval())) + Integer.valueOf((int)1)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childAsIsLazy(silver.util.deque.PdqSnoc.i_e), __SV_LOCAL_r})); } }})); } }).eval()); } }).eval()); } }).eval()); } }).eval()); }scrutineeIter = scrutineeIter.forward();}return ((silver.util.deque.NDeque)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:util:deque 'Deque.sv', 41, 9\n"))}));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.util.deque.PdqSnoc.i_q)));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:util:deque:dqSnoc", t); }
	}
	public static final common.NodeFactory<silver.util.deque.NDeque> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.util.deque.NDeque> {

		@Override
		public silver.util.deque.NDeque invoke(final Object[] args) {
			return PdqSnoc.invoke(args);
		}

	};
}
