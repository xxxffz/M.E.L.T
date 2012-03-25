package silver.langutil;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(silver.langutil.Init.preInit) return;

		silver.langutil.Init.preInit = true;

		silver.langutil.pp.Init.initAllStatics();
		core.Init.initAllStatics();

	}

	public static void init(){
		if(silver.langutil.Init.init) return;

		silver.langutil.Init.init = true;

		silver.langutil.Init.setupInheritedAttributes();

		silver.langutil.pp.Init.init();
		core.Init.init();

		silver.langutil.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(silver.langutil.Init.postInit) return;

		silver.langutil.Init.postInit = true;

		silver.langutil.pp.Init.postInit();
		core.Init.postInit();


		common.Decorator.applyDecorators(silver.langutil.NMessage.decorators, Perr.class);
		common.Decorator.applyDecorators(silver.langutil.NMessage.decorators, Pwrn.class);
		common.Decorator.applyDecorators(silver.langutil.NLocation.decorators, Ploc.class);
	}

	private static void setupInheritedAttributes(){
		silver.langutil.NMessage.occurs_syn[silver.langutil.Init.silver_langutil_unparse__ON__silver_langutil_Message] = "silver:langutil:unparse";
		silver.langutil.NMessage.occurs_syn[silver.langutil.Init.silver_langutil_location__ON__silver_langutil_Message] = "silver:langutil:location";
		silver.langutil.NLocation.occurs_syn[silver.langutil.Init.silver_langutil_unparse__ON__silver_langutil_Location] = "silver:langutil:unparse";
		silver.langutil.NLocation.occurs_syn[silver.langutil.Init.silver_langutil_line__ON__silver_langutil_Location] = "silver:langutil:line";
	}

	private static void initProductionAttributeDefinitions(){
		silver.langutil.Perr.initProductionAttributeDefinitions();
		silver.langutil.Pwrn.initProductionAttributeDefinitions();
		//FUNCTION containsErrors Boolean ::= l::Decorated core:List<Message> wError::Boolean 
		//FUNCTION ppMessages Decorated core:List<String> ::= msgs::Decorated core:List<Message> 
		//FUNCTION messageLte Boolean ::= m1::Message m2::Message 
		silver.langutil.Ploc.initProductionAttributeDefinitions();
		//FUNCTION locationLte Boolean ::= l1::Location l2::Location 
	}

	public static int count_inh__ON__Message = 0;
	public static int count_syn__ON__Message = 0;
	public static int count_local__ON__silver_langutil_err = 0;
	public static int count_local__ON__silver_langutil_wrn = 0;
	public static int count_local__ON__silver_langutil_containsErrors = 0;
	public static int count_local__ON__silver_langutil_ppMessages = 0;
	public static int count_local__ON__silver_langutil_messageLte = 0;
	public static int count_inh__ON__Location = 0;
	public static int count_syn__ON__Location = 0;
	public static int count_local__ON__silver_langutil_loc = 0;
	public static int count_local__ON__silver_langutil_locationLte = 0;
public static final int silver_langutil_unparse__ON__silver_langutil_Message = silver.langutil.Init.count_syn__ON__Message++;
public static final int silver_langutil_location__ON__silver_langutil_Message = silver.langutil.Init.count_syn__ON__Message++;
public static final int silver_langutil_unparse__ON__silver_langutil_Location = silver.langutil.Init.count_syn__ON__Location++;
public static final int silver_langutil_line__ON__silver_langutil_Location = silver.langutil.Init.count_syn__ON__Location++;
}
