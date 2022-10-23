import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Null extends NullPointerException{
	
	@Override
	public String getMessage() {
		return " null exception";
		}

}
