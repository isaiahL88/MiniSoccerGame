package model.players;

import java.awt.Color;

public class PlayerFactory {
	public GamePlayer getPlayer(String playerType) {
		if(playerType.equals("goalkeeper")) {
			return new Goalkeeper("goalkeeper", new Color(200,100,200));
		}else if(playerType.equals("striker")) {
			return new Striker("striker", new Color(100,50,2));
		}else {
			return null;
		}
				
	}
}
