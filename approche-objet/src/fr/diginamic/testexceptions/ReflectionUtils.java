package fr.diginamic.testexceptions;



public class ReflectionUtils {

		public static void afficherAttributs(Object obj) throws IllegalArgumentException, 
		IllegalAccessException {
			// On commence par récupérerlaclassedel'objet passéeenparamètre.
			// laclassefournittouteslesinformations surlastructure d'un objet.
			Class<?> classe= obj.getClass();
			
			// Surcetteclasseon récupèreletableau desvariables d'instance
			Field[] fields= classe.getDeclaredFields();
			
			// On faitunebouclesurcetableau
			
		for(Field field: fields) {
			
			// On force l'accès àl'attribut depuisuneclasseexterne.
			// Unpeucommesijeforçaisl'attribut enlisibilitépublic.
			
			field.setAccessible(true);
			// Affichage
			System.out.println("La valeur de l'attribut "+ field.getName() + " est "+ field.get(obj).toString());
			
			
		}
		}
		
		}

