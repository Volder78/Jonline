package by.epam.module3.asobject;

//�� ���� ����� "�����������" ��������� ����� "����"

public class Task4 {

	public static void main(String[] args) {
		String word1 = "�����������";
		String word2;

		StringBuffer b = new StringBuffer();

		char[] word1Sym = word1.toCharArray();
		char t = word1Sym[word1.indexOf('�')];
		char o = word1Sym[word1.indexOf('�')];
		char r = word1Sym[word1.indexOf('�')];

		word2 = b.append(t).append(o).append(r).append(t).toString();

		System.out.println(word2);

	}

}
