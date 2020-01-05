package bags;

import java.util.ArrayList;

import surprise.ISurprise;

public class BagFactoryList implements IBagFactory {
	private ArrayList<ISurprise> surprises;
	
	public IBag makeBag(String type) {
		switch(type) {
		case "RANDOM":
			return new RANDOMBag(surprises);
		case "LIFO":
			return new LIFOBag(surprises);
		case "FIFO":
			return new FIFOBag(surprises);
		}
		return null;
	}
}
