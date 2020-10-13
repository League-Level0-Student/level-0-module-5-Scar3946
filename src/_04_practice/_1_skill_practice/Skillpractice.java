package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skillpractice {


public static void main(String[] args) {
	
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int cents = Integer.parseInt(dimes)* 10;
JOptionPane.showMessageDialog(null, "you have " + cents + "cents");
String height = JOptionPane.showInputDialog("how tall are you in inches?");
int inches = Integer.parseInt(height);
if( inches < 36)	{
	JOptionPane.showMessageDialog(null, "Eat your wheaties");
}
 for(int i = 1; i<31; i++)	{
	 
	if(i%3 == 0 ){
	 System.out.println(i);
	 }
 }
	
Random object = new Random();
int randomnumber = object.nextInt(20);
int printrandom = object.nextInt(10);
System.out.println(randomnumber);	
System.out.println(printrandom);

JOptionPane.showMessageDialog(null, " the difference is " + (randomnumber-printrandom) );
	
String city = JOptionPane.showInputDialog("what city do you live in?");
if(city =="san diego") {
JOptionPane.showMessageDialog(null, " you live in america's finest city");
}
else {
	JOptionPane.showMessageDialog(null, " move to san diego");
}
int cars = 2 ;
JOptionPane.showMessageDialog(null, " we have 8 wheels");
JOptionPane.showInputDialog("what is the name of your school?");
JOptionPane.showMessageDialog(null, "you have a fantastic school");
}


















}