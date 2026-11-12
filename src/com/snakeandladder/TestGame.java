package com.snakeandladder;

import java.util.ArrayList;
import java.util.List;

public class TestGame {
	
		public static void main(String[]args) {
			Player p1=new Player("yasaswa");
			Player p2=new Player("sudheer");
			
			List<Player> players=new ArrayList<Player>();
			players.add(p1);
			players.add(p2);
			
			SnakeAndLadder.startGame(players);
		}

}
