package by.jonline.oop.dragon.controller;

import java.util.ArrayList;
import java.util.List;

import by.jonline.oop.dragon.bean.Treasure;
import by.jonline.oop.dragon.service.ServiceException;
import by.jonline.oop.dragon.service.ServiceProvider;
import by.jonline.oop.dragon.service.TreasureService;

public class Controller {
	
		ServiceProvider provider = ServiceProvider.getInstance();
		TreasureService service = provider.getTreasureService();
		
	public String doAction(String request) {
		String response;
		String[] commands = request.split(" ");
		
		switch(commands[0]) {
		case "1":
			response = displayAllTreasures();
			break;
		case "2":
			response = mostExpensive();
			break;
		case "3":
			response = selectBySum(commands[1]);
			break;
		default:
			response = "Irrelevant command";	
		}
		
		return response;
	}
	
	public String displayAllTreasures() {
		
		List<Treasure> treasures = new ArrayList<Treasure>();
		
		
		try {
			treasures = service.displayAllTreasures();
			
		} catch(ServiceException e) {
			System.err.println(e);
		}
		
		StringBuffer sb = new StringBuffer();
		for(Treasure t : treasures) {
			sb.append(t.toString()).append(";\n");
		}
		
		return sb.toString();
		
	}
	
	public String mostExpensive() {
		Treasure treasure = null;
		
		try {
			treasure = service.mostExpensive();
			
		} catch(ServiceException e) {
			System.err.println(e);
		}
		
		return treasure.toString();
	}
	
	public String selectBySum(String request) {
		List<Treasure> treasures = new ArrayList<Treasure>();
		int sum = Integer.parseInt(request);
		
		try {
			treasures = service.selectBySum(sum);
			
		} catch(ServiceException e) {
			System.err.println(e);
		}
		
		StringBuffer sb = new StringBuffer();
		for(Treasure t : treasures) {
			sb.append(t.toString()).append("\n");
		}
		
		return sb.toString();
		
		
	}
	
	

}
