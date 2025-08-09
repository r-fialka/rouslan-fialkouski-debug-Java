package com.hemebiotech.analytics;

/**
 * La classe {@code Main} constitue le point d’entrée de l’application.
 * <p>
 * Elle initialise les composants nécessaires pour lire les symptômes depuis un
 * fichier, analyser les données, puis écrire les résultats dans un fichier de
 * sortie.
 * </p>
 */
public class Main {

	/**
	 * Méthode principale exécutée au lancement de l’application.
	 * <p>
	 * Cette méthode :
	 * <ul>
	 * <li>Crée une instance de {@link ReadSymptomDataFromFile} pour lire les
	 * symptômes depuis {@code symptoms.txt}</li>
	 * <li>Crée une instance de {@link WriteSymptomDataToFile} pour écrire les
	 * résultats dans {@code result.out}</li>
	 * <li>Instancie la classe {@link AnalyticsCounter} avec les deux
	 * composants</li>
	 * <li>Lance l’analyse via la méthode {@code analyze()}</li>
	 * </ul>
	 * </p>
	 *
	 */
	public static void main(String[] args) {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile("result.out");
		AnalyticsCounter counter = new AnalyticsCounter(reader, writer);
		counter.analyze();
	}
}