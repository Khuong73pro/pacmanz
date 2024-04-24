package game.ghostFactory;

import game.entities.ghosts.Ghost;
import game.entities.ghosts.Inky;

// Tạo ra bóng ma Inky
public class InkyFactory extends AbstractGhostFactory {
	@Override
	public Ghost makeGhost(int xPos, int yPos) {
		return new Inky(xPos, yPos);
	}

}
