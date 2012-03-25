package simple.composed.simple_all;

public class Main {
	public static void main(String[] args) {
		simple.composed.simple_all.Init.initAllStatics();
		simple.composed.simple_all.Init.init();
		simple.composed.simple_all.Init.postInit();
		try {
			common.Node rv = (common.Node) simple.composed.simple_all.Pmain.invoke(new Object[]{cvargs(args), null});
			common.DecoratedNode drv = rv.decorate(common.TopNode.singleton, (common.Lazy[])null);
			drv.synthesized(core.Init.core_io__ON__core_IOVal); // demand the io token
			System.exit( (Integer)drv.synthesized(core.Init.core_iovalue__ON__core_IOVal) );
		} catch(Throwable t) {
			common.Util.printStackCauses(t);
		}
	}
	public static common.ConsCell cvargs(String [] args){
		common.ConsCell result = common.ConsCell.nil;
		for(int i = args.length - 1; i >= 0; i --) {
			result = new common.ConsCell(new common.StringCatter(args[i]), result);
		}
		return result;
	}
}
