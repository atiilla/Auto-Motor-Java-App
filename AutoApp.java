package be.intec.auto;

public class AutoApp {

	public static void main (String [] args) {
		
		Auto auto = new Auto("VW GOLF", "BHZ456");
		Auto kopie = new Auto(auto);
		System.out.println("Test van: " + auto);
		
		for(int i = 0; i <30; i++) {
			auto.geefGas();
			auto.toonToerental();
		}
		
		System.out.println("REMMEN");
		auto.rem();
		
		for(int i =0; i<3; i++) {
			auto.geefGas(3000);
			auto.toonToerental();
		}
		
		
		
		System.out.println("\nkopie: "+ kopie);
	}
}
