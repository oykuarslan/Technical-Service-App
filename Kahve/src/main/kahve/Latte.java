package main.kahve;

public class Latte extends Kahve {
	
	private int kahveVeSut;

	@Override 
	public void Fiyat(int _fiyat_) {
		kahveVeSut = _fiyat_;
		System.err.println("1 espresso + sut");
		System.err.println("hesap: " + _fiyat_);
	}
	
	

}
