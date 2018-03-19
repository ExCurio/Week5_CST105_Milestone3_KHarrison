/** Program: NFL Player Manager Class
 * File: NFLPLayerManager.java
 * Summary: This file creates the NFL Player Manager array of players, constructor, method, and testing.
 *
 * Author: Keith Harrison
 * Date: 3/17/2018
 * 
 */

import java.util.*;

public class NFLPlayerManager {

	
    //Creation of ArrayList LIST-OF_PLAYERS
    public static ArrayList<NFLPlayer> LIST_OF_PLAYERS = new ArrayList<NFLPlayer>();

	public NFLPlayerManager() {
		createPlayers();
	}

        //Creating players
	public void createPlayers() {
		NFLPlayer keenum = new NFLPlayer("Case Keenum", 30, 215, 73, "Houston", 22, 481, 325, 67.6, 98.3);
		NFLPlayer brady = new NFLPlayer("Tom Brady", 40, 225, 76, "Michigan", 32, 581, 385, 66.3, 102.8);
		NFLPlayer foles = new NFLPlayer("Nick Foles", 29, 243, 78, "Arizona", 5, 101, 57, 56.4, 79.5);
		NFLPlayer brees = new NFLPlayer("Drew Brees", 39, 209, 72, "Purdue", 23, 536, 386, 72, 103.9);
		NFLPlayer bortles = new NFLPlayer("Blake Bortles", 25, 236, 77, "Central Florida", 21, 523, 315, 60.2, 84.7);
		NFLPlayer roethlisberger = new NFLPlayer("Ben Roethlisberger", 36, 240, 77, "Miami", 28, 561, 360, 64.2, 93.4);
		

		
                //Adding players to ArrayList
                LIST_OF_PLAYERS.add(keenum);
		LIST_OF_PLAYERS.add(brady);
		LIST_OF_PLAYERS.add(foles);
		LIST_OF_PLAYERS.add(brees);
		LIST_OF_PLAYERS.add(bortles);
		LIST_OF_PLAYERS.add(roethlisberger);

	}

	public String toString() {
		String list = "";
		for (NFLPlayer n : LIST_OF_PLAYERS)
			list += (n.name + " " + LIST_OF_PLAYERS.indexOf(n) + "\n");
		return list;
	}
    public static void main(String[] args) {
        
                // Testing the constructor
		NFLPlayerManager test = new NFLPlayerManager();

		// Testing toString
		System.out.println(test.toString());

		// Testing Getters
		System.out.println("\nNFL Player Manager's Getter Test: Keenum's Passing Attempts are " + NFLPlayerManager.LIST_OF_PLAYERS.get(0).getAttempts()
				+ ". Keenum's Touchdowns are " + NFLPlayerManager.LIST_OF_PLAYERS.get(0).getTouchdowns() + ".");
		
		// Testing Setters
		NFLPlayerManager.LIST_OF_PLAYERS.get(0).setAttempts(20);
		NFLPlayerManager.LIST_OF_PLAYERS.get(0).setTouchdowns(100);
		System.out.println("NFL Player Manager's Setter Test: Keenum's Passing Attempts now equals " + NFLPlayerManager.LIST_OF_PLAYERS.get(0).getAttempts() + 
                        ". Keenum's Touchdowns now equals " + NFLPlayerManager.LIST_OF_PLAYERS.get(0).getTouchdowns() + ".");
                
                
                NFLPlayer.nflPlayerTest();
    }
    
}
