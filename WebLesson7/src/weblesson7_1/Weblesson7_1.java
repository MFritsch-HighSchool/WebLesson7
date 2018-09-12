package weblesson7_1;

import java.util.*;

import javax.swing.JOptionPane;
//CONVERSION
//FLAGS
//PRECISION
//printf
//Scanner
//System.in
//System.out
//WIDTH
public class Weblesson7_1{
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double ctotal = 0;
		System.out.printf("%-12s", "Name:");
		System.out.printf("%11s", "Price:");
		System.out.printf("%26s","Current Total:");
		System.out.println();
		
//		String n1 = JOptionPane.showInputDialog("Enter in the name of your first item");
		String i1 = JOptionPane.showInputDialog("Enter in the cost of item 1");
		double item1 = Double.parseDouble(i1);
		ctotal += item1;
		System.out.printf("%-12s", "Item 1");
		System.out.printf("%11.2f", item1);
		System.out.printf("%26.2f", ctotal);
		System.out.println();
		
//		String n2 = JOptionPane.showInputDialog("Enter in the name of your second item");
		String i2 = JOptionPane.showInputDialog("Enter in the cost of item 2") ;
		double item2 = Double.parseDouble(i2);
		ctotal += item2;
		System.out.printf("%-12s", "Item 2");
		System.out.printf("%11.2f", item2);
		System.out.printf("%26.2f", ctotal);
		System.out.println();
		
//		String n3 = JOptionPane.showInputDialog("Enter in the name of your third item");
		String i3 = JOptionPane.showInputDialog("Enter in the cost of item 3");
		double item3 = Double.parseDouble(i3); //Lol, i3. Like a half-decent Intel.
		ctotal += item3;
		System.out.printf("%-12s", "Item 3");
		System.out.printf("%11.2f", item3);
		System.out.printf("%26.2f", ctotal);
		System.out.println();

//		String n4 = JOptionPane.showInputDialog("Enter in the name of your fourth item");
		String i4 = JOptionPane.showInputDialog("Enter in the cost of item 4");
		double item4 = Double.parseDouble(i4);
		ctotal += item4;
		System.out.printf("%-12s", "Item 4");
		System.out.printf("%11.2f", item4);
		System.out.printf("%26.2f", ctotal);
		System.out.println();

//		String n5 = JOptionPane.showInputDialog("Enter in the name of your fifth item");
		String i5 = JOptionPane.showInputDialog("Enter in the cost of item 5");
		double item5 = Double.parseDouble(i5); //Lol, i5. Like a pretty decent Intel. AMD for lyfe m8
		ctotal += item5;
		System.out.printf("%-12s", "Item 5");
		System.out.printf("%11.2f", item5);
		System.out.printf("%26.2f", ctotal);
		System.out.println();

	}
}