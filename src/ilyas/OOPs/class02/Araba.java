package ilyas.OOPs.class02;

public class Araba {

	String marka;
	String model;
	String renk;
	int yil;
	int hiz;
	
	void surus() {
		System.out.println(model+" arabamin surusu cok iyi");
	}
	public static void main(String[] args) {
	
		Araba ar1=new Araba();
		ar1.marka="tofas";
		ar1.model="dogan";
		ar1.renk="mavi";
		ar1.yil=2020;
		ar1.hiz=250;
		System.out.println("Benim "+ar1.marka+" "+ar1.model+" arabam var. Rengi "+ar1.renk+", "+ar1.yil+" model "+ar1.hiz+" km hiz yapiyor.");

		ar1.surus();
		
		
		
		
	}
}
