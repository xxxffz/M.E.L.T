package silver.langutil.pp;

public final class Pprune extends common.FunctionNode {

	public static final int i_p = 0;
	public static final int i_q = 1;

	public static final Class<?> childTypes[] = {Integer.class, silver.util.deque.NDeque.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_prune;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_q] = new common.Lazy[silver.util.deque.NDeque.num_inh_attrs];
	}

	public Pprune(final Object c_p, final Object c_q) {
		this(new Object[]{c_p, c_q});
	}

	public Pprune(final Object[] args) {
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
		return "silver:langutil:pp:prune";
	}

	public static core.NPair invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pprune(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if dqIsEmpty(q) then pair(q, []) else let h :: Pair<Integer Decorated core:List<Boolean>> = dqHead(q) in if p <= h.fst then pair(q, []) else let recur :: Pair<Deque<Pair<Integer Decorated core:List<Boolean>>> Decorated core:List<Boolean>> = prune(p, dqTail(q)) in pair(recur.fst, (false :: (h.snd ++ recur.snd))) end end
		 return (core.NPair)((((Boolean)silver.util.deque.PdqIsEmpty.invoke(new Object[]{common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pprune.i_q))})) ? ((core.NPair)new core.Ppair(common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pprune.i_q)), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } })) : ((core.NPair)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_h = new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NPair)silver.util.deque.PdqHead.invoke(new Object[]{common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pprune.i_q))})); } };
return ((((Integer)context.childAsIs(silver.langutil.pp.Pprune.i_p)) <= ((Integer)((core.NPair)(__SV_LOCAL_h.eval())).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_fst__ON__core_Pair))) ? ((core.NPair)new core.Ppair(common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pprune.i_q)), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } })) : ((core.NPair)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_recur = new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NPair)silver.langutil.pp.Pprune.invoke(new Object[]{context.childAsIsLazy(silver.langutil.pp.Pprune.i_p), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.util.deque.NDeque)silver.util.deque.PdqTail.invoke(new Object[]{common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.langutil.pp.Pprune.i_q))})); } }})); } };
return ((core.NPair)new core.Ppair(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.util.deque.NDeque)((core.NPair)(__SV_LOCAL_recur.eval())).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_fst__ON__core_Pair)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{false, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)((core.NPair)(__SV_LOCAL_h.eval())).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_snd__ON__core_Pair)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)((core.NPair)(__SV_LOCAL_recur.eval())).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_snd__ON__core_Pair)); } }})); } }})); } })); } }).eval())); } }).eval())));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:pp:prune", t); }
	}
	public static final common.NodeFactory<core.NPair> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NPair> {

		@Override
		public core.NPair invoke(final Object[] args) {
			return Pprune.invoke(args);
		}

	};
}
