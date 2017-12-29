package cn.et.testone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id//表示主键     当数据库列名与实体类属性名相同时 需要在注解中指定列名与属性绑定
	@GeneratedValue(strategy=GenerationType.AUTO)//主键生成的策略
	private int id;
	@Column
	private String username;
	@Column
	private int balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
