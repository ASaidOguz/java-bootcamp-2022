package intro;

public class Main {
//main javada başlangıç noktasıdır.
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String metin="Ilgili biri olarak";
		String altmetin="Vade süresi";
		
		System.out.println(metin);
		int vade=120;
		
		double dolarDun=18.15;
		double dolarBugun=18.20;
		
		boolean dolarNeDurumda=false;
		String okyonu="down.svg";
		
		if (dolarDun>dolarBugun) {
		System.out.println(okyonu)	;
		} else if(dolarDun<dolarBugun) {
			okyonu="up.svg";
			System.out.println(okyonu);
		}
		else {
			okyonu="equal.svg";
			System.out.println(okyonu);
		}
		//String ---
		
		String[] krediler={"Kredıler","ve dahacokKrediler","cok fazla kredi"};
		
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		

	}

}
