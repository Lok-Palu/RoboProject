package com.assessment.mainroboclass;

import java.util.Scanner;

public class RoboMain {

	static Scanner s;
	static InstructionClass ic;

	public static void main(String[] args) {

		s = new Scanner(System.in);

		System.out.println("Enter the integer position at X ");
		int x = s.nextInt();

		System.out.println("Enter the integer position at Y ");
		int y = s.nextInt();

		System.out.println("Enter the Direction Compass position C");
		char c = s.next().charAt(0);

		instruction(c, x, y);

	}

	public static void instruction(char c, int x, int y) {

		if (x >= 0 && x <= 5 && y <= 5 && y >= 0) {

			ic = new InstructionClass(x, y, c);

			for (;;) {

				System.out.println("Enter the move");

				char m = s.next().charAt(0);

				ic.forwardMove(m);

			}

		} else {

			System.out.println("The entered parameters are not according to the instructions");

		}

	}

}
