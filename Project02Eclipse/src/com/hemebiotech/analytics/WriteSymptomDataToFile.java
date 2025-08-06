package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter{
	
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		//Tri par clés à l'aide de TreeMap
		Map<String, Integer> listeSymptoms = symptoms;
		
		try (FileWriter writer = new FileWriter ("result.out")){
			//Nous trions les clés classées
			for (String wordSymptoms : listeSymptoms.keySet()) {
				writer.write(wordSymptoms + ": " + symptoms.get(wordSymptoms) + "\n");
				System.out.println(wordSymptoms + ": " + symptoms.get(wordSymptoms));
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Impossible d'ecrire dans le fichier");
		}
	}
}
