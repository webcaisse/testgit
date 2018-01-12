package com.mowitnow;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import com.mowitnow.process.ProcessTondeuse;
import com.mowitnow.util.MowException;
 
public class MowItNow {

	public static void main(String... args) throws MowException,IOException{
		MowItNow mow=new MowItNow();
		try {
			URI file;
			if (args.length == 1) {
				file = new URI(args[0]);
			}
			else{
				file=mow.initFichier();
			}
			ProcessTondeuse processTondeuse=new ProcessTondeuse();
			processTondeuse.lancerTraitementsTondeuses(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private  URI initFichier() throws URISyntaxException {		
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResource("fichierTest.txt").toURI();		
	}
	
	
}