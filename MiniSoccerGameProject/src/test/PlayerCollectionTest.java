package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import model.players.PlayerCollection;
import model.players.PlayerFactory;
import model.players.GamePlayer;

class PlayerCollectionTest {

	@Test
	void intantiatePlayerCollection() {
		PlayerCollection players = new PlayerCollection();
		assertNotNull(players);
	}
	
	@Test
	void addPlayers() {
		PlayerCollection players = new PlayerCollection();
		players.add(PlayerFactory.getPlayer("goalkeeper"));
		players.add(PlayerFactory.getPlayer("striker"));
		assertEquals(players.get("goalkeeper").getPlayerName().toLowerCase(), "goalkeeper");
		assertEquals(players.get("striker").getPlayerName().toLowerCase(), "striker");
	}

	@Test
	void iteratePlayerCollection() {
		PlayerCollection players = new PlayerCollection();
		players.add(PlayerFactory.getPlayer("goalkeeper"));
		players.add(PlayerFactory.getPlayer("striker"));
		for(GamePlayer p: players) {
			assertNotNull(p);
		}
	}
}
