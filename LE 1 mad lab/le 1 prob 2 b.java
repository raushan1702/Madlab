/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.io.*;
class Main {

	
	public static void main(String[] args)
	{
	
		int number = 4;

		int i = number, j;

		while (i > 0) {
			j = 0;

			while (j++ < number - i) {
				
				System.out.print(" ");
			}

			j = 0;

			
			while (j++ < (i * 2) - 1) {
				System.out.print("*");
			}

		
			System.out.println();

		
			i--;
		}
	}
}

