package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make the pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "water" }, null);
			
			System.out.println(task);
		    if(task == 0) {
		    	cuddle();
		    }
		    else if (task == 1) {
		    food();
		    }
		    else if (task == 2) {
		    	water();
		    }
		    	
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	
	static String pet= JOptionPane.showInputDialog(null, "what pet do you want to buy?");
	
	private static void cuddle() {
		if(pet.equalsIgnoreCase("cat")) {
		JOptionPane.showMessageDialog(null, "purr");
		}
	}
    private static void food() {
		if(pet.equalsIgnoreCase("cat")) {
			
		}
	}
    private static void water() {
		if (pet.equalsIgnoreCase("cat")) {
		JOptionPane.showMessageDialog(null, "lap");	
		}
	}


	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}