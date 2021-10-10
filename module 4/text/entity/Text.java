package by.jonline.aggr_and_comp.text.entity;

/*
	Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
	консоль текст, заголовок текста
*/

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	private String title;
	private List<Sentence> text;
	
	public Text() {
		super();
		title = "";
		text = new ArrayList<Sentence>();
	}
	
	public Text(String title, List<Sentence> text) {
		super();
		this.title = title;
		this.text = text;
	}
	
	public String getTitle() {
		return title;
	}
	
	public List<Sentence> getText() {
		return text;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setText(List<Sentence> text) {
		this.text = text;
	}
	
	public void addSentence(Sentence sentence) {
		text.add(sentence);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}
	
	

}
