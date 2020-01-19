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
		while(!this.bag.isEmpty()) {
			this.give().enjoy();
			try {
				TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean isEmpty() {
		return this.bag.isEmpty();
	}

	protected abstract void giveWithPassion();
}
