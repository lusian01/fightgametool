# Library for Game Algorithms Check  

안녕하세요, 이 라이브러리는 대전 게임 알고리즘을 확인 하기 위해 만들어 졌습니다.

## Game Alogrithms Check

**gamemain.java** 이 메인 java 파일이며, gameamain.java 를 통해 player를 생성합니다.
<br><pre>make frame;
</pre>
**charaterclass.java** is a character java file. characterclass.java is make player, map. 
<pre>
ourMap my_map[][] = new ourMap[16][16];
Character player1 = new Character(1, 14, "Player1");
Character player2 = new Character(1, 1, "Player2");
</pre>
**map**은 기본으로 65x65 size.<br>
**Character parameter** 는 시작점 x좌표, 시작점 y좌표, 플레이어이름.<br>
**player hp** 는 기본으로 10. (int hp = 10;)<br> 
**player hp** 를 설정하기 위해서는 Charaterclass.java > Charater (class)에서 변경 가능.<br>
**player** 생성은 static Characterclass character_c = new Characterclass()을 통해 생성됩니다. 
<br><pre>character acceccs is
character_c.player1;
character_c.player2;</pre> 

## Player function   

### Player1
player1은 player1_Thread.java를 사용하며 player1의 모든 행동을 포함합니다.
<br>
**player 사용**
<pre>gamemain.character_c.player1.</pre>
 위 코드를 이용하여 player1의 행동을 제어 할수 있습니다.<br>
 
 ***player 이동 함수***
			
	gamemain.character_c.player1.moveChar(moveDir.UP);
	

위의 코드를 이용하여 이동 할 수 있으며, 사용 가능한 방향은 다음과 같습니다.
<pre>moveDir.UP
moveDir.DOWN
moveDir.LEFT
moveDir.RIGHT
</pre>

***적 확인 함수***
<pre>
gamemain.character_c.player1.searchEnemy();
</pre>
위의 함수로 적을 확인 할 수 있으며, 적이 상하좌우에 있을 경우 true를 리턴합니다.

***적 공격 함수***
<pre>
gamemain.character_c.attackEnemy(attacker, defender);
</pre>
this function is attacker is attack to defender.<br>
***ex code)*** gamemain.character_c.attackEnemy(gamemain.character_c.player1,
						gamemain.character_c.player2);
<br>
***주의***<br>
attacker와 defender, player1 과 player2를 혼동해서 사용할 경우 <br> 자신의 턴이 ***소멸*** 하거나 자기 자신을 ***공격***할 수 있습니다.

### Player2
player1은 player1_Thread.java를 사용하며 player1의 모든 행동을 포함합니다.
<br>
**player 사용**
<pre>gamemain.character_c.player2.</pre>
 위 코드를 이용하여 player2의 행동을 제어 할수 있습니다.<br>
 
 ***player 이동 함수***
			
	gamemain.character_c.player2.moveChar(moveDir.UP);
	

위의 코드를 이용하여 이동 할 수 있으며, 사용 가능한 방향은 다음과 같습니다.
<pre>moveDir.UP
moveDir.DOWN
moveDir.LEFT
moveDir.RIGHT
</pre>

***적 확인 함수***
<pre>
gamemain.character_c.player2.searchEnemy();
</pre>
위의 함수로 적을 확인 할 수 있으며, 적이 상하좌우에 있을 경우 true를 리턴합니다.

***적 공격 함수***
<pre>
gamemain.character_c.attackEnemy(attacker, defender);
</pre>
this function is attacker is attack to defender.<br>
***ex code)*** gamemain.character_c.attackEnemy(gamemain.character_c.player2,
						gamemain.character_c.player1);
<br>
***주의***<br>
attacker와 defender, player2 완 player1를 혼동해서 사용할 경우 <br> 자신의 턴이 ***소멸*** 하거나 자기 자신을 ***공격***할 수 있습니다.

<center> <pre>** - 한국어 끝 - ** </pre></center>


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




