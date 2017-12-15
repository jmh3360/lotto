package com.lotto.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

import javax.swing.JOptionPane;

import com.lotto.bean.LottoBean;
import com.lotto.service.LottoService;
import com.lotto.serviceimpl.LottoServiceImple;

import net.lotto.jse.constants_pool.Value;

public class LottoController {
	public static void main(String[] args) {
		LottoBean bean = new LottoBean();
		LottoService imple = new LottoServiceImple();
		while (true) {
			switch (JOptionPane.showInputDialog(Value.MENU)) {
			case "0" : JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				JOptionPane.showMessageDialog(null, imple.buyLotto(JOptionPane.showInputDialog("구매할 금액을 입력하세요")) + "줄 입니다.");
				break;
			case "2":
				String message = imple.makeLottoNum().toString();
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				File f = new File("C:\\Users\\1027\\jse\\eclipse\\workspace\\lotto\\lotto.txt");
				BufferedWriter bw =null;
				try {
					 bw = new BufferedWriter(new FileWriter(f));
					 bw.write("로또 번호 : 1 2 3 4 5 6");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				} finally {
					try {
						bw.flush();
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				break;
			}
		}
	}
}
