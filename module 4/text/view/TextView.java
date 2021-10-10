package by.jonline.aggr_and_comp.text.view;

import by.jonline.aggr_and_comp.text.entity.*;

public class TextView {
	
	public void viewText(Text text) {
		SentenceView sView = new SentenceView();
		for(Sentence s : text.getText()) {
			sView.viewSentence(s);
			
		}
	}

}
