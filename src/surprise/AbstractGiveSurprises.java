package surprise;
import java.util.concurrent.TimeUnit;

import bags.BagFactoryList;
import bags.IBag;

public abstract class AbstractGiveSurprises {
	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		BagFactoryList b = new BagFactoryList();
		this.bag = b.makeBag(type);
		this.waitTime = waitTime;
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.bag.put(surprises);
	}

	public ISurprise give() {
		return this.bag.takeOut();
	}

	public void giveAll() {
		try {
			for(int i = 0; i < this.bag.size(); i++) {
				this.give().enjoy();
				TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	protected abstract void giveWithPassion();
}
