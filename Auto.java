package be.intec.auto;

public class Auto {

	private String merknaam;
	private String nummerplaat;
	private Motor motor = new Motor();
	public Auto(Auto auto) {
		this(auto.merknaam,auto.nummerplaat);
		
	}
	
	public  Auto() {
		
		
	}

	public Auto(String merknaam, String nummerplaat) {
		this.merknaam = merknaam;
		this.nummerplaat = nummerplaat;
		toString();
	}

	public void geefGas(int toerental) {
		motor.verhoogToerental(toerental);

	}

	public void geefGas() {
		motor.verhoogToerental(200);
		
	}
	
	public void toonToerental() {
		System.out.println(motor.getToerental());

	}

	public void rem() {
		motor.setToerental(200);
		motor.setToerental(200);
		motor.setToerental(0);
	}
	
	public String toString() {
		this.merknaam = merknaam;
		this.nummerplaat = nummerplaat;
        return merknaam + " met kenteken " + nummerplaat;
    }
	

}
