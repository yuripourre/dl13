package net.mgsx.dl13.store;

import com.badlogic.gdx.utils.Array;

public class GameStore {
	private static final int MAX_RECORDS = 10;
	
	public Array<GameRecord> records = new Array<GameRecord>();

	public void compress() {
		records.truncate(MAX_RECORDS);
		
	}
}
