package silver.util.deque;

public final class PdqIsEmpty extends common.FunctionNode {

	public static final int i_q = 0;

	public static final Class<?> childTypes[] = {silver.util.deque.NDeque.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_util_deque_dqIsEmpty;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_q] = new common.Lazy[silver.util.deque.NDeque.num_inh_attrs];
	}

	public PdqIsEmpty(final Object c_q) {
		this(new Object[]{c_q});
	}

	public PdqIsEmpty(final Object[] args) {
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
		return "silver:util:deque:dqIsEmpty";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PdqIsEmpty(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case q of deque(_, rn, _, ln) -> ln == 0 && rn == 0 end
		 return (Boolean)(new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.util.deque.Pdeque) { final common.Thunk<Object> __SV_LOCAL___sv_sc_932ln = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_933 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(1); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_934rn = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(2); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_935 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(3); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_rn = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_934rn.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_ln = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_932ln.eval())); } };
return (((Integer)(__SV_LOCAL_ln.eval())).equals(Integer.valueOf((int)0)) && ((Integer)(__SV_LOCAL_rn.eval())).equals(Integer.valueOf((int)0))); } }).eval()); } }).eval()); }scrutineeIter = scrutineeIter.forward();}return ((Boolean)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:util:deque 'Deque.sv', 62, 9\n"))}));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.util.deque.PdqIsEmpty.i_q)));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:util:deque:dqIsEmpty", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PdqIsEmpty.invoke(args);
		}

	};
}
