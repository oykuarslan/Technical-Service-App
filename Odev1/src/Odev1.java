import java.util.Scanner;


public class Odev1 {

	static String isim;
	public static void main(String[] args) {
		//isim girme
	System.out.println("isim giriniz:");
	Scanner scn = new Scanner(System.in);
	String isim = scn.nextLine();
	System.out.println("isminiz: " + isim);
	char c [] = isim.toCharArray();
	
	for (int i = 0; i < isim.length(); i++) {
		
		if(c[i] == 'a') {
			c[i] = '1';
		}
		else if (c[i] == 'e') {
			c[i] = '2';
		}
		else if (c[i] == 'ı') {
			c[i] = '3';
		}
		else if (c[i] == 'i') {
			c[i] = '4';
		}
		else if (c[i] == 'o') {
			c[i] = '5';
		}
		else if (c[i] == 'ö') {
			c[i] = '6';
		}
		else if (c[i] == 'u') {
			c[i] = '7';
		}
		else if (c[i] == 'ü') {
			c[i] = '8';
		}
	}
	System.out.println(c);
	}}
	