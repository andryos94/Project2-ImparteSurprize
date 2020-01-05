package bags;

import java.util.ArrayList;


import surprise.ISurprise;

public abstract class AbstractBag implements IBag {
	private ArrayList<ISurprise> surprises;
	
	public AbstractBag(ArrayList<ISurprise> surprises) {
		this.surprises = surprises;
	}
	
	public ArrayList<ISurprise> getSurprises() {
		return surprises;
	}

	public void put(ISurprise newSurprise) {
		this.surprises.add(newSurprise);
	}
	
	public void put(IBag bagOfSurprises) {
		if(bagOfSurprises.isEmpty()) {
			System.out.println("NO surprise to add!");
		}
		for(int i = 0; i < bagOfSurprises.size(); i++) {
			ISurprise s = bagOfSurprises.takeOut();
			this.put(s);
		}
	}

	public boolean isEmpty() {
		if(this.surprises.size() == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return this.surprises.size();
	}
	
	public ISurprise takeOut() {
		if(this.isEmpty()) {
			return null;
		}
		ISurprise s = this.surprises.get(this.size() - 1);
		this.surprises.remove(this.size() - 1);
		return s;
	}
}
