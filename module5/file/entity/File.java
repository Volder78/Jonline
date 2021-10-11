package by.jonline.oop.file.entity;

public class File {

	private String name;
	private Directory dir;

	public File() {

	}

	public File(String name, Directory dir) {
		this.name = name;
		this.dir = dir;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Directory getDir() {
		return dir;
	}

	public void setDir(Directory dir) {
		this.dir = dir;
	}

	public File createFile(String name, Directory dir) {
		File file = new File(name, dir);

		return file;
	}

	public void deleteFile() {
		name = null;
		dir = null;
	}

	public void remaneFile(String aName) {
		this.name = aName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dir == null) ? 0 : dir.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		File other = (File) obj;
		if (dir == null) {
			if (other.dir != null)
				return false;
		} else if (!dir.equals(other.dir))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", dir=" + dir + "]";
	}

}
