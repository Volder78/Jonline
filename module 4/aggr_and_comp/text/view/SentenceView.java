package by.jonline.aggr_and_comp.text.view;

import by.jonline.aggr_and_comp.text.entity.*;

public class SentenceView {
	
	public void viewSentence(Sentence s) {
		WordView wView = new WordView();
		for(Word word : s.getSentence()) {
			wView.wordView(word);
		}
	
	}
	
	public void viewTitle(Text text) {
		System.out.println("Title: " + text.getTitle());
	}

}
