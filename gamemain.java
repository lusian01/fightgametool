package testpro;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.*;

import testpro.Characterclass.moveDir;
import testpro.Characterclass.ourMap;

public class gamemain extends JFrame 
{	 
	 Characterclass character_c = new Characterclass();
	 
	 
	 public gamemain()
	 {
		 
		 super("Game Dialog");
		 character_c.map_init();
		 setBounds(100 , 100 , 500 ,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
		 Container contentPane = this.getContentPane();
		 JPanel pane = new JPanel();
	 
		 contentPane.add(pane);
	  
		 setVisible(true);
		 
		
		 
		while(true)
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
		
			
			character_c.player1.moveChar(moveDir.LEFT);
			character_c.player2.moveChar(moveDir.RIGHT);
			if(character_c.player2.searchEnemy())
			{
				character_c.attackEnemy(character_c.player2, character_c.player1);
				System.out.println(character_c.player1 + "의 hp는 " + character_c.player1.hp);
			}
			
		}
		 
	 }
	 
	 public static void main(String[] args)
	{
		  new gamemain();
	}
	 
	 public void paint(Graphics g)
	 {
		g.clearRect(0, 0, 500, 500);
		g.setColor(Color.red); 
	    g.drawOval((character_c.player1.dir_x+4)*10, (character_c.player1.dir_y+4)*10, 20, 20);             //원그리기
	    g.setColor(Color.blue); 
	    g.drawOval((character_c.player2.dir_x+4)*10, (character_c.player2.dir_y+4)*10, 20, 20);             //원그리기
	     
	     
	 }
}
