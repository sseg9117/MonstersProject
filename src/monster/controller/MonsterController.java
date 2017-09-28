package monster.controller;

import monster.model.MarshmallowMonster;  //imports mashmallowmonster
import java.util.Scanner; // imports scanner
import monster.view.MonsterDisplay; // imports the display
import java.util.List;
import java.util.ArrayList;

public class MonsterController
{
	private MonsterDisplay popup;
	private List<MarshmallowMonster> monsterList;
	public MonsterController()
	{
		popup = new MonsterDisplay();
		//conctors inisilize data members
		monsterList = new ArrayList<MarshmallowMonster>();
	}
	
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
//		System.out.println(sample);
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Jery", 8, 4, 4.7, true);
	
//		System.out.println("Sheradon is hungry, so he is going to eat a tentac");
		realMonster.setTentacleAmount(10);
//		System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		popup.displayText("Sheradon is hungry, so he is going to eat a tentecle");
		popup.displayText(realMonster.toString());
		
		monsterList.add(realMonster);
		monsterList.add(sample);
		testList();
		
//		interactWithTheMonster(realMonster);
	}
	
	private void testList()
	{
		for(int index = 0; index < monsterList.size(); index++)
		{
			MarshmallowMonster currentMonster = monsterList.get(index);
			popup.displayText(currentMonster.getName());
			String newName = popup.getResponse("What should my new name be???");
			currentMonster.setName(newName);
			popup.displayText(currentMonster.getName());
		}
		
		for(MarshmallowMonster current : monsterList)
		{
			popup.displayText(current.getName());
			String newName = popup.getResponse("What should my new new name be???");
			current.setName(newName);
			popup.displayText(current.getName());
		}
	}
		
		private void interactWithTheMonster(MarshmallowMonster currentMonster)
		

		{
//			System.out.println(currentMonster.getName() + " wants to know what to eat next");
			popup.displayText(currentMonster.getName() + "wants to know what to eat next ");
//			System.out.println(currentMonster.getName() + " suggest arms, they have " + currentMonster.getArmCount());
			popup.displayText(currentMonster.getName() + " suggest arms, they have " + currentMonster.getArmCount());
//			System.out.println("How many do you want to eat?");
		    int specialAnswer = 0;
			String unconverted = popup.getResponse(currentMonster.getName() + "How many do you want to eat?");  //lets you have popup windo that asks question
			if(isValidInteger(unconverted))
			{
				specialAnswer = Integer.parseInt(unconverted);  //lets you put the answer
			}
			specialAnswer = Integer.parseInt(unconverted);
			
			Scanner myScanner = new Scanner(System.in); // scanner
			int consumed = 0;
			consumed = specialAnswer;
			
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
				
				popup.displayText("Hey look at me!!!!");
				String answer = popup.getResponse("how many meals are you eating today");
				System.out.println(answer);
				popup.displayText(answer);
				
		}

		//Helper methods
		//for Int
		private boolean isValidInteger(String sample)
		{
			boolean valid = false;
			
			try
			{
				Integer.parseInt(sample);
				valid = true;
			}
			catch(NumberFormatException error)
			{
				popup.displayText("Only interger values are valid: " + sample + " is not");
			}
			
			return valid;
		}
// for double
		private boolean isValidDouble(String sampleDouble)
		{
			boolean valid = false;
			
			try
			{
				Double.parseDouble(sampleDouble);
				valid = true;
			}
			catch (NumberFormatException error)
			{
				popup.displayText("Only double values are valid: " + sampleDouble + " is not.");
			}
			
			return valid;
			//for boolean
		}
		private boolean isValidBoolean(String sampleBoolean)
		{
			boolean valid = false;
			
			try
			{
				Boolean.parseBoolean(sampleBoolean);
				valid = true;
			}
			catch (NumberFormatException error)
			{
				popup.displayText("Only true and flase are valid: " + sampleBoolean + " is not.");
			}
			
			return valid;
		}

}
				


			
