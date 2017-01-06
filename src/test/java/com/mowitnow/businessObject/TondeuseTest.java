package com.mowitnow.businessObject;

import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import com.mowitnow.util.MowException;

public class TondeuseTest {

	@Test
	public void equalsTest(){
		Tondeuse t1 = new Tondeuse(1, 2,'E');
		Tondeuse t2 = new Tondeuse(1, 2,'N');
		assertFalse(t1.equals(t2));
		t2.getPosition().getOrientation().setCode('E');
		assertTrue(t1.equals(t2));
	}
	
	@Test
    public void testClassProperty() {

		Tondeuse t = new Tondeuse(1,2,'S');

        assertThat(t, hasProperty("position"));

    }
    
    @Test
    public void testExecuterInstruction() {

    	Tondeuse t = new Tondeuse(1,2,'N');
    	try {
			t.executerInstruction(new Pelouse(5,5), 'A');
			assertThat(t.toString()).contains("1 3 N");
		} catch (MowException e) {
			e.printStackTrace();
		}

    }

}
