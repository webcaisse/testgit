package com.mowitnow.businessObject;

import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PositionTest {

	@Test
	public void equalsTest(){
		Position p1 = new Position(1, 2,'E');
		Position p2 = new Position(1, 2,'N');
		assertFalse(p1.equals(p2));
		p2.getOrientation().setCode('E');
		assertTrue(p1.equals(p2));
	}
	
	@Test
    public void testClassProperty() {

		Position p = new Position(1,2,'S');

        assertThat(p, hasProperty("cordonnee"));

        assertThat(p, hasProperty("orientation"));

    }

}
