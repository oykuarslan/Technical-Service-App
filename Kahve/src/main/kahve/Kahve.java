package main.kahve;

public class Kahve { //superclass
	
	private int makineSifresi;
	private int kahveOranı;
	private String bardakBoyutu;
	private int fiyat;
	private int bardakSayisi;
	
	
	public final void setKasaSifresi(int makineSifresi){
		this.makineSifresi = makineSifresi;
	}
	
	public int getKahveOranı() {
		return kahveOranı;
	}
	
	public void setKahveOranı(int kahveOranı) {
		this.kahveOranı = kahveOranı;
	}
	
	public String getBardakBoyutu() {
		return bardakBoyutu;
	}
	
	public void setBardakBoyutu(String bardakBoyutu) {
		this.bardakBoyutu= bardakBoyutu;
	}
	
	public int getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	public void Fiyat(int _fiyat_) {
		System.err.println("fiyat:......" +fiyat );
	}
	
	
	public int getBardakSayisi() {
		return bardakSayisi;
	}
	
	public void setBardakSayisi(int bardakSayisi) {
		this.bardakSayisi = bardakSayisi;
	}
}

