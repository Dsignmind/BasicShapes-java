/**
 * Title: DrawDiagram.java
 * Abstract: A program to print out patterns from a given user integer input.
 *           Program uses input to print a square, triangle, and a diamond.
 * Author: Daniel Wilson
 * Date: 8/25/16
 *
 */
import java.util.Scanner;

public class DrawDiagram {

	public static void main(String[] args) {
		int length = 0;
		System.out.print("Enter a length: ");
		Scanner given_int = new Scanner(System.in);
		length = given_int.nextInt();
		
		//Print a square to the screen
		for(int i = 0; i < length; i++){
			for(int j = 0; j < length; j++){
				System.out.print(" *");
			}
			System.out.println(" ");
		}
		System.out.println("");
		
		//Print a triangle to the screen
		for(int i = 0; i < length; i++){
			int counter = length - (1 + i);
			for(int j = 0; j < length; j++){
				if(counter > 0){
					System.out.print("  ");
				}
				else{
					System.out.print(" *");
				}
				counter--;
			}
			
			System.out.println("");
		}
		System.out.println("");
		
		//Print a diamond to the screen
		int count = 1;
		//upper triangle
		for(int i = length - 1; i > 0; i--){
			for(int j = i; j > 0; j--){
				System.out.print("  ");
			}
			for(int k = 0; k < count; k++){
				System.out.print(" *");
			}
			count+=2;
			System.out.println("");
		}
		//middle bar
		for(int i = 0; i < (length * 2) - 1; i++){
			System.out.print(" *");
		}
		System.out.println("");
		//lower triangle
		for(int i = 1; i < length; i++){
			for(int j = i; j > 0; j--){
				System.out.print("  ");
			}
			for(int k = 0; k < count -2; k++){
				System.out.print(" *");
			}
			count-=2;
			System.out.println("");
		}
		given_int.close();
	}

}
