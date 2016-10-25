package io.sarl.demos.gameoflife.environment.agent;

import org.eclipse.xtext.xbase.lib.Pair;

import java.util.EventListener;
import java.util.List;
import java.util.UUID;

/**
 * The interface Environmentlistener.
 *
 * @author Maxime PINARD
 */
public interface EnvironmentListener extends EventListener {

	/**
	 * Handle grid update.
	 *
	 * @param grid the grid
	 */
	void handleGridUpdate(List<List<Pair<UUID, Boolean>>> grid);

}
