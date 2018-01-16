package com.assessment.mainroboclass;

import com.assessment.RobotInterface.RobotInstruc;

public class InstructionClass implements RobotInstruc {

	public int x;
	public int y;
	public char c;
	public int penalties = 0;

	public InstructionClass(int x, int y, char c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}

	public String getPosition() {
		return x + "," + y + "," + c;
	}

	public void L(char c) {

		switch (c) {

		case 'N':
			this.c = 'W';
			break;

		case 'S':
			this.c = 'E';
			break;
		case 'E':
			this.c = 'N';
			break;
		case 'W':
			this.c = 'S';
			break;
		default:
			this.c = c;
		}

	}

	public void R(char c) {

		switch (c) {

		case 'N':
			this.c = 'E';
			break;

		case 'S':
			this.c = 'W';
			break;

		case 'E':
			this.c = 'S';
			break;

		case 'W':
			this.c = 'N';
			break;

		default:
			this.c = c;
		}

	}

	public void M(char c) {

		switch (c) {

		case 'N':
			if (y < 4) {
				y += 1;
			} else {
				penalties++;
			}

			break;

		case 'S':
			if (y > 0) {
				y -= 1;
			} else {
				penalties++;
			}

			break;

		case 'E':
			if (x < 4) {
				x += 1;
			} else {
				penalties++;
			}

			break;

		case 'W':
			if (x > 0) {
				x -= 1;
			} else {
				penalties++;
			}

			break;

		default:
			break;
		}

	}

	public void forwardMove(char m) {

		switch (m) {

		case 'L':
			L(c);
			System.out.println("Position : " + getPosition() + "\n" + "Penalties : " + penalties + "\n");
			break;

		case 'R':
			R(c);
			System.out.println("Position : " + getPosition() + "\n" + "Penalties : " + penalties + "\n");
			break;

		case 'M':
			M(c);
			System.out.println("Position : " + getPosition() + "\n" + "Penalties : " + penalties + "\n");
			break;

		}

	}

}
