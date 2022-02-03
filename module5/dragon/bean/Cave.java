package by.jonline.oop.dragon.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cave implements Serializable {
	
	private static final long serialVersionUID = -5838984500878329881L;
	
	private List<Treasure> treasures;
	
	public Cave() {
		treasures = new ArrayList<Treasure>();
	}
	
	public Cave(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}
	
	

}
