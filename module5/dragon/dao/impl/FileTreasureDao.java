package by.jonline.oop.dragon.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.jonline.oop.dragon.bean.Treasure;
import by.jonline.oop.dragon.dao.DaoException;
import by.jonline.oop.dragon.dao.TreasureDao;

public class FileTreasureDao implements TreasureDao {

	private static final String TREASURE_SOURCE = "src/res/treasures.txt";

	@Override
	public Treasure mostExpensive() throws DaoException {
		Treasure treasure = new Treasure();
		BufferedReader reader = null;
		String[] params;

		try {
			reader = new BufferedReader(new FileReader(TREASURE_SOURCE));
			params = reader.readLine().split(" ");
			treasure.setPrice(Integer.parseInt(params[1].split("=")[1]));
			while (reader.ready()) {
				params = reader.readLine().split(" ");
				int price = Integer.parseInt(params[1].split("=")[1]);
				if (treasure.getPrice() < price) {
					String title = params[0];
					treasure = new Treasure(title, price);

				}
			}
		} catch (IOException e) {
			throw new DaoException(e);

		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new DaoException(e);
				}
			}
		}
		return treasure;
	}

	@Override
	public List<Treasure> displayAllTreasures() throws DaoException {
		List<Treasure> treasures = new ArrayList<Treasure>();
		BufferedReader reader = null;
		String[] params;
		try {
			reader = new BufferedReader(new FileReader(TREASURE_SOURCE));
			while (reader.ready()) {
				params = reader.readLine().split(" ");
				String title = params[0];
				int price = Integer.parseInt(params[1].split("=")[1]);
				treasures.add(new Treasure(title, price));

			}
		} catch (IOException e) {
			throw new DaoException(e);

		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new DaoException(e);
				}
			}
		}
		return treasures;
	}

	@Override
	public List<Treasure> selectBySum(int sum) throws DaoException {
		List<Treasure> treasures = new ArrayList<Treasure>();
		BufferedReader reader = null;
		String[] params;
		try {
			reader = new BufferedReader(new FileReader(TREASURE_SOURCE));
			while (reader.ready()) {
				params = reader.readLine().split(" ");
				int price = Integer.parseInt(params[1].split("=")[1]);
				if (sum > price) {
					String title = params[0];
					treasures.add(new Treasure(title, price));
					sum -= price;
				}
			}
		} catch (IOException e) {
			throw new DaoException(e);

		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new DaoException(e);
				}
			}
		}
		return treasures;
	}

}
