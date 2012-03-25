package silver.langutil.pp;

// top::Document ::= s::String 
public final class Ptext extends silver.langutil.pp.NDocument {

	public static final int i_s = 0;

	public static final Class<?> childTypes[] = {common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_pp_text;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.langutil.pp.NDocument.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.langutil.pp.NDocument.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Ptext(final Object c_s) {
		this(new Object[]{c_s});
	}

	public Ptext(final Object[] args) {
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
		return "silver:langutil:pp:text";
	}

	static void initProductionAttributeDefinitions() {
		// pr = prune(top.outPosition, top.inDq)
		silver.langutil.pp.Ptext.localAttributes[silver.langutil.pp.Init.pr__ON__silver_langutil_pp_text] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NPair)silver.langutil.pp.Pprune.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((Integer)context.synthesized(silver.langutil.pp.Init.silver_langutil_pp_outPosition__ON__silver_langutil_pp_Document)); } }, context.contextInheritedLazy(silver.langutil.pp.Init.silver_langutil_pp_inDq__ON__silver_langutil_pp_Document)})); } };
		// top.outPosition = top.inPosition + length(s)
		silver.langutil.pp.Ptext.synthesizedAttributes[silver.langutil.pp.Init.silver_langutil_pp_outPosition__ON__silver_langutil_pp_Document] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(((Integer)context.inherited(silver.langutil.pp.Init.silver_langutil_pp_inPosition__ON__silver_langutil_pp_Document)) + Integer.valueOf(((common.StringCatter)((common.StringCatter)context.childAsIs(silver.langutil.pp.Ptext.i_s))).length())); } };
		// top.outDq = pr.fst
		silver.langutil.pp.Ptext.synthesizedAttributes[silver.langutil.pp.Init.silver_langutil_pp_outDq__ON__silver_langutil_pp_Document] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.util.deque.NDeque)context.localDecorated(silver.langutil.pp.Init.pr__ON__silver_langutil_pp_text).synthesized(core.Init.core_fst__ON__core_Pair)); } };
		// top.outCHorizontals = top.inCHorizontals
		silver.langutil.pp.Ptext.synthesizedAttributes[silver.langutil.pp.Init.silver_langutil_pp_outCHorizontals__ON__silver_langutil_pp_Document] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.inherited(silver.langutil.pp.Init.silver_langutil_pp_inCHorizontals__ON__silver_langutil_pp_Document)); } };
		// top.outRemaining = top.inRemaining - length(s)
		silver.langutil.pp.Ptext.synthesizedAttributes[silver.langutil.pp.Init.silver_langutil_pp_outRemaining__ON__silver_langutil_pp_Document] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(((Integer)context.inherited(silver.langutil.pp.Init.silver_langutil_pp_inRemaining__ON__silver_langutil_pp_Document)) - Integer.valueOf(((common.StringCatter)((common.StringCatter)context.childAsIs(silver.langutil.pp.Ptext.i_s))).length())); } };
		// top.result = s
		silver.langutil.pp.Ptext.synthesizedAttributes[silver.langutil.pp.Init.silver_langutil_pp_result__ON__silver_langutil_pp_Document] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(silver.langutil.pp.Ptext.i_s)); } };
		// top.horizontals = pr.snd
		silver.langutil.pp.Ptext.synthesizedAttributes[silver.langutil.pp.Init.silver_langutil_pp_horizontals__ON__silver_langutil_pp_Document] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.localDecorated(silver.langutil.pp.Init.pr__ON__silver_langutil_pp_text).synthesized(core.Init.core_snd__ON__core_Pair)); } };
	}

	public static final common.NodeFactory<Ptext> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Ptext> {

		@Override
		public Ptext invoke(final Object[] children) {
			return new Ptext(children);
		}

	};
}
