package com.mowitnow.process;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ProcessTondeuseTest {
	
	 private URI fichier;

	@Before
    public void runBeforeTestMethod() {
		System.out.println(" début test");
		ClassLoader classLoader = getClass().getClassLoader();
		try {
			fichier=classLoader.getResource("fichierTest.txt").toURI();
			System.out.println(fichier.toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
    }

    @After
    public void runAfterTestMethod() {
    	System.out.println(" fin test");
    }
    
    @Test
    public void lancerTraitementsTondeusesTest(){
    	ProcessTondeuse p=new ProcessTondeuse();
    	System.out.println(fichier.toString());
    	p.lancerTraitementsTondeuses(fichier);
    	
    }

}
