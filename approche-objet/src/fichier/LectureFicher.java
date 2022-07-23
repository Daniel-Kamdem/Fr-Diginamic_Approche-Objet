package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureFicher {

	public static void main(String[] args) throws IOException {
	
		ArrayList<Object> villes = new ArrayList<>();
	
		
	
		
		// Lire et afficher le contenu du fichier 
		Path pathFile = Paths.get("/Users/danielkamdemsadefo/Downloads/recensement.csv");
		
		List<String> Lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

		// String[] tokens = Lines.split(";");
		
		
		for(String line: Lines ) {
			// Ville ville = new Ville (); 
			String[] tokens = line.split(";");
			// System.out.println(Arrays.asList(tokens));
			 List<String> liste = Arrays.asList(tokens);
			 
			// System.out.println(liste.get(1));
			 
			 // Convertion d'un string en INT
			 String nom = liste.get(0);
			 int codeDepartement = Integer.valueOf(liste.get(1)); 
			 String nomRegion = liste.get(2);
			 int populationTotal = Integer.valueOf(liste.get(3));
					 
			 
			 
			Ville ville = new Ville ( nom , codeDepartement, nomRegion, populationTotal);
			villes.add(ville);
			
			 
		
		}
		
		System.out.println(villes);
		
		
		// bouclé sur la liste de ville 
			// verifier que la population total est superrieur a 25000 grace a IF 
		
	}

	
}
