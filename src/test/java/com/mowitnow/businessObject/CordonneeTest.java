package com.mowitnow.businessObject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static junitx.framework.ListAssert.assertContains;
import java.util.Arrays;
import java.util.List;

public class CordonneeTest {

	@Test
	public void equalsTest(){
		Cordonnee c1 = new Cordonnee(1, 2);
		Cordonnee c2 = new Cordonnee(1, 2);
		assertTrue(c1.equals(c2));
		c2 = new Cordonnee(1, 3);
		assertFalse(c1.equals(c2));
	}
	
	@Test
    public void testClassProperty() {

		Cordonnee c = new Cordonnee(1,2);

        assertThat(c, hasProperty("x"));

        assertThat(c, hasProperty("y"));
        assertTrue(c.getX()>0);
        assertTrue(c.getY()> 0);

    }

    @Test
    public void testClassPropertyInList() {

        List<Cordonnee> list = Arrays.asList(
                new Cordonnee(1,2),
                new Cordonnee(2,5)
        );

        assertContains(list,new Cordonnee(1,2));

    }
    
    @Test
    public void testToString() {

        Cordonnee c=new Cordonnee(1,2);
        assertThat(c.toString(), containsString("1 2"));

    }

}
