package main;

public class Asci {
	
	private Yemekler yemek = null;

	public void yap(Yemekler yemek)
	{
		yemek.yemekYap();
	
	}

	public Yemekler getYemek() {
		return yemek;
	}

	public void setYemek(Yemekler yemek) {
		this.yemek = yemek;
	}

}
