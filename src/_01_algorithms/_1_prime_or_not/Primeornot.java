package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Primeornot {
 public static void main(String[] args) {
	
String prime = JOptionPane.showInputDialog("say a number") ;

 int number = Integer.parseInt(prime);
for ( int i = 2; i<number/2; i++ ) { 
	
if(number%i == 0 ) {
		JOptionPane.showMessageDialog(null, "not prime");
		System.exit(0);
	}


}
JOptionPane.showMessageDialog(null, "it must be prime");
	 
}
}
