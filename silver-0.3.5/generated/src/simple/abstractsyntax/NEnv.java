package simple.abstractsyntax;

import java.util.*;

public abstract class NEnv extends common.Node {

	public static final int num_inh_attrs = Init.count_inh__ON__Env;
	public static final int num_syn_attrs = Init.count_syn__ON__Env;

	public static final String[] occurs_inh = new String[num_inh_attrs];
	public static final String[] occurs_syn = new String[num_syn_attrs];
	public static final LinkedList<common.Decorator> decorators = new LinkedList<common.Decorator>();

	protected NEnv(Object[] children) {
		super(children);
	}

	@Override
	public final int getNumberOfInhAttrs() {
		return num_inh_attrs;
	}

	@Override
	public final int getNumberOfSynAttrs() {
		return num_syn_attrs;
	}

	@Override
	public final String getNameOfInhAttr(final int index) {
		return occurs_inh[index];
	}

	@Override
	public final String getNameOfSynAttr(final int index) {
		return occurs_syn[index];
	}

}
