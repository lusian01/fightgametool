/******************************************************************************
' Filename    : gamemain.java
' Name        : Team 5, Kalpa(안계완, 손성민, 이용석)
' Purpose     : the main source of the fighting game
' History     :
'               2015. 06/25 Team Kalpa
'               1. First Draft
******************************************************************************/
package testpro;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//This class is the ui of this fighting game
public class gamemain extends JFrame 
{
	static Characterclass character_c = new Characterclass();

	//This constructructor make the thread of players and make the dialog
	public gamemain() 
	{
		super("Game Dialog");
		
		character_c.map_init();
		
		setBounds(100, 100, 800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		JPanel pane = new JPanel();

		contentPane.add(pane);

		setVisible(true);

		//make the threads
		Thread player1 = new player1_Thread();
		Thread player2 = new player2_Thread();

		//using threads
		player2.start();
		player1.start();


		while (true)
		{
			repaint();
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	//main of this project
	public static void main(String[] args) 
	{
		new gamemain();
	}

	//painting players who are located in this game
	public void paint(Graphics g) 
	{
		g.clearRect(0, 0, 800, 800);
		
		g.setColor(Color.red);
		g.drawOval((character_c.player1.dir_x + 4) * 10,
				(character_c.player1.dir_y + 4) * 10, 20, 20); // draw the circle
		
		g.setColor(Color.blue);
		g.drawOval((character_c.player2.dir_x + 4) * 10,
				(character_c.player2.dir_y + 4) * 10, 20, 20); // draw the circle

	}
}