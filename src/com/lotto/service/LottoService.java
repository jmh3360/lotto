package com.lotto.service;

import java.util.List;

import com.lotto.bean.LottoBean;

public interface LottoService {
	public String buyLotto(String string);
	public List<LottoBean> makeLottoNum();
	public void buyLotto(LottoBean bean);
	public int[] createLotto();
}
