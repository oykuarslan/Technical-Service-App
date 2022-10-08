package javaodev2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Odev2 {
	static int array[][]=new int[3][3];
	public static void main(String[] args) {

		int[][] matrix = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		      for (int i = 0; i < matrix.length; i++) { //matrixteki rowları eşitler
		         for (int j = 0; j < matrix[i].length; j++) { //kolonları eşitler
		            System.out.print(matrix[i][j] + " ");
		         }
		         System.out.println();
		      }
		      
		      System.out.println("array flip 1->");
		      firstArrayFlip(matrix);
		      System.out.println("array flip 2->");
		      secondArrayFlip(matrix);
		      tekrarSayisi();
	}

	private static void firstArrayFlip(int [][] matrix) {
		//  public static void firstArrayFlip();{
		 
	      for(int i = 2; i >= 0; i--) {
	    		for(int j = 2; j >= 0; j--) {
	    			array[2-i][2-j] = matrix[i][j];
	    			}
	    	}
	    	for(int i = 0; i < 3; i++) {
	    		for(int j = 0; j < 3; j++) {
	    			System.out.print(array[i][j]+" "); 
	    			}
	    	    System.out.println(); 
	    	}
	}
	
	private static void secondArrayFlip(int [][] matrix) {
		  
	    for(int i = 2; i >= 0; i--)  
	        {  
	            for(int j = 0; j < 3; j++)  
	            {  
	                System.out.print(array[j][i]+" ");  
	            }  
	            System.out.println(" ");  
	        }  
	}
	
	private static void tekrarSayisi() {
		
		
		System.out.println("isim giriniz:");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println("isminiz: " + str);
				
        // Creating a HashMap containing char as a key and occurrences as a value
        Map<Character, Integer> map = new HashMap<Character, Integer>();
 
        // Converting given string into a char array
        char[] charArray = str.toCharArray();
 
        // Checking each character of charArray
        for (char c : charArray) {
 
            if (map.containsKey(c)) {
 
                // If character is present in map incrementing it's count by 1
                map.put(c, map.get(c) + 1); //HashMap içerisinde parametre olarak almış olduğu
                //anahtar değeri bulunuyorsa eşleşmiş olduğu değeri geri döndürür.
            }
            else {
                map.put(c, 1);// Parametre olarak aldığı anahtar değeri yapı içerisinde bulunmuyor ise almış olduğu değer ile anahtar yapısını eşler ve depolar.
            }
        }
 
        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
 
            if (entry.getValue() >= 1) {
                System.out.print(entry.getKey()+""+ entry.getValue());
            }
        }
    }}
 
 