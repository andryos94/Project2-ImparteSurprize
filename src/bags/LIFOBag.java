package bags;

import java.util.ArrayList;

import surprise.ISurprise;

public class LIFOBag extends AbstractBag {
	
	public LIFOBag(ArrayList<ISurprise> surprises) {
		super(surprises);
	}
	
	@Override
	public ISurprise takeOut() {
		if(super.isEmpty()) {
			return null;
		}
		ISurprise s = super.getSurprises().get(super.size() - 1);
		super.getSurprises().remove(super.size() - 1);
		return s;
	}
}
