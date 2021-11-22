package model.players;

import java.awt.Color;

public class PlayerFactory {
	static public GamePlayer getPlayer(String playerType) {
		if(playerType.equals("goalkeeper")) {
			return new Goalkeeper("Goalkeeper", new Color(200,100,200));
		}else if(playerType.equals("striker")) {
			return new Striker("Striker", new Color(150,150,20));
		}else {
			return null;
		}
				
	}
}
