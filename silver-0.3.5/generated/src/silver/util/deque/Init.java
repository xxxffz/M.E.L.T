package silver.util.deque;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(silver.util.deque.Init.preInit) return;

		silver.util.deque.Init.preInit = true;

		core.Init.initAllStatics();

	}

	public static void init(){
		if(silver.util.deque.Init.init) return;

		silver.util.deque.Init.init = true;

		silver.util.deque.Init.setupInheritedAttributes();

		core.Init.init();

		silver.util.deque.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(silver.util.deque.Init.postInit) return;

		silver.util.deque.Init.postInit = true;

		core.Init.postInit();


		common.Decorator.applyDecorators(silver.util.deque.NDeque.decorators, Pdeque.class);
	}

	private static void setupInheritedAttributes(){
		silver.util.deque.PdqCheck.occurs_local[silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck] = "silver:util:deque:dqCheck:local:mid";
		silver.util.deque.PdqCheck.occurs_local[silver.util.deque.Init.rest__ON__silver_util_deque_dqCheck] = "silver:util:deque:dqCheck:local:rest";
	}

	private static void initProductionAttributeDefinitions(){
		silver.util.deque.Pdeque.initProductionAttributeDefinitions();
		//FUNCTION dqEmpty Deque<a> ::= 
		//FUNCTION dqCons Deque<a> ::= e::a q::Deque<a> 
		//FUNCTION dqHead a ::= q::Deque<a> 
		//FUNCTION dqTail Deque<a> ::= q::Deque<a> 
		//FUNCTION dqSnoc Deque<a> ::= q::Deque<a> e::a 
		//FUNCTION dqLast a ::= q::Deque<a> 
		//FUNCTION dqInit Deque<a> ::= q::Deque<a> 
		//FUNCTION dqIsEmpty Boolean ::= q::Deque<a> 
		//FUNCTION dqReverse Deque<a> ::= q::Deque<a> 
		//FUNCTION dqCheck Deque<a> ::= lenf::Integer f::Decorated core:List<a> lenr::Integer r::Decorated core:List<a> 
		// mid = (lenf + lenr) / 2
		silver.util.deque.PdqCheck.localAttributes[silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(Integer.valueOf(((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenf)) + ((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenr))) / Integer.valueOf((int)2)); } };
		// rest = lenf + lenr - mid
		silver.util.deque.PdqCheck.localAttributes[silver.util.deque.Init.rest__ON__silver_util_deque_dqCheck] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf(Integer.valueOf(((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenf)) + ((Integer)context.childAsIs(silver.util.deque.PdqCheck.i_lenr))) - ((Integer)context.localAsIs(silver.util.deque.Init.mid__ON__silver_util_deque_dqCheck))); } };
	}

	public static int count_inh__ON__Deque = 0;
	public static int count_syn__ON__Deque = 0;
	public static int count_local__ON__silver_util_deque_deque = 0;
	public static int count_local__ON__silver_util_deque_dqEmpty = 0;
	public static int count_local__ON__silver_util_deque_dqCons = 0;
	public static int count_local__ON__silver_util_deque_dqHead = 0;
	public static int count_local__ON__silver_util_deque_dqTail = 0;
	public static int count_local__ON__silver_util_deque_dqSnoc = 0;
	public static int count_local__ON__silver_util_deque_dqLast = 0;
	public static int count_local__ON__silver_util_deque_dqInit = 0;
	public static int count_local__ON__silver_util_deque_dqIsEmpty = 0;
	public static int count_local__ON__silver_util_deque_dqReverse = 0;
	public static int count_local__ON__silver_util_deque_dqCheck = 0;
public static final int mid__ON__silver_util_deque_dqCheck = silver.util.deque.Init.count_local__ON__silver_util_deque_dqCheck++;
public static final int rest__ON__silver_util_deque_dqCheck = silver.util.deque.Init.count_local__ON__silver_util_deque_dqCheck++;
}
