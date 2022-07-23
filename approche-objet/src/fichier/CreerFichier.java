package fichier;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws Exception {
		
Path pathDirectory = Paths.get("/Users/danielkamdemsadefo/Downloads/recensement1.csv");
		
List<String> lignes = new ArrayList<>();

Files.write(pathDirectory,lignes);

		//List<String> Lines = new ArrayList<>();
	
		//for(String line: lignes) {
		 //System.out.println(line);
		  
	 
	

	 //Path pathDirectory = Paths.get("/Users/danielkamdemsadefo/Downloads");
		// DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory); 
		

		
		}
}
		
	


