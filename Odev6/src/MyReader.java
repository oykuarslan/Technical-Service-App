import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyReader extends FileException{

	public String ReadWords(String FileName) throws IOException{
		FileReader FileName1 = new FileReader("C:\\dosya\\dosya.txt");
		System.err.println("dosya okundu");
		String line;
		BufferedReader rd = new BufferedReader(FileName1);
		while((line = rd.readLine()) != null) {
			System.out.println(line);
		}
		return "okundu";
	}
	
	
	public void readLineAt(int numOfLine) throws IOException{
		try {
		int n = 4;
		String line = Files.readAllLines(Paths.get("C:\\dosya\\dosya.txt")).get(n);
		System.out.println(line);
		}
		catch(IOException e) {
			System.err.println(e);
		}
	}

}
