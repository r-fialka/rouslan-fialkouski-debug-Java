package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {	
	
	public static void main(String args[]) throws Exception {
		countSymptoms();	
	}
		
	public static void countSymptoms() {
			
		// Créons une liste pour les mots et leur nombre.
		Map<String, Integer> listeSymptoms = new HashMap<>();
			
		WriteSymptomDataToFile write = new WriteSymptomDataToFile();
						
		try (BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"))) {
			String symptom;
			while ((symptom = reader.readLine()) != null) {
				listeSymptoms.put(symptom, listeSymptoms.getOrDefault(symptom, 0) + 1); //Comptage des symptômes
			}
		} catch (FileNotFoundException e) {
			System.out.println("Le fichier symptoms.txt n'a pas été trouvé..");
			//return;  //Sortir de la méthode si le fichier n'existe pas
		} catch (IOException e) {
			System.out.println("Erreur de lecture du fichier symptoms.txt");
			return;
		}
			
			write.writeSymptoms(listeSymptoms);	
	}
}
