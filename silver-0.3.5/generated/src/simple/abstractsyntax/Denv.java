package simple.abstractsyntax;

import java.util.*;

public class Denv extends common.Decorator {

public static final Denv singleton = new Denv();

	public void decorate(Class production) {
		decorateAutoCopy(production, "simple:abstractsyntax:env");
	}
}
