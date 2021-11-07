package model.players;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PlayerCollection implements Iterable{
	private List<GamePlayer> players;
	
	PlayerCollection(){
		players = new ArrayList<GamePlayer>();
	}
	
	public void addPlayer(GamePlayer player) {
		this.players.add(player);
	}
	
	public void removePlayer(GamePlayer player) {
		this.players.remove(player);
	}
	
	public GamePlayer get(String playerType) {
		PlayerCollectionIterator itr = new PlayerCollectionIterator(this.players);
		
	}

	@Override
	public Iterator<PlayerCollection> iterator() {
		return new PlayerCollectionIterator(this);
	}
}
