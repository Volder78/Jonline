package by.jonline.oop.file.entity;

public class TextFile extends File {

	private static String extention = ".txt";
	private String content;

	public TextFile() {
		super();
		content = "";
	}

	public TextFile(String name, Directory dir) {
		super(name, dir);
		content = "";
	}

	public TextFile(String name, Directory dir, String content) {
		super(name, dir);
		this.content = content;
	}

	public static String getExtention() {
		return extention;
	}

	public static void setExtention(String extention) {
		TextFile.extention = extention;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void add(String content) {
		this.content += content;
	}

	public void view() {
		System.out.println(content);
	}

	@Override
	public File createFile(String name, Directory dir) {
		TextFile tf = new TextFile(name, dir);

		return tf;
	}

	@Override
	public void deleteFile() {
		super.deleteFile();
		content = "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

}
