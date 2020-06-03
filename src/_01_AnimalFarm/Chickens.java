package _01_AnimalFarm;

public class Chickens extends Animal{
	public Chickens(String noise) {
		super(noise);
		this.noise = "Bawk";
	}
	
	
	@Override
	public String makeNoise() {	
		return this.noise;
	}
}
