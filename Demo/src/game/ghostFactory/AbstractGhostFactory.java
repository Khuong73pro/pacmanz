package game.ghostFactory;

import game.entities.ghosts.*;

// Tạo ra các bóng ma khác nhau
public abstract class AbstractGhostFactory {
	public abstract Ghost makeGhost(int xPos, int yPos);

}
