package silver.langutil;

public final class PlocationLte extends common.FunctionNode {

	public static final int i_l1 = 0;
	public static final int i_l2 = 1;

	public static final Class<?> childTypes[] = {silver.langutil.NLocation.class, silver.langutil.NLocation.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_locationLte;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l1] = new common.Lazy[silver.langutil.NLocation.num_inh_attrs];
	childInheritedAttributes[i_l2] = new common.Lazy[silver.langutil.NLocation.num_inh_attrs];
	}

	public PlocationLte(final Object c_l1, final Object c_l2) {
		this(new Object[]{c_l1, c_l2});
	}

	public PlocationLte(final Object[] args) {
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
		return "silver:langutil:locationLte";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PlocationLte(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case l1, l2 of loc(c1, l1, f1), loc(c2, l2, f2) -> ! (f1 > f2 || (f1 == f2 && (l1 > l2 || (l1 == l2 && c1 > c2)))) end
		 return (Boolean)(new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.langutil.Ploc) { final common.Thunk<Object> __SV_LOCAL___sv_sc_632f1 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_633l1 = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(1); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_634c1 = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(2); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.langutil.Ploc) { final common.Thunk<Object> __SV_LOCAL___sv_sc_637f2 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_638l2 = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(1); } };
final common.Thunk<Object> __SV_LOCAL___sv_sc_639c2 = new common.Thunk<Object>(context) { public final Object doEval() { return (Integer)scrutinee.childAsIs(2); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_c2 = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_639c2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_l2 = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_638l2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_f2 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)(__SV_LOCAL___sv_sc_637f2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_c1 = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_634c1.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_l1 = new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)(__SV_LOCAL___sv_sc_633l1.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_f1 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)(__SV_LOCAL___sv_sc_632f1.eval())); } };
return (!((((common.StringCatter)(__SV_LOCAL_f1.eval())).toString().compareTo(((common.StringCatter)(__SV_LOCAL_f2.eval())).toString()) > 0) || (((common.StringCatter)(__SV_LOCAL_f1.eval())).equals(((common.StringCatter)(__SV_LOCAL_f2.eval()))) && ((((Integer)(__SV_LOCAL_l1.eval())) > ((Integer)(__SV_LOCAL_l2.eval()))) || (((Integer)(__SV_LOCAL_l1.eval())).equals(((Integer)(__SV_LOCAL_l2.eval()))) && (((Integer)(__SV_LOCAL_c1.eval())) > ((Integer)(__SV_LOCAL_c2.eval())))))))); } }).eval()); } }).eval()); } }).eval()); } }).eval()); } }).eval()); } }).eval()); }scrutineeIter = scrutineeIter.forward();}return ((Boolean)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:langutil 'Location.sv', 25, 9\n"))}));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.langutil.PlocationLte.i_l2)); }scrutineeIter = scrutineeIter.forward();}return ((Boolean)core.Perror.invoke(new Object[]{(new common.StringCatter("Error: pattern match failed at silver:langutil 'Location.sv', 25, 9\n"))}));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.langutil.PlocationLte.i_l1)));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:locationLte", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PlocationLte.invoke(args);
		}

	};
}
