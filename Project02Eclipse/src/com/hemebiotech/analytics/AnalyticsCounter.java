package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * La classe {@code AnalyticsCounter} est responsable de l'analyse des données
 * de symptômes. Elle lit les symptômes depuis une source donnée, compte leur
 * fréquence, trie les résultats par ordre alphabétique, puis écrit les données
 * traitées dans une destination.
 *
 * <p>
 * Cette classe utilise une implémentation de {@link ISymptomReader} pour lire
 * les symptômes, et une implémentation de {@link ISymptomWriter} pour écrire
 * les résultats.
 * </p>
 */
public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;

	/**
	 * Crée une instance de {@code AnalyticsCounter} avec un lecteur et un écrivain
	 * de symptômes.
	 *
	 * @param reader une instance de {@code ISymptomReader} pour lire les symptômes
	 * @param writer une instance de {@code ISymptomWriter} pour écrire les
	 *               résultats
	 */
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	/**
	 * Méthode principale d'analyse :
	 * <ul>
	 * <li>Lit la liste des symptômes via le lecteur</li>
	 * <li>Compte les occurrences de chaque symptôme</li>
	 * <li>Trie les résultats par ordre alphabétique</li>
	 * <li>Écrit les résultats dans un fichier de sortie</li>
	 * </ul>
	 */
	public void analyze() {
		Map<String, Integer> sorted = sortSymptoms(countSymptoms(reader.getSymptoms()));
		writer.writeSymptoms(sorted);
	}

	/**
	 * Trie les symptômes par ordre alphabétique (ordre croissant des noms).
	 *
	 * @param symptoms une map contenant les symptômes et leur nombre d'occurrences
	 * @return une {@code TreeMap} triée contenant les mêmes données
	 */
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new TreeMap<>(symptoms);
	}

	/**
	 * Compte le nombre d'occurrences de chaque symptôme dans une liste.
	 *
	 * @param symptoms une liste de chaînes représentant les symptômes
	 * @return une {@code Map} avec le nom du symptôme comme clé, et le nombre
	 *         d'occurrences comme valeur
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> symptomCount = new HashMap<>();
		for (String symptom : symptoms) {
			symptomCount.put(symptom, symptomCount.getOrDefault(symptom, 0) + 1);
		}
		return symptomCount;
	}
}