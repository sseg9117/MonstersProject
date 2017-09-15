package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;


public class MonsterController
{
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Jery", 2, 5, 1, true);
		
		System.out.println("Sheradon is hungry, so he is going to eat a tentac");
		realMonster.setTentacleAmount(.5);
		System.out.println(realMonster);
		
		interactWithTheMonster(realMonster);
		
		}
		
		private void interactWithTheMonster(MarshmallowMonster currentMonster)
		{
			System.out.println(currentMonster.getName() + " wants to know what to eat next");
			System.out.println(currentMonster.getName() + " suggest arms, they have " + currentMonster.getArmCount());
			System.out.println("How many do you want to eat?");
			Scanner myScanner = new Scanner(System.in);
			int consumed = myScanner.nextInt();
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Ok, now " + currentMonster.getName() + " has " + currentMonster.getArmCount() + "arms left");
			
			
		}
}
