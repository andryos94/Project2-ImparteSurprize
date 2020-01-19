package surprise;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	//private static Random random;
	private static final Random random = new Random();
	
	private GatherSurprises() {
		
	}
	
	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> surprises = new ArrayList<ISurprise>();
		int r = 0;
		for(int i = 0; i < n; i++) {
			r = random.nextInt(3);
			switch(r) {
			case 0:
				FortuneCookie f = FortuneCookie.generate();
				surprises.add(f);
				break;
			case 1:
				Candies c = Candies.generate();
				surprises.add(c);
				break;
			case 2:
				MinionToy m = MinionToy.generate();
				surprises.add(m);
				break;
			}
		}
		return surprises;
	}
	
	public static ISurprise gather() {
		int r = random.nextInt(3);
		switch(r) {
		case 0:
			return FortuneCookie.generate();
		case 1:
			return Candies.generate();
		case 2:
			return MinionToy.generate();
		}
		return null;
	}
}
