package org.nasdanika.bank.app;

import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.Action;
import org.nasdanika.web.ValueAction;
import org.nasdanika.web.Route;

/**
 * Route to demonstrate/test HTMLFactory capabilities
 *
 */
public class NasdanikaBankRoute implements Route {

	@Override
	public Action execute(HttpServletRequestContext context, Object... args) throws Exception {
		return new ValueAction("Nasdanika Bank Works!!!");
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public void close() throws Exception {
		// NOP
	}

}
