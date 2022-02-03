package by.jonline.oop.dragon.dao;

import java.util.List;

import by.jonline.oop.dragon.bean.Treasure;

public interface TreasureDao {

	Treasure mostExpensive() throws DaoException;

	List<Treasure> displayAllTreasures() throws DaoException;

	List<Treasure> selectBySum(int sum) throws DaoException;

}
