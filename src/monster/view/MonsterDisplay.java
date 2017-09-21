package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
{
	
	public void displayxt(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String questionAsked)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
	}

	public void displayText(String string)
	{

		
	}
	
}
