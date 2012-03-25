package silver.langutil;

public final class PcontainsErrors extends common.FunctionNode {

	public static final int i_l = 0;
	public static final int i_wError = 1;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class, Boolean.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_containsErrors;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PcontainsErrors(final Object c_l, final Object c_wError) {
		this(new Object[]{c_l, c_wError});
	}

	public PcontainsErrors(final Object[] args) {
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
		return "silver:langutil:containsErrors";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PcontainsErrors(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case l of [] -> false | err(_, _)::_ -> true | wrn(_, _)::t -> if wError then true else containsErrors(t, false) | _::t -> containsErrors(t, wError) end
		 return (Boolean)(new common.PatternLazy<common.ConsCell, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_610 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_611 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_614 = new common.Thunk<Object>(context) { public final Object doEval() { return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_t = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_611.eval())); } };
return ((Boolean)silver.langutil.PcontainsErrors.invoke(new Object[]{__SV_LOCAL_t, context.childAsIsLazy(silver.langutil.PcontainsErrors.i_wError)})); } }).eval()); } };
return new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.langutil.Perr) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_616 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_617 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)true; }
else if(scrutineeNode instanceof silver.langutil.Pwrn) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_619 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_620 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_t = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_611.eval())); } };
return (((Boolean)context.childAsIs(silver.langutil.PcontainsErrors.i_wError)) ? true : ((Boolean)silver.langutil.PcontainsErrors.invoke(new Object[]{__SV_LOCAL_t, false}))); } }).eval()); }scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL___fail_614.eval()));}}.eval(context, (common.DecoratedNode)((silver.langutil.NMessage)(__SV_LOCAL___sv_tmp_pv_610.eval())).decorate(context, (common.Lazy[])null)); } }).eval()); }
else if(scrutinee.nil()) { return (Boolean)false; }return ((Boolean)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:langutil 'Message.sv', 44, 9\n"))}));}}.eval(context, (common.ConsCell)((common.ConsCell)context.childAsIs(silver.langutil.PcontainsErrors.i_l))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:containsErrors", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PcontainsErrors.invoke(args);
		}

	};
}
