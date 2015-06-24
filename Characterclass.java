package testpro;

import javax.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Characterclass  {
	
	public enum ourMap {
	    /** Water tile. */
	    WATER,
	    /** Land tile. */
	    LAND,
	    /** Dead ant tile. */
	    DEAD,
	    /** My ant tile. */
	    MY_ANT,
	    /** Enemy ant tile. */
	    ENEMY_ANT;
	    /**
	     * Checks if this type of tile is passable, which means it is not a water tile.
	     * 
	     * @return <code>true</code> if this is not a water tile, <code>false</code> otherwise
	     */
	    
	    /**
	     * Checks if this type of tile is unoccupied, which means it is a land tile or a dead ant tile.
	     * 
	     * @return <code>true</code> if this is a land tile or a dead ant tile, <code>false</code>
	     *         otherwise
	     */
	    public boolean isUnoccupied() 
	    {
	    	if(this==LAND || this == DEAD)
	      	{
	    		return true;
	    	}
	    	
	    	return false;
	    }
	    
	    
	}
	public enum moveDir {
		UP,
		LEFT,
		RIGHT,
		DOWN;
	}

	static ourMap u_map[][] = new ourMap[16][16];

	public void map_init()
	{
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<15;j++)
			{
				u_map[i][j]=ourMap.LAND;
			}
		}
			
	}

	public static class Character {
	  int hp = 10;
	  int dir_x;
	  int dir_y;
	  ourMap my_map[][] = new ourMap[16][16];
	
	  public void map_init()
		{
			for(int i=0; i<15; i++)
			{
				for(int j=0; j<15;j++)
				{
					my_map[i][j]=ourMap.LAND;
				}
			}
				
		}
	  
	  public Character(int x, int y)
	  {
		  dir_x = x;
		  dir_y = y;
		  map_init();
	  }
	  
	  public void moveChar( moveDir dir)
	  {
		  switch(dir)
		  {
			case UP: //전
				if(dir_y == 0) 
				{
				
				}
				else 
				{
					
					if(u_map[dir_x][dir_y-1].isUnoccupied())
					{
						my_map[dir_x][dir_y-1] = ourMap.MY_ANT;
						my_map[dir_x][dir_y] = ourMap.LAND;
						u_map[dir_x][dir_y] = ourMap.LAND;
						u_map[dir_x][dir_y-1] = ourMap.MY_ANT;
						dir_y = dir_y -1;
				
					}
					
				}
				break;
			case LEFT: //좌
				if(dir_x < 1) 
				{
				
				}
				else
				{
				
					if(u_map[dir_x-1][dir_y].isUnoccupied())
					{
						my_map[dir_x-1][dir_y] = ourMap.MY_ANT;
						my_map[dir_x][dir_y] = ourMap.LAND;
						u_map[dir_x-1][dir_y] = ourMap.MY_ANT;
						u_map[dir_x][dir_y] = ourMap.LAND;
						dir_x = dir_x -1;
						
					}
				}
			  	break;
			case RIGHT: //우
				if(dir_x >= 14)
				{
				
				}
				else
				{
				
					if(u_map[dir_x+1][dir_y].isUnoccupied())
					{
						my_map[dir_x+1][dir_y] = ourMap.MY_ANT;
						my_map[dir_x][dir_y] = ourMap.LAND;
						u_map[dir_x+1][dir_y] = ourMap.MY_ANT;
						u_map[dir_x][dir_y] = ourMap.LAND;
						dir_x = dir_x +1;
					
					}
				}
				  break;
			case DOWN: //후
				if(dir_y > 13)
				{
				
				}
				else 
				{
				
					if(u_map[dir_x][dir_y+1].isUnoccupied())
					{
						my_map[dir_x][dir_y+1] = ourMap.MY_ANT;
						my_map[dir_x][dir_y] = ourMap.LAND;
						u_map[dir_x][dir_y+1] = ourMap.MY_ANT;
						u_map[dir_x][dir_y] = ourMap.LAND;
						dir_y = dir_y +1;
					}
				}
			  	break;
		  }
		  System.out.println(dir_x + ", " + dir_y);
	  }
	  public boolean searchEnemy() 
	  {
		  if(u_map[dir_x][dir_y-1] != my_map[dir_x][dir_y-1])
		  {
			  System.out.println("up");
			  return true;
		  }
		  else if(u_map[dir_x][dir_y+1] != my_map[dir_x][dir_y+1])
		  {
			  System.out.println("down");

			  return true;
		  }
		  else if(u_map[dir_x-1][dir_y] != my_map[dir_x-1][dir_y])
		  {
			  System.out.println("left");

			  return true;
		  }
		  else if(u_map[dir_x+1][dir_y] != u_map[dir_x+1][dir_y])
		  {
			  System.out.println("right");

			  return true;
		  }
		  else
		  {
			  return false;
		  }

	  }

	}
	
	public void attackEnemy(Character player1, Character player2)
	  {
		  if(player1.dir_x-1== player2.dir_x && player1.dir_y == player2.dir_y )
		  {
			  player2.hp--;
		  }
		  else if(player1.dir_x +1== player2.dir_x && player1.dir_y == player2.dir_y )
		  {
			  player2.hp--;
		  }
		  else if(player1.dir_x == player2.dir_x && player1.dir_y-1 == player2.dir_y )
		  {
			  player2.hp--;
		  }
		  else if(player1.dir_x == player2.dir_x && player1.dir_y+1 == player2.dir_y )
		  {
			  player2.hp--;
		  }
		  
		  if(player2.hp <= 0)
		  {
			  System.out.println("Finish");
			  System.exit(0);
		  }
	  }



	Character player1 = new Character(14,1);
	Character player2 = new Character(1,1);
	
		
		 

}

