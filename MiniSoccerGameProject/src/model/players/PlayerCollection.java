package model.players;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PlayerCollection implements Iterable<GamePlayer>{
	private List<GamePlayer> players;
	
	public PlayerCollection(){
		players = new ArrayList<GamePlayer>();
	}
	
	public void add(GamePlayer player) {
		this.players.add(player);
	}
	
	public void removePlayer(GamePlayer player) {
		this.players.remove(player);
	}
	
	public GamePlayer get(String playerType) {
		GamePlayer curPlayer;
		PlayerCollectionIterator itr = new PlayerCollectionIterator(this);
		while(itr.hasNext()) {
			curPlayer = itr.next();
			System.out.println("curPlayer: " + curPlayer.getPlayerName());
			if(curPlayer.getPlayerName().toLowerCase().equals(playerType.toLowerCase())) {
				return curPlayer;
			}
		}
		return null;
		
	}
	
	public List<GamePlayer >getList() {
		return this.players;
	}

	@Override
	public Iterator<GamePlayer> iterator() {
		return new PlayerCollectionIterator(this);
	}

	public void sort() {
		this.players.sort(null);
	}
}
