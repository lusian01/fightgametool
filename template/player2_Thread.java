/******************************************************************************
' Filename    : player2_Thread.java
' Name        : Team 5, Kalpa(안계완, 손성민, 이용석)
' Purpose     : The source code is written for your own algorithm to allow comparison with the other algorithms are algorithms which compare better.
' History     :
'               2015. 06/25 Team Kalpa
'               1. First Draft
******************************************************************************/
package testpro;

import testpro.Characterclass.moveDir;

public class player2_Thread extends Thread {

	synchronized public void run() {
		while (true) {
			
			//---------------------Start the algorithm of player2's move-------------------------//
			
			//---------------------end the algorithm of player2's move-------------------------//

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
