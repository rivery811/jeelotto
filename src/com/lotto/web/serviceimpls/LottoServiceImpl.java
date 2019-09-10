package com.lotto.web.serviceimpls;

import java.util.Random;

import com.lotto.web.daoimpls.LottodaoImpl;
import com.lotto.web.daos.Lottodao;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
	private Lottodao dao;
	
	public LottoServiceImpl() {
		dao = new LottodaoImpl();
	}

	
	@Override
	public void createLotto(LottoBean param) {
	param.setBall(createball()+"");
	param.setLotteryNum( createlotteryNum());
	param.setLottoSeq(createLottoSeq());
	dao.insertLotto(param);
	
		
	}

	@Override
	public String createLottoSeq() {
		Random random = new Random();
		String result = "";
		for(int i = 0 ; i <4; i++) {
			result += random.nextInt(9)+"";
		}
		return "NO"+result;
	}

	@Override
	public int createball() {
		Random random = new Random();
		int ball = random.nextInt(44)+1;
		return ball;
	}

	@Override
	public String createlotteryNum() {
		String result = "";
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			int a=  createball();
			if(!exist(arr,  a)) {
				arr[i] = a;
			}else {
				i--;
			}
		}
		
		arr =  bubbleSort(arr, true);
		for(int i = 0; i < arr.length; i++) {
			result += arr[i]+",";
		}
		return result;
	}

	@Override
	public boolean exist(int[] arr, int a) {
		boolean flag = false;
		for(int i :arr) {
			if(a==i) {
				flag= true;
			}
		}
		return flag;
	}

	@Override
	public int[] bubbleSort(int[] arr, boolean flag) {
		int t = 0;
		for(int i = 0; i < arr.length; i++) {
			for(i = 0; i < arr.length-1; i++) {
				if(flag) {
					if(arr[i]>arr[i+1]) {
						t = arr[i];
						arr[i]= arr[i+1];
						arr[i+1]= t;
					}
					
				}else {
					if(arr[i]<arr[i+1]) {
						t = arr[i];
						arr[i]= arr[i+1];
						arr[i+1]= t;
					}
					
				}
			}
			
		}
		return arr;
	}

}
