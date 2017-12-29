package cn.et.testone.service;

import cn.et.testone.entity.Bank;

public interface BankService {
	public Bank queryBank();
	
	public String saveBank();
	
	public String updateBank();
	
	public String deleteBank();
}
