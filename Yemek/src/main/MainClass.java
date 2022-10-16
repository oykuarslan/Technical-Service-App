package main;

public class MainClass {

	public static void main(String[] args) {
		Asci yemek = new Asci();
		yemek.yap(new Et());
		yemek.yap(new Balik());
		yemek.yap(new Tatli());
	}

}
