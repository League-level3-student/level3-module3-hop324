package _01_AnimalFarm;

public class Sheep extends Animal{
	public Sheep(String noise) {
		super(noise);
		this.noise = "Bahhh";
	}
	
	
	@Override
	public String makeNoise() {	
		return this.noise;
	}
}
