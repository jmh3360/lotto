package com.lotto.bean;

public class LottoBean {

	private String money;
	private String lottoNum;
	
	
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
	public String getLottoNum() {
		return lottoNum;
	}
	public void setLottoNum(String lottoNum) {
		this.lottoNum = lottoNum;
	}
	@Override
	public String toString() {
		return "로또 번호= " + lottoNum +"\n" ;
	}
}
