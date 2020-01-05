package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	private static Random random;
	private static final ArrayList<String> candyTypes = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	private int noOfCandies;
	private String typeOfCandy;
	
	public int getNoOfCandies() {
		return this.noOfCandies;
	}
	
	public String getTypeOfCandy() {
		return this.typeOfCandy;
	}
	
	public Candies(int noOfCandies, int typeOfCandy) {
		this.noOfCandies = noOfCandies;
		this.typeOfCandy = candyTypes.get(typeOfCandy);
	}
	
	public static Candies generate() {
		int n1 = random.nextInt();
		while(n1 < 0) {
			n1 = random.nextInt();
		}
		int n2 = random.nextInt(candyTypes.size());
		Candies c = new Candies(n1,n2);
		return c;
	}
	
	@Override
	public void enjoy() {
		System.out.println("There are " + getNoOfCandies() + " " + getTypeOfCandy() + " candies in the package!");
	}
}
