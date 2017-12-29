package cn.et.testone.dao;
import org.springframework.data.repository.CrudRepository;

import cn.et.testone.entity.Bank;

public interface BankRepository extends CrudRepository<Bank, Integer> {
}
