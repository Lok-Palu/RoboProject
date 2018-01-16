package com.assessment.RobotTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.assessment.mainroboclass.InstructionClass;

public class RobotTest {

	
	private InstructionClass ic;

	@Test
	public void testCase1() {

		ic = new InstructionClass(0, 2, 'E');

		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('R');

		assertEquals(4, ic.x);
		assertEquals(1, ic.y);
		assertEquals('N', ic.c);
		assertEquals(0, ic.penalties);

	}

	@Test
	public void testCase2() {

		ic = new InstructionClass(4, 4, 'S');

		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('M');
		ic.forwardMove('M');

		assertEquals(0, ic.x);
		assertEquals(1, ic.y);
		assertEquals('W', ic.c);
		assertEquals(1, ic.penalties);

	}

	@Test
	public void testCase3() {

		ic = new InstructionClass(2, 2, 'W');

		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('M');
		ic.forwardMove('R');
		ic.forwardMove('M');

		assertEquals(2, ic.x);
		assertEquals(2, ic.y);
		assertEquals('N', ic.c);
		assertEquals(0, ic.penalties);
	}

	@Test
	public void testCase4() {

		ic = new InstructionClass(1, 3, 'N');

		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('L');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('M');
		ic.forwardMove('M');

		assertEquals(0, ic.x);
		assertEquals(0, ic.y);
		assertEquals('S', ic.c);
		assertEquals(3, ic.penalties);
	}

}
