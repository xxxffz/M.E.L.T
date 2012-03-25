package simple.host.driver;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.host.driver.Init.preInit) return;

		simple.host.driver.Init.preInit = true;

		simple.terminals.Init.initAllStatics();
		simple.abstractsyntax.Init.initAllStatics();
		simple.concretesyntax.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.host.driver.Init.init) return;

		simple.host.driver.Init.init = true;

		simple.host.driver.Init.setupInheritedAttributes();

		simple.terminals.Init.init();
		simple.abstractsyntax.Init.init();
		simple.concretesyntax.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();
		core.Init.init();

		simple.host.driver.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.host.driver.Init.postInit) return;

		simple.host.driver.Init.postInit = true;

		simple.terminals.Init.postInit();
		simple.abstractsyntax.Init.postInit();
		simple.concretesyntax.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();
		core.Init.postInit();


	}

	private static void setupInheritedAttributes(){
		//	local attribute isF::IOVal<Boolean>;
		simple.host.driver.Pdriver.localInheritedAttributes[simple.host.driver.Init.isF__ON__simple_host_driver_driver] = new common.Lazy[core.NIOVal.num_inh_attrs];
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.isF__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:isF";
		//	local attribute text::IOVal<String>;
		simple.host.driver.Pdriver.localInheritedAttributes[simple.host.driver.Init.text__ON__simple_host_driver_driver] = new common.Lazy[core.NIOVal.num_inh_attrs];
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.text__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:text";
		//	local attribute result::ParseResult<cst:Root>;
		simple.host.driver.Pdriver.localInheritedAttributes[simple.host.driver.Init.result__ON__simple_host_driver_driver] = new common.Lazy[core.NParseResult.num_inh_attrs];
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.result__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:result";
		//	local attribute r_cst::cst:Root;
		simple.host.driver.Pdriver.localInheritedAttributes[simple.host.driver.Init.r_cst__ON__simple_host_driver_driver] = new common.Lazy[simple.concretesyntax.NRoot.num_inh_attrs];
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.r_cst__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:r_cst";
		//	local attribute r_ast::ast:Root;
		simple.host.driver.Pdriver.localInheritedAttributes[simple.host.driver.Init.r_ast__ON__simple_host_driver_driver] = new common.Lazy[simple.abstractsyntax.NRoot.num_inh_attrs];
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.r_ast__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:r_ast";
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.print_success__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:print_success";
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.write_success__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:write_success";
		simple.host.driver.Pdriver.occurs_local[simple.host.driver.Init.print_failure__ON__simple_host_driver_driver] = "simple:host:driver:driver:local:print_failure";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION driver IO ::= args::String io_in::IO the_parser::(ParseResult<cst:Root> ::= String String) 
		// isF = isFile(args, io_in)
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.isF__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PisFile.invoke(new Object[]{context.childAsIsLazy(simple.host.driver.Pdriver.i_args), context.childAsIsLazy(simple.host.driver.Pdriver.i_io_in)})); } };
		// text = readFile(args, isF.io)
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.text__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PreadFile.invoke(new Object[]{context.childAsIsLazy(simple.host.driver.Pdriver.i_args), new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(simple.host.driver.Init.isF__ON__simple_host_driver_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } }})); } };
		// result = the_parser(text.iovalue, args)
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.result__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NParseResult)((common.NodeFactory<core.NParseResult>)context.childAsIs(simple.host.driver.Pdriver.i_the_parser)).invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)context.localDecorated(simple.host.driver.Init.text__ON__simple_host_driver_driver).synthesized(core.Init.core_iovalue__ON__core_IOVal)); } }, context.childAsIsLazy(simple.host.driver.Pdriver.i_args)})); } };
		// r_cst = result.parseTree
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.r_cst__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.concretesyntax.NRoot)context.localDecorated(simple.host.driver.Init.result__ON__simple_host_driver_driver).synthesized(core.Init.core_parseTree__ON__core_ParseResult)); } };
		// r_ast = r_cst.ast
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.r_ast__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((simple.abstractsyntax.NRoot)context.localDecorated(simple.host.driver.Init.r_cst__ON__simple_host_driver_driver).synthesized(simple.concretesyntax.Init.silver_langutil_ast__ON__simple_concretesyntax_Root)); } };
		// print_success = print("Command line arguments: " ++ args ++ "\n\n" ++ "CST pretty print: \n" ++ r_cst.unparse ++ "\n\n" ++ "AST pretty print: \n" ++ pp:show(100, r_ast.pp) ++ "\n\n" ++ "Errors: " ++ (if null(r_ast.errors) then " No semantic errors!\n" else "\n" ++ implode("", ppMessages(r_ast.errors)) ++ "\n"), text.io)
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.print_success__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.Pprint.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Command line arguments: ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childAsIs(simple.host.driver.Pdriver.i_args)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("CST pretty print: \n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(simple.host.driver.Init.r_cst__ON__simple_host_driver_driver).synthesized(simple.concretesyntax.Init.silver_langutil_unparse__ON__simple_concretesyntax_Root)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("AST pretty print: \n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)silver.langutil.pp.Pshow.invoke(new Object[]{Integer.valueOf((int)100), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)context.localDecorated(simple.host.driver.Init.r_ast__ON__simple_host_driver_driver).synthesized(simple.abstractsyntax.Init.silver_langutil_pp__ON__simple_abstractsyntax_Root)); } }})), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("Errors: ")), (common.StringCatter)(((Boolean)core.Pnull.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)context.localDecorated(simple.host.driver.Init.r_ast__ON__simple_host_driver_driver).synthesized(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Root)); } }})) ? (new common.StringCatter(" No semantic errors!\n")) : new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)core.Pimplode.invoke(new Object[]{(new common.StringCatter("")), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)silver.langutil.PppMessages.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)context.localDecorated(simple.host.driver.Init.r_ast__ON__simple_host_driver_driver).synthesized(simple.abstractsyntax.Init.silver_langutil_errors__ON__simple_abstractsyntax_Root)); } }})); } }})), (common.StringCatter)(new common.StringCatter("\n"))))))))))))))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(simple.host.driver.Init.text__ON__simple_host_driver_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } }})); } };
		// write_success = writeFile("output.c", r_ast.ast:c_code, print_success)
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.write_success__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.PwriteFile.invoke(new Object[]{(new common.StringCatter("output.c")), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)context.localDecorated(simple.host.driver.Init.r_ast__ON__simple_host_driver_driver).synthesized(simple.abstractsyntax.Init.simple_abstractsyntax_c_code__ON__simple_abstractsyntax_Root)); } }, context.localAsIsLazy(simple.host.driver.Init.print_success__ON__simple_host_driver_driver)})); } };
		// print_failure = print("Encountered a parse error:\n" ++ result.parseErrors ++ "\n", text.io)
		simple.host.driver.Pdriver.localAttributes[simple.host.driver.Init.print_failure__ON__simple_host_driver_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.Pprint.invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Encountered a parse error:\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(simple.host.driver.Init.result__ON__simple_host_driver_driver).synthesized(core.Init.core_parseErrors__ON__core_ParseResult)), (common.StringCatter)(new common.StringCatter("\n")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(simple.host.driver.Init.text__ON__simple_host_driver_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } }})); } };
	}

	public static int count_local__ON__simple_host_driver_driver = 0;
public static final int isF__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
public static final int text__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
public static final int result__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
public static final int r_cst__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
public static final int r_ast__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
public static final int print_success__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
public static final int write_success__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
public static final int print_failure__ON__simple_host_driver_driver = simple.host.driver.Init.count_local__ON__simple_host_driver_driver++;
}
