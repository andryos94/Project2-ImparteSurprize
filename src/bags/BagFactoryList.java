package bags;

public class BagFactoryList implements IBagFactory {
	
	public IBag makeBag(String type) {
		switch(type) {
		case "RANDOM":
			return new RANDOMBag();
		case "LIFO":
			return new LIFOBag();
		case "FIFO":
			return new FIFOBag();
		}
		return null;
	}
	
}
