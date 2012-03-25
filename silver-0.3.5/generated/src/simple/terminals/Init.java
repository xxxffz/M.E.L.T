package simple.terminals;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(simple.terminals.Init.preInit) return;

		simple.terminals.Init.preInit = true;

		core.Init.initAllStatics();

	}

	public static void init(){
		if(simple.terminals.Init.init) return;

		simple.terminals.Init.init = true;

		simple.terminals.Init.setupInheritedAttributes();

		core.Init.init();

		simple.terminals.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(simple.terminals.Init.postInit) return;

		simple.terminals.Init.postInit = true;

		core.Init.postInit();


	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
	}

}
