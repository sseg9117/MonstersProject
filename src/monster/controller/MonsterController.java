package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;


public class MonsterController
{
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Jery", 8, 4, 4.7, true);
	
		System.out.println("Sheradon is hungry, so he is going to eat a tentac");
		realMonster.setTentacleAmount(10);
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
				if(consumed < 0)
				{
					System.out.println("You cannot eat a negative amount silly human");		
				}
				else if(consumed == 0)
				{
					System.out.println("Not that hungry are you?");
				}
				else if(consumed > currentMonster.getArmCount())
				{
					System.out.println("That is impossible - I only have " + currentMonster.getArmCount() + "arms!!!");
				}
				else
				{
					currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
					System.out.println("Thank you so much! I only have this many arms now " + currentMonster.getArmCount());
				}	
					System.out.println("How many tentacles do you want then? I have " + currentMonster.getTentacleAmount());
					Scanner myScanner2 = new Scanner(System.in);
					int consumes = myScanner2.nextInt();
								
				if(consumes > 10)
				{
					System.out.println("You cant eat more than 10 loser");
				}
				else if(consumes == 0)
				{
					System.out.println("you are not hungry i see");
				}
				else if(consumes > currentMonster.getTentacleAmount())
				{
					System.out.println(" I have " + currentMonster.getTentacleAmount());
				}
				else
				{
					currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - consumes );
					System.out.println("Thank you so much! I only have this many tentacles now " + currentMonster.getTentacleAmount());
				}
					
		}
}
				
					
			
