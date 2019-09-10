package com.lotto.web.daoimpls;

import java.io.File;

import com.lotto.web.daos.Consumerdao;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.pool.Constants;

import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

public class ConsumerdaoImpl implements Consumerdao {
	

	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(Constants.FILEPATH + "consumer.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s, %s",param.getCid(),param.getPw()));
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
