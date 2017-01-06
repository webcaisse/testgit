package com.mowitnow.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mowitnow.businessObject.Pelouse;
import com.mowitnow.businessObject.Tondeuse;
import com.mowitnow.util.MowException;

public class ProcessTondeuse {
	

	public void lancerTraitementsTondeuses(URI fichier){
		List<String> list = new ArrayList<>();
		
		try {
			BufferedReader br = Files.newBufferedReader(Paths.get(fichier));
			list = br.lines().collect(Collectors.toList());
			list.forEach(System.out::println);
			Pelouse pelouse=createPelouse(list.get(0));
			lancerTraitements(pelouse,list);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (MowException e) {
			e.printStackTrace();
		}
	}
	
	private void lancerTraitements(Pelouse pelouse, List<String> list) throws MowException{
		Tondeuse tondeuse;
		for(int i=1;i<list.size()-1;i++){
			tondeuse=initTondeuse(list.get(i));
			char[] traitement=list.get(i+1).toCharArray();
			for(char inst:traitement){
				tondeuse.executerInstruction(pelouse, inst);
			}
			if(tondeuse!=null)
			 System.out.println(tondeuse.toString());
			i++;
		}
	}

	private Pelouse createPelouse(String ligne) throws MowException{
		String[] params = ligne.split(" ");
		if(params.length!=2)
			throw new MowException("le fichier est mal formé");
		else{
			int maxX=Integer.parseInt(params[0]);
			int maxY=Integer.parseInt(params[1]);
			Pelouse pelouse=new Pelouse(maxX,maxY);
			return pelouse;
		}
	}
	
	private Tondeuse initTondeuse(String ligne) throws MowException{
		String[] params = ligne.split(" ");
		if(params.length!=3)
			throw new MowException("le fichier est mal formé");
		else{
			int x=Integer.parseInt(params[0]);
			int y=Integer.parseInt(params[1]);
			char code=params[2].charAt(0);
			Tondeuse tondeuse=new Tondeuse(x,y,code);
			return tondeuse;
		}
	}
}
