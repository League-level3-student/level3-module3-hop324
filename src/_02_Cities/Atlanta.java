package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
	//	return (.85*(population*growthRate));
		return(population*(growthRate*2));
	}

}
