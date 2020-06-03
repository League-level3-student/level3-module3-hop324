package _01_AnimalFarm;

public class Cow extends Animal{
	public Cow(String noise) {
		super(noise);
		this.noise = "Moo";
	}
	
	
	@Override
	public String makeNoise() {	
		return this.noise;
	}
}
