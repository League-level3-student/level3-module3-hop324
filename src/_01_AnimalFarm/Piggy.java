package _01_AnimalFarm;

public  class Piggy extends Animal{
	public Piggy(String noise) {
		super(noise);
		this.noise = "Oink";
	}
	
	
	@Override
	public String makeNoise() {	
		return this.noise;
	}
}
