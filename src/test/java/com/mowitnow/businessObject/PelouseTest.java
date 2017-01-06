package com.mowitnow.businessObject;

import static junitx.framework.ListAssert.assertContains;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PelouseTest {

	@Test
	public void equalsTest(){
		Pelouse p1 = new Pelouse(1, 2);
		Pelouse p2 = new Pelouse(1, 2);
		assertTrue(p1.equals(p2));
		p2 = new Pelouse(1, 3);
		assertFalse(p1.equals(p2));		
	}
	
	@Test
    public void testClassProperty() {

		Pelouse c = new Pelouse(1,2);

        assertThat(c, hasProperty("maxX"));

        assertThat(c, hasProperty("maxY"));
        assertTrue(c.getMaxX()> -1);
        assertTrue(c.getMaxY()> -1);

    }

    @Test
    public void testClassPropertyInList() {

        List<Pelouse> list = Arrays.asList(
                new Pelouse(1,2),
                new Pelouse(2,5)
        );

        assertContains(list,new Pelouse(1,2));

    }
  
}
