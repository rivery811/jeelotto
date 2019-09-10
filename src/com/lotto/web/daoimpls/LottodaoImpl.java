package com.lotto.web.daoimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.lotto.web.daos.Lottodao;
import com.lotto.web.domains.LottoBean;

public class LottodaoImpl implements Lottodao {

	public static final String FILEPATH =String.format("C:%sUsers%suser%seclipse-jee%sjee-lotto%sWebContent%sresources%stxt%s"
            ,File.separator,File.separator,File.separator,File.separator,File.separator,File.separator,File.separator,File.separator);

	@Override
	public void insertLotto(LottoBean param) {
		System.out.println("dao insert직입"+param.toString());
		try {
			File file = new File(FILEPATH + "lotto.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s/%s", param.getLottoSeq(),param.getLotteryNum()));
			writer.newLine();
			writer.flush();
			System.out.println("dao insert직후"+param.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
