package bags;

import java.util.ArrayList;

import java.util.Random;

import surprise.ISurprise;

public class RANDOMBag extends AbstractBag {
	private static final Random random = new Random();
	
	public RANDOMBag() {
		
	}
	
	public RANDOMBag(ArrayList<ISurprise> surprises) {
		super(surprises);
	}
	
	@Override
	public ISurprise takeOut() {
		if(super.isEmpty()) {
			return null;
		}
		int r = random.nextInt(super.size());
		ISurprise s = super.getSurprises().get(r);
		super.getSurprises().remove(r);
		return s;
	}
}
