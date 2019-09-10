package com.lotto.web.serviceimpls;

import com.lotto.web.daoimpls.ConsumerdaoImpl;
import com.lotto.web.daos.Consumerdao;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.services.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService {
	
	private Consumerdao dao;
	
	public ConsumerServiceImpl() {
		dao = new ConsumerdaoImpl();
	}

	@Override
	public void registerConsumer(ConsumerBean param) {
	
		dao.insertConsumer(param);
		
		
	}

}
