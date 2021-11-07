package model.players;

import java.awt.Color;

public class PlayerFactory {
	public GamePlayer getPlayer(String playerType) {
		if(playerType.equals("striker")) {
			return new Goalkeeper("goalie", new Color(200,100,200));
		}else if(playerType.equals("goalkeeper")) {
			return new Striker("striker", new Color(200,100,200));
		}else {
			return null;
		}
				
	}
}
