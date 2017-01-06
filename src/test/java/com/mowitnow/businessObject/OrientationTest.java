package com.mowitnow.businessObject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrientationTest {

	@Test
	public void equalsTest() {
		Orientation o1 = new Orientation('E');
		Orientation o2 = new Orientation('N');
		assertFalse(o1.equals(o2));
		o2 = new Orientation('E');
		assertTrue(o1.equals(o2));
	}

	@Test
	public void testClassProperty() {

		Orientation o = new Orientation('E');

		assertThat(o, hasProperty("code"));
		assertThat("E W N S", containsString(""+o.getCode()));

	}

	@Test
	public void testToString() {

		Orientation o = new Orientation('N');
		assertThat(o.toString(), containsString("N"));

	}

}
