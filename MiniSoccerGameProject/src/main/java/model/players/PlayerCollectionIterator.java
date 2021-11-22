package model.players;

import java.util.Iterator;
import java.util.List;

public class PlayerCollectionIterator implements Iterator<GamePlayer>{
	private List<GamePlayer> players;
	private int current;
	private int cap;
	PlayerCollectionIterator(PlayerCollection players){
		this.players = players.getList();
		cap = players.getList().size();
		current = 0;
	}
	
	public boolean hasNext() {
		return this.current < this.cap;	
	}
	
	public GamePlayer next() {
		GamePlayer next = (GamePlayer) this.players.get(current);
		this.current++;
		return next;
	}
	
}