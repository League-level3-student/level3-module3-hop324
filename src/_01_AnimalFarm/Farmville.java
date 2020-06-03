package _01_AnimalFarm;

import java.util.ArrayList;

public class Farmville {
 public static void main(String [] args) {
	 ArrayList<Animal> farm = new ArrayList<Animal>();
	 Chickens Stanley = new Chickens("");
	 Chickens Stanford = new Chickens("");
	 Sheep Tyler = new Sheep("");
	 Sheep Tygan = new Sheep("");
	 Cow Buttermilk = new Cow("");
	 Piggy Bacon = new Piggy("");
	 farm.add(Stanley);
	 farm.add(Tyler);
	 farm.add(Tygan);
	 farm.add(Stanford);
	 farm.add(Buttermilk);
	 farm.add(Bacon);

	 for(int i = 0; i < farm.size(); i++) {
		 System.out.println(farm.get(i).makeNoise());
	 }
 }
}
