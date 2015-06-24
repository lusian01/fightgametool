/******************************************************************************
' Filename    : Characterclass.java
' Name        : Team 5, Kalpa(안계완, 손성민, 이용석)
' Purpose     : Game Character class for fighting game
' History     :
'               2015. 06/25 Team Kalpa
'               1. First Draft
******************************************************************************/
package testpro;

import javax.*;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.*;


//This class is used for characters of this fighting game
public class Characterclass 
{
	static int x_direction=65;
	static int y_direction=65;
	
	// this enum shows the player's locate variable.
	public enum ourMap 
	{
		WATER, LAND, DEAD, MY_ANT, ENEMY_ANT; //map tile type defin.
		    
		// this tile type is LAND || DEAD is return true. return true is move to this.
		public boolean isUnoccupied() 
		{
			if (this == LAND || this == DEAD)
			{
				return true;
			}

			return false;
		}

	}

	//This enum shows the character's moving
	public enum moveDir
	{
		UP, LEFT, RIGHT, DOWN;
	}

	//This Array is the map of this game
	static ourMap u_map[][] = new ourMap[x_direction][y_direction];

	//This function makes the map into LAND
	public void map_init()
	{
		for (int first_Index = 0; first_Index < x_direction; first_Index++)
		{
			for (int second_Index = 0; second_Index < y_direction; second_Index++)
			{
				u_map[first_Index][second_Index] = ourMap.LAND;
			}
		}

	}

	//This class shows the characters status, direction of x, direction of y
	public static class Character 
	{
		String name;
		int hp = 10;
		int dir_x;
		int dir_y;
		ourMap my_map[][] = new ourMap[x_direction][y_direction];

		//This function makes the character's map into LAND
		public void map_Init() 
		{
			for (int fist_Index = 0; fist_Index < x_direction; fist_Index++) 
			{
				for (int second_Index = 0; second_Index < y_direction; second_Index++) 
				{
					my_map[fist_Index][second_Index] = ourMap.LAND;
				}
			}

		}

		//This Constructor make the Character using parameters
		public Character(int x, int y, String name)
		{
			this.name = name;
			u_map[x][y]=ourMap.MY_ANT;
			my_map[x][y]=ourMap.MY_ANT;
			dir_x = x;
			dir_y = y;
			map_Init();
		}

		//This function determined the characters map and game map which depends on characters move
		public void moveChar(moveDir dir) 
		{
			switch (dir)
			{
			case UP: // character moves up
				if (dir_y <2) //direction is not ok. (over range) 
				{

				}
				else
				{

					if (u_map[dir_x][dir_y - 1].isUnoccupied()) 
					{
						my_map[dir_x][dir_y - 1] = ourMap.MY_ANT;
						my_map[dir_x][dir_y    ] = ourMap.LAND;
						 u_map[dir_x][dir_y    ] = ourMap.LAND;
						 u_map[dir_x][dir_y - 1] = ourMap.MY_ANT;
						dir_y                    = dir_y - 1;

					}

				}
				break;
			case LEFT: // character moves left
				if (dir_x < 2) //direction is not ok. (over range)
				{

				}
				else
				{

					if (u_map[dir_x - 1][dir_y].isUnoccupied()) 
					{
						my_map[dir_x - 1][dir_y] = ourMap.MY_ANT;
						my_map[dir_x    ][dir_y] = ourMap.LAND;
				   		 u_map[dir_x - 1][dir_y] = ourMap.MY_ANT;
					     u_map[dir_x    ][dir_y] = ourMap.LAND;
						dir_x                    = dir_x - 1;
					}
				}
				break;
			case RIGHT: // character moves right
				if (dir_x > x_direction-3)//direction is not ok. (over range)
				{

				} 
				else
				{

					if (u_map[dir_x + 1][dir_y].isUnoccupied()) 
					{
						my_map[dir_x + 1][dir_y] = ourMap.MY_ANT;
						my_map[dir_x    ][dir_y] = ourMap.LAND;
						 u_map[dir_x + 1][dir_y] = ourMap.MY_ANT;
						 u_map[dir_x    ][dir_y] = ourMap.LAND;
						dir_x                    = dir_x + 1;

					}
				}
				break;
			case DOWN: // character moves down. (over range)
				if (dir_y > y_direction-3) 
				{

				} 
				else
				{

					if (u_map[dir_x][dir_y + 1].isUnoccupied())
					{
						my_map[dir_x][dir_y + 1] = ourMap.MY_ANT;
						my_map[dir_x][dir_y    ] = ourMap.LAND;
					     u_map[dir_x][dir_y + 1] = ourMap.MY_ANT;
					 	 u_map[dir_x][dir_y    ] = ourMap.LAND;
						dir_y                    = dir_y + 1;
					}
				}
				break;
			}

		}

		//This function search the other player who is the player's enemy
		public boolean searchEnemy() 
		{
			if (u_map[dir_x][dir_y - 1] != my_map[dir_x][dir_y - 1]) 
			{	
				return true;
			}
			else if (u_map[dir_x][dir_y + 1] != my_map[dir_x][dir_y + 1])
			{
			
				return true;
			}
			else if (u_map[dir_x - 1][dir_y] != my_map[dir_x - 1][dir_y])
			{
			
				return true;
			} 
			else if (u_map[dir_x + 1][dir_y] != my_map[dir_x + 1][dir_y])
			{
			
				return true;
			}
			else
			{
				return false;
			}

		}

	}

	//This function can be used attack the enemy who locate near player.
	public void attackEnemy(Character attacker, Character defender)
	{
		if (defender.hp > 0)
		{
			if (attacker.dir_x - 1 == defender.dir_x && attacker.dir_y == defender.dir_y)
			{
				defender.hp--;
			} 
			else if (attacker.dir_x + 1 == defender.dir_x && attacker.dir_y == defender.dir_y)
			{
				defender.hp--;
			}
			else if (attacker.dir_x == defender.dir_x && attacker.dir_y - 1 == defender.dir_y)
			{
				defender.hp--;
			}
			else if (attacker.dir_x == defender.dir_x && attacker.dir_y + 1 == defender.dir_y) 
			{
				defender.hp--;
			}
			System.out.println("player1 hp : " + player1.hp + " player2 hp : " + player2.hp);
			if (defender.hp <= 0) 
			{
				System.out.println(attacker.name);
				System.out.println("Finish");
				System.exit(0);
			}
		}
	}

	Character player1 = new Character((int) (Math.random() * (x_direction-2))+1, (int) (Math.random() * (y_direction-2))+1, "Player1");
	Character player2 = new Character((int) (Math.random() * (x_direction-2))+1, (int) (Math.random() * (y_direction-2))+1, "Player2");

}
