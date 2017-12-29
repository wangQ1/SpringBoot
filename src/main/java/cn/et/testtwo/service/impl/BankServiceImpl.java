package cn.et.testtwo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.testtwo.entity.Bank;
import cn.et.testtwo.mapper.BankMapper;
import cn.et.testtwo.service.BankService;

@Service
public class BankServiceImpl implements BankService{
	@Autowired
	BankMapper bm;
	@Override
	public List<Bank> queryBank() {
		return bm.queryBank();
	}

	@Override
	public String saveBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBank() {
		// TODO Auto-generated method stub
		return null;
	}
}
