import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	    public static void main(String[] args) throws IOException {
	    	MyReader reader = new MyReader();
	    	reader.ReadWords("C:\\dosya\\dosya.txt");
	    	reader.readLineAt(4);
	    }
}
