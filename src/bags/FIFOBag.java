package bags;

import java.util.ArrayList;

import surprise.ISurprise;

public class FIFOBag extends AbstractBag {
	public FIFOBag() {
		
	}
	
	public FIFOBag(ArrayList<ISurprise> surprises) {
		super(surprises);
	}
	
	@Override
	public ISurprise takeOut() {
		if(super.isEmpty()) {
			return null;
		}
		ISurprise s = super.getSurprises().get(0);
		super.getSurprises().remove(0);
		return s;
	}
}
