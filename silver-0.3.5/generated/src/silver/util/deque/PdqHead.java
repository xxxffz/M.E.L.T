package silver.util.deque;

public final class PdqHead extends common.FunctionNode {

	public static final int i_q = 0;

	public static final Class<?> childTypes[] = {silver.util.deque.NDeque.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_util_deque_dqHead;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_q] = new common.Lazy[silver.util.deque.NDeque.num_inh_attrs];
	}

	public PdqHead(final Object c_q) {
		this(new Object[]{c_q});
	}

	public PdqHead(final Object[] args) {
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
		return "silver:util:deque:dqHead";
	}

	public static Object invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PdqHead(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case q of deque(x::_, _, [], _) -> x | deque(_, _, x::_, _) -> x end
		 return (Object)(new common.PatternLazy<common.DecoratedNode, Object>() { public final Object eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.util.deque.Pdeque) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_820 = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_821 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(1); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_822 = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(2); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_823 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(3); } };
 return (Object)new common.PatternLazy<common.ConsCell, Object>() { public final Object eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_sc_824x = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_825 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((Object)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_x = new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)(__SV_LOCAL___sv_sc_824x.eval())); } };
return ((Object)(__SV_LOCAL_x.eval())); } }).eval()); }
else if(scrutinee.nil()) { return (Object)new common.PatternLazy<common.ConsCell, Object>() { public final Object eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_sc_831x = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_832 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((Object)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_x = new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)(__SV_LOCAL___sv_sc_831x.eval())); } };
return ((Object)(__SV_LOCAL_x.eval())); } }).eval()); }return ((Object)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:util:deque 'Deque.sv', 25, 9\n"))}));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_823.eval()))); }return ((Object)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:util:deque 'Deque.sv', 25, 9\n"))}));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_821.eval()))); }scrutineeIter = scrutineeIter.forward();}return ((Object)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:util:deque 'Deque.sv', 25, 9\n"))}));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.util.deque.PdqHead.i_q)));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:util:deque:dqHead", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return PdqHead.invoke(args);
		}

	};
}
