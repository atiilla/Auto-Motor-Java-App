package be.intec.auto;

public class Motor {
	
	private final int MAX_TOERENTAL = 5800; // (final)
	private int toerental;
	
	public Motor() {
		
		toerental = 0;
		
	}

	public int getToerental() {
		return toerental;
	}

	public void setToerental(int toerental) {
		if(toerental > MAX_TOERENTAL) {
			this.toerental = 5800;
		}else {
			this.toerental = toerental;
		}
		
	}
	
	public void verhoogToerental(int extraToeren) { 
		toerental += extraToeren;
		setToerental(toerental);
		if(toerental >= MAX_TOERENTAL ) {
			
			toerental = MAX_TOERENTAL;
		}else {
			this.toerental = toerental;
		}
	
	}
	

}
