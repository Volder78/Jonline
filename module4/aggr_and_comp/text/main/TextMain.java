package by.jonline.aggr_and_comp.text.main;

import by.jonline.aggr_and_comp.text.entity.Sentence;
import by.jonline.aggr_and_comp.text.entity.Text;
import by.jonline.aggr_and_comp.text.entity.Word;
import by.jonline.aggr_and_comp.text.view.SentenceView;
import by.jonline.aggr_and_comp.text.view.TextView;

public class TextMain {

	public static void main(String[] args) {
		
		Text text = new Text();
		TextView textView = new TextView();
		SentenceView sentView = new SentenceView();
		
		text.setTitle("Extract");
		sentView.viewTitle(text);
		
		Sentence first = new Sentence();
		Sentence second = new Sentence();
		
		first.addWord(new Word("The"));
		first.addWord(new Word("drawing"));
		first.addWord(new Word("room"));
		first.addWord(new Word("door"));
		first.addWord(new Word("opened"));
		first.addWord(new Word("behind"));
		first.addWord(new Word("him."));
		
		text.addSentence(first);
		
		second.addWord(new Word("A"));
		second.addWord(new Word("woman"));
		second.addWord(new Word("spoke."));
		
		text.addSentence(second);
		
		textView.viewText(text);

	}

}
