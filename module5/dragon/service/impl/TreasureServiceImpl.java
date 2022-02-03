package by.jonline.oop.dragon.service.impl;

import java.util.List;

import by.jonline.oop.dragon.bean.Treasure;
import by.jonline.oop.dragon.dao.DaoException;
import by.jonline.oop.dragon.dao.DaoProvider;
import by.jonline.oop.dragon.dao.TreasureDao;
import by.jonline.oop.dragon.service.ServiceException;
import by.jonline.oop.dragon.service.TreasureService;
import by.jonline.oop.dragon.service.util.Validator;

public class TreasureServiceImpl implements TreasureService {

	DaoProvider provider = DaoProvider.getInstance();
	TreasureDao treasureDao = provider.getTreasureDao();

	@Override
	public Treasure mostExpensive() throws ServiceException {
		Treasure treasure;
		try {
			treasure = treasureDao.mostExpensive();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}

		return treasure;
	}

	@Override
	public List<Treasure> displayAllTreasures() throws ServiceException {
		List<Treasure> treasures;
		try {
			treasures = treasureDao.displayAllTreasures();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return treasures;
	}

	@Override
	public List<Treasure> selectBySum(int sum) throws ServiceException {
		List<Treasure> treasures;
		if (!Validator.isValidData(sum)) {
			throw new ServiceException("Sum of money should be > 0!");
		} else {
			try {
				treasures = treasureDao.selectBySum(sum);
			} catch (DaoException e) {
				throw new ServiceException(e);
			}
		}
		return treasures;
	}

}
