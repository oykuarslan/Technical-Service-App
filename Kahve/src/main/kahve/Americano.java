package main.kahve;

public class Americano extends Kahve {
	
	private int su;

	@Override 
	public void Fiyat(int _fiyat_) {
		su = _fiyat_;
		System.err.println("1 espresso + su");
		System.err.println("hesap: " + _fiyat_);
	}
}
