/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This program finds e in e=mc^2 given mass.
 *
 ****************************************************************************/

import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
	// given mass will calulate energy 
	
	System.out.println("Please enter a mass (kg).");
	//input
	final double SPEED_OF_LIGHT = 2.998 * Math.pow(10,8);
	Scanner wordScanner = new Scanner(System.in);
  final double mass = wordScanner.nextDouble();
    
  //process
  final double energy = (mass * Math.pow(SPEED_OF_LIGHT,2));
    
  //output
   System.out.println("This mass releases " + energy + "J of energy.");
   
  }
  
}
