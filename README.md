# Library for Game Algorithms Check  

Hello there! I’m **Kalpa**, the library is make for fighting game algorithms check.

## Game Alogrithms Check

**gamemain.java** is a main java file. gameamain.java is initialization to make player.
<br><pre>make frame;
</pre>

**charaterclass.java** is a character java file. characterclass.java is make player, map. 
<pre>
ourMap my_map[][] = new ourMap[16][16];
Character player1 = new Character(1, 14, "Player1");
Character player2 = new Character(1, 1, "Player2");
</pre>
**map** is default 16x16 size.<br>
**Character parameter** is start_x, start_y, name.<br>
**player hp** is default 10. (int hp = 10;)<br> 
**player hp** initailization to Charaterclass.java > Charater (class)<br>
**player** is initialazation to static Characterclass character_c = new Characterclass(); 
<br><pre>character acceccs is
character_c.player1;
character_c.player2;</pre> 

## Player function   

### Player1
player1 is use player1_Thread.java. this file is include for player's all activity.
<br>
**your character is**
<pre>gamemain.character_c.player1.</pre>
 using for select.<br>
 
 ***this function is move for your charater.***
			
	gamemain.character_c.player1.moveChar(moveDir.UP);
	

possible using  direction is
<pre>moveDir.UP
moveDir.DOWN
moveDir.LEFT
moveDir.RIGHT
</pre>

***find enermy function***
<pre>
gamemain.character_c.player1.searchEnemy();
</pre>
this function is if find enemy, return true. <br>
not find enermy, return false.

***attack enermy function***
<pre>
gamemain.character_c.attackEnemy(attacker, defender);
</pre>
this function is attacker is attack to defender.<br>
***ex code)*** gamemain.character_c.attackEnemy(gamemain.character_c.player1,
						gamemain.character_c.player2);
<br>
***Caution***<br>
not change to player1 to player2. <br>
because ***lose your turn*** and possible your ***self attack***.

### Player2
player1 is use player2_Thread.java. this file is include for player's all activity.
<br>
**your character is**
<pre>gamemain.character_c.player2.</pre>
 using for select.<br>
 
 ***this function is move for your charater.***
			
	gamemain.character_c.player2.moveChar(moveDir.UP);
	

possible using  direction is
<pre>moveDir.UP
moveDir.DOWN
moveDir.LEFT
moveDir.RIGHT
</pre>

***find enermy function***
<pre>
gamemain.character_c.player2.searchEnemy();
</pre>
this function is if find enemy, return true. <br>
not find enermy, return false.

***attack enermy function***
<pre>
gamemain.character_c.attackEnemy(attacker, defender);
</pre>
this function is attacker is attack to defender.<br>
***ex code)*** gamemain.character_c.attackEnemy(gamemain.character_c.player2,
						gamemain.character_c.player1);

***Caution***<br>
not change to player1 to player2. <br>
because ***lose your turn*** and possible your ***self attack***.
<br>
<br>
<br>
<center> <pre>** - END - ** </pre></center>
