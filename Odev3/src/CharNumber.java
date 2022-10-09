import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharNumber {

	public static void main(String[] args) {
		
		System.out.println("isim giriniz:");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println("isminiz: " + str);
		tekrarSayisi(str);

	}
		private static void tekrarSayisi(String str) {
			
			Map<Character, Integer> map = new HashMap<Character, Integer>(); //key char, value ise int olacak bir hashmap oluşturduk
	        char[] charArray = str.toCharArray(); //alınan string diziye çevirildi
	 
	        for (char c : charArray) { //arraydeki her bir charı kontrol edebilmek için döngü oluşturuldu
	        	
	        	if (map.containsKey(c)) {//eğer oluşturduğumuz map içerisinde parametre olarak almış olduğu key varsa eşleşmiş olduğu değeri geri döndürür
	        		map.put(c, map.get(c) + 1);
	            }
	            else {// key değeri yapı içerisinde bulunmuyorsa almış olduğu değer ile anahtar yapısını eşler ve depolar.
	                map.put(c, 1);
	            }
	        }
	        
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {	 
	            if (entry.getValue() >= 1) { //eğer bir ya da daha fazla tekrar ediyorsa
	                System.out.print(entry.getKey()+""+ entry.getValue());
	            }
	        }
	    }
	 

	}

