package com.lotto.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.lotto.bean.LottoBean;
import com.lotto.service.LottoService;

public class LottoServiceImple implements LottoService {

	private List<LottoBean> lottos;

	public LottoServiceImple() {

		lottos = new ArrayList<LottoBean>();
	}

	@Override
	public String buyLotto(String money) {
		String res = "";
		String res2 = "";
		LottoBean lotto=null;
		int[] arr= new int[6];
		res = (Integer.parseInt(money)>5000) ? "5" : (""+(Integer.parseInt(money)/1000)) ;
		System.out.println(res);
		for(int k = 0; k < Integer.parseInt(res); k++) {
			lotto = new LottoBean();
			int[] t = createLotto();
			res2 ="";
		for(int i = 0; i < t.length; i++) {
			res2 += t[i] +",";
		}
		lotto.setLottoNum(res2);
		lottos.add(lotto);
		}
		return res ;
	}
	@Override
	public int[] createLotto() {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length;i++) {
			int num = (int) (Math.random()*45 + 1);
			boolean exist = false;
			for(int j = 0; j < lotto.length; j++) {
				if(num == lotto[j]) {
					exist = true;
					break;
				}
			}
			if(exist) {
				i--;
				continue;//for 으로 올라가라
			}else {
				lotto[i] = num;
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
	@Override
	public List<LottoBean> makeLottoNum() {
		return lottos;
	}

	@Override
	public void buyLotto(LottoBean bean) {
		// TODO Auto-generated method stub
		
	}


}
