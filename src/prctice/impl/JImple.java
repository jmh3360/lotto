package prctice.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import practice.service.JService;

public class JImple implements JService {
	Map<String,String> menuMap;
	Map<String,String> orderMap;
	public JImple() {
		menuMap = new HashMap<>();
		orderMap = new HashMap<>();
	}
	//(상품/가격) key 값.
	@Override
	public void readyMenu(String[] menu) {
		for(String s : menu) {
			String[] priMenu = s.split("/");
			menuMap.put(priMenu[0], priMenu[1]);
			
		}
		System.out.println(menuMap);
	}

	//(상품/갯수)
	@Override
	public String orderMenu(String a) {

		int count = 0;
		String[] menuC = a.split("/");
		Set<String> keys = menuMap.keySet();
		for(String key : keys) {
			if(menuC[0].equals(key)) {
				count = Integer.parseInt(menuMap.get(key));
			}
		}
		int pay = count*Integer.parseInt(menuC[1]);
		
		return "" + pay;
	}
	

}
