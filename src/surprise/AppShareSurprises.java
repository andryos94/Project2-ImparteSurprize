package surprise;

import java.util.ArrayList;
import bags.BagFactoryList;
import bags.FIFOBag;
import bags.IBag;
import bags.LIFOBag;
import bags.RANDOMBag;

public class AppShareSurprises {
	public static void printISurprise(ArrayList<ISurprise> surprises) {
		for(int i = 0; i < surprises.size(); i++) {
			surprises.get(i).enjoy();
		}
		System.out.println();
	}
	
	public static void printIBag(IBag bag) {
		while(!bag.isEmpty()) {
			bag.takeOut().enjoy();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//RANDOMBag test
		System.out.println("RANDOM Bag test");
		IBag bagRandom = new BagFactoryList().makeBag("RANDOM");
		
		ArrayList<ISurprise> surprisesForBagRandom = GatherSurprises.gather(4);
		ISurprise firstSurpriseForBagRandom = GatherSurprises.gather();
		ISurprise secondSurpriseForBagRandom = GatherSurprises.gather();
		printISurprise(surprisesForBagRandom);
		firstSurpriseForBagRandom.enjoy();
		secondSurpriseForBagRandom.enjoy();
		System.out.println();
		
		IBag bag = new RANDOMBag(surprisesForBagRandom);
		bagRandom.put(bag);
		System.out.println();
		printIBag(bagRandom);
		bagRandom.put(bag);//bag empty
		bagRandom.put(firstSurpriseForBagRandom);
		bagRandom.put(secondSurpriseForBagRandom);
		printIBag(bagRandom);
		
		//LIFO Bag test
		System.out.println("LIFO Bag Test");
		GiveSurpriseAndSing giveSurprAndSing = new GiveSurpriseAndSing("LIFO", 5);
		giveSurprAndSing.giveWithPassion();
		System.out.println();
		ArrayList<ISurprise> surprisesForBagLIFO = GatherSurprises.gather(4);
		printISurprise(surprisesForBagLIFO);
		
		IBag bag1 = new LIFOBag(surprisesForBagLIFO);
		
		giveSurprAndSing.put(bag1);
		System.out.println();
		giveSurprAndSing.giveAll();
		
		//FIFO Bag test
		System.out.println(); 
		System.out.println("FIFO Bag test");
		GiveSurpriseAndApplause giveSurprAndApplause = new GiveSurpriseAndApplause("FIFO", 5);
		giveSurprAndApplause.giveWithPassion();
		System.out.println();
		ArrayList<ISurprise> surprisesForBagFIFO = GatherSurprises.gather(4);
		printISurprise(surprisesForBagFIFO);
		
		IBag bag2 = new FIFOBag(surprisesForBagFIFO);
		
		giveSurprAndApplause.put(bag2);
		System.out.println();
		giveSurprAndApplause.giveAll();
		
	}

}
