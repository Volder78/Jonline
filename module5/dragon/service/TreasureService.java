package by.jonline.oop.dragon.service;

import java.util.List;

import by.jonline.oop.dragon.bean.Treasure;

public interface TreasureService {

	Treasure mostExpensive() throws ServiceException;

	List<Treasure> displayAllTreasures() throws ServiceException;

	List<Treasure> selectBySum(int sum) throws ServiceException;

}
