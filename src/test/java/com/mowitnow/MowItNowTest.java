package com.mowitnow;

import static org.fest.assertions.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mowitnow.util.MowException;

public class MowItNowTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

	@Test
	public void mainTest1() throws MowException, IOException {
		MowItNow.main();
	}
	
	@Test
	public void mainTest2() throws MowException, IOException {
		MowItNow.main();
	}
	
	@Test
	public void printTest() throws MowException, IOException{
		MowItNow.main();
		assertThat(outContent.toString()).contains("1 3 N");
		assertThat(outContent.toString()).contains("5 1 E");
	}

}
