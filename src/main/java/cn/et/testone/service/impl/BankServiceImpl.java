package cn.et.testone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.et.testone.dao.BankRepository;
import cn.et.testone.entity.Bank;
import cn.et.testone.service.BankService;

@Service
public class BankServiceImpl implements BankService{
	@Autowired
	JdbcTemplate jt;
	@Autowired
	BankRepository br;
	public Bank queryBank(){
		Bank b = br.findOne(2);
		return b;
	}
	public String saveBank(){
		Bank b = new Bank();
		b.setUsername("E");
		b.setBalance(9500);
		br.save(b);
		return "1";
	}
	public String updateBank(){
		Bank b = new Bank();
		b.setUsername("Update");
		b.setBalance(9500);
		b.setId(2);
		br.save(b);
		return "1";
	}
	public String deleteBank(){
		br.delete(1);
		return "1";
	}
}
