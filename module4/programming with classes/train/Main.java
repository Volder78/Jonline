package by.epam.classprog.train;

/*
 *  �������� �����  Train, ����������  ����: �������� ������ ����������, ����� ������, ����� �����������. 
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� 
������� �������. �������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
��������  ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� 
���������� ������ ���� ����������� �� ������� �����������
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Train> trains = new ArrayList<>();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();

		trains.add(new Train(315, "�����", "17:45"));
		trains.add(new Train(48, "�����", "00:12"));
		trains.add(new Train(624, "������", "21:38"));
		trains.add(new Train(795, "�����", "13.35"));
		trains.add(new Train(745, "������", "10:21"));

		view.printInfoByNumber(trains);
		System.out.println();

		logic.sortByNumber(trains);
		view.print(trains);

		System.out.println();
		logic.sortByDestination(trains);

		logic.sortByTime(trains);
		view.print(trains);

	}

}
