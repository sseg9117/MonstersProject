package monster.view;

import javax.swing.JOptionPane; //imports JOPTION

public class MonsterDisplay
{
	
	public void displayText(String textToDisplay) 
	{
		JOptionPane.showMessageDialog(null, textToDisplay); //shows the message joption is the popup
	}
	
	public String getResponse(String questionAsked) //lets you get the answer where they have to type
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked); //pops up another question
		
		return response;
	}

	
}
