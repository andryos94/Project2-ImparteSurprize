package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
	private static final ArrayList<String> minionNames = new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	private String name;
	private static int count;
	
	public String getName() {
		return this.name;
	}
	
	public MinionToy(String name) {
		this.name = name;
	}
	
	public static MinionToy generate() {
		MinionToy m = new MinionToy(minionNames.get(MinionToy.count));
		MinionToy.count = MinionToy.count + 1;
		if(MinionToy.count == minionNames.size()) {
			MinionToy.count = 0;
		}
		return m;
	}
	
	@Override
	public void enjoy() {
		System.out.println("The minion toy is " + getName() + "!");
	}

	
	
}
