package com.hemebiotech.analytics;

import java.util.List;

/**
 * L’interface {@code ISymptomReader} définit un contrat pour les classes
 * capables de lire une liste de symptômes depuis une source de données.
 * 
 * <p>
 * Chaque symptôme est représenté sous forme de chaîne de caractères, et chaque
 * ligne ou entrée dans la source correspond à un symptôme.
 * </p>
 *
 * <p>
 * Les implémentations typiques peuvent lire à partir d’un fichier texte, d’une
 * base de données, ou d’autres systèmes de stockage.
 * </p>
 */
public interface ISymptomReader {

	/**
	 * Extrait tous les symptômes disponibles à partir d'une source de données.
	 *
	 * @return une {@code List} de chaînes contenant les symptômes. La liste peut
	 *         être vide si aucun symptôme n’est trouvé ou si une erreur survient.
	 */
	List<String> getSymptoms();
}