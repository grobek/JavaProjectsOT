package IKEA.Tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import IKEA.Worker.subclasses.Tutor;

public class TestTutor {
	private Tutor c1;
	private Tutor c2;
	private Tutor c3;
	private Tutor c4;
	private Tutor c5;
	@Before
	public void setUp() throws Exception {
		c1 = new Tutor(LocalDate.of(2016, LocalDate.now().getMonth(), 
				LocalDate.now().getDayOfMonth()), "tamir", null);
		c2 = new Tutor(LocalDate.of(2000, 10, 20), "name2", null);
		c3 = new Tutor(LocalDate.of(2005, 9, 5), "name3", null);
		c4 = new Tutor("name4", null);
		c5 = new Tutor(LocalDate.of(2019, 11, 22), "name5", null);
	}

	@Test
	public void testRequestIncreaseSalary() {
		c1.requestIncreaseSalary();
		c2.requestIncreaseSalary();
		c3.requestIncreaseSalary();
		c4.requestIncreaseSalary();
		c5.requestIncreaseSalary();
		assertEquals(Math.round(c1.getSalary()), 6095, 0);
		assertEquals(c2.getSalary(), 5300, 0);
		assertEquals(c3.getSalary(), 5300, 0);
		assertEquals(c4.getSalary(), 5300,0);
		assertEquals(c5.getSalary(), 5300,0);
	}

}
