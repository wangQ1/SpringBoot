package cn.et.testone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//自动配置 注解    必须添加(或使用EnableAutoConfiguration注解)
public class Main {
	/**
	 * springboot启动的方法  just run
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
