package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {

	public static void main(String[]args) {
		
		Microwave microwave = new Microwave();
		
		String flavor = JOptionPane.showInputDialog(null,"What Flavor popcorn do you want?");
		
		Popcorn popcorn = new Popcorn(flavor);
		
		
		microwave.putInMicrowave(popcorn);
		
		String cookTime = JOptionPane.showInputDialog(null,"How many minutes do you want to cook the popcorn");
		
	int c=	Integer.parseInt(cookTime);
		
		 microwave.setTime(c);
		
		 microwave.startMicrowave();
		 
		 popcorn.applyHeat();
		 
		 popcorn.eat();
	}
	
}
