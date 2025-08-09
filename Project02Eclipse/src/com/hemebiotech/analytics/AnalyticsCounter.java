package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	private ISymptomReader reader;
    private ISymptomWriter writer;
    
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}
	
	// méthode d'analyse principale : lit, compte, trie, enregistre
	public void analyze() {
		Map<String, Integer> sorted = sortSymptoms(countSymptoms(reader.getSymptoms()));
		writer.writeSymptoms(sorted);
	}
	
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new TreeMap<>(symptoms); // tri par ordre alphabétique
	}
	
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		
        Map<String, Integer> symptomCount = new HashMap<>();

        for (String symptom : symptoms) {
            symptomCount.put(symptom, symptomCount.getOrDefault(symptom, 0) + 1); // comptage des symptômes
        }
		return symptomCount;
	}
	
	// point d'entree
	public static void main(String args[]) throws Exception {
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile("result.out");
	    
		AnalyticsCounter counter = new AnalyticsCounter(reader, writer);
		counter.analyze();
	}
}