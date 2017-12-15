package prctice.controller;

import java.security.Provider.Service;

import javax.swing.JOptionPane;

import practice.service.JService;
import prctice.impl.JImple;

public class Controller {
	public static void main(String[] args) {
		JService service = new JImple();
		while(true) {
			switch(JOptionPane.showInputDialog(Value.MENU)) {
			case "0" :
				return;
			case "1" :
				String[] menu = {"짜장면/4500", "짬뽕/5000", "볶음밥/5500", "탕수육/10000"};
				service.readyMenu(menu);
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, service.orderMenu(JOptionPane.showInputDialog("음식/갯수"))+"원 입니다.");
				break;
			}
		}
	}
}
