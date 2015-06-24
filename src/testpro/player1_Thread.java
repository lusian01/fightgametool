/******************************************************************************
' Filename    : player1_Thread.java
' Name        : Team 5, Kalpa(안계완, 손성민, 이용석)
' Purpose     : The source code is written for your own algorithm to allow comparison with the other algorithms are algorithms which compare better.
' History     :
'               2015. 06/25 Team Kalpa
'               1. First Draft
******************************************************************************/
package testpro;

import testpro.Characterclass.moveDir;

public class player1_Thread extends Thread {

	synchronized public void run() {
		while (true) {

//---------------------Start the algorithm of player1's move-------------------------//
			
			if (gamemain.character_c.player1.searchEnemy()) {
				gamemain.character_c.attackEnemy(gamemain.character_c.player1,
						gamemain.character_c.player2);

			}
		
			      int n = (int) (Math.random() * 4);
			      switch(n)
			      {
			      case 0:
						gamemain.character_c.player1.moveChar(moveDir.UP);
			    	  break;
			      case 1:
						gamemain.character_c.player1.moveChar(moveDir.DOWN);
			    	  break;
			      case 2:
						gamemain.character_c.player1.moveChar(moveDir.LEFT);
			    	  break;
			      case 3:
						gamemain.character_c.player1.moveChar(moveDir.RIGHT);
			    	  break;
			      }
			
			
			//---------------------end the algorithm of player1's move-------------------------//
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
