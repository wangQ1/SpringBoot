package cn.et.testtwo.service;

import java.util.List;
import cn.et.testtwo.entity.Bank;

public interface BankService {
	public List<Bank> queryBank();
	
	public String saveBank();
	
	public String updateBank();
	
	public String deleteBank();
}
