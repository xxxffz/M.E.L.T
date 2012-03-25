package simple.abstractsyntax;

public final class Pppblock extends common.FunctionNode {

	public static final int i_s = 0;

	public static final Class<?> childTypes[] = {simple.abstractsyntax.NStmt.class};

	public static final int num_local_attrs = Init.count_local__ON__simple_abstractsyntax_ppblock;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_s] = new common.Lazy[simple.abstractsyntax.NStmt.num_inh_attrs];
	}

	public Pppblock(final Object c_s) {
		this(new Object[]{c_s});
	}

	public Pppblock(final Object[] args) {
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
		return "simple:abstractsyntax:ppblock";
	}

	public static silver.langutil.pp.NDocument invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pppblock(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//case s of block(_) -> cat(text(" "), s.pp) | _ -> nestlines(3, s.pp) end
		 return (silver.langutil.pp.NDocument)(((silver.langutil.pp.NDocument)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_154 = new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pnestlines.invoke(new Object[]{Integer.valueOf((int)3), context.childSynthesizedLazy(simple.abstractsyntax.Pppblock.i_s, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt)})); } };
return new common.PatternLazy<common.DecoratedNode, silver.langutil.pp.NDocument>() { public final silver.langutil.pp.NDocument eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(scrutineeIter != null) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof simple.abstractsyntax.Pblock) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_158 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(0); } };
 return (silver.langutil.pp.NDocument)((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(" ")))); } }, context.childSynthesizedLazy(simple.abstractsyntax.Pppblock.i_s, simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Stmt))); }scrutineeIter = scrutineeIter.forward();}return ((silver.langutil.pp.NDocument)(__SV_LOCAL___fail_154.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(simple.abstractsyntax.Pppblock.i_s)); } }).eval()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function simple:abstractsyntax:ppblock", t); }
	}
	public static final common.NodeFactory<silver.langutil.pp.NDocument> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.langutil.pp.NDocument> {

		@Override
		public silver.langutil.pp.NDocument invoke(final Object[] args) {
			return Pppblock.invoke(args);
		}

	};
}
