package com.Capgemini.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {
	@Test
	public void testWithLargeValue()
	{
		Logic logic=new Logic();
		double actual=logic.sum(80000.0, 70000.0);
		double expected=150000;
		assertEquals(expected, actual);
		
		
	}
	@Test
	public void testWithSmallValue()
	{
		Logic logic=new Logic();
		double actual=logic.sum(20.0, 70.0);
		double expected=90;
		assertEquals(expected, actual);
		
		
	}
	@Test
	public void testWithNegetiveValue()
	{
		Logic logic=new Logic();
		double actual=logic.sum(-80000.0, -70000.0);
		double expected=-150000;
		assertEquals(expected, actual);
		
		
	}
	@Test
	public void testWithNagativePostiveValue()
	{
		Logic logic=new Logic();
		double actual=logic.sum(-80000.0, 70000.0);
		double expected=-10000;
		assertEquals(expected, actual);
		
		
	}
	
}
