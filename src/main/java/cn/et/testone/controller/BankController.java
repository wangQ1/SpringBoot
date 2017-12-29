package cn.et.testone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.testone.entity.Bank;
import cn.et.testone.service.BankService;
@RestController//简化代码  该注解中继承了Controller 与  RequestBody注解
public class BankController {
	@Autowired
	BankService bs;
	/*使用springmvc
	@RequestMapping("/test")
	public Map test(){
		Map map = new HashMap();
		map.put("id", 1);
		map.put("name", "zs");
		return map;
	}
	使用jdbctemplate
	@SuppressWarnings("rawtypes")
	@RequestMapping("/qb/{id}")
	public Map queryBankById(@PathVariable int id){
		List<Map<String, Object>> list = jt.queryForList("select * from bank where id = " + id);
		return list.get(0);
	}*/
	/**
	 * 使用hibernate
	 *  需自定义一个接口继承自CrudRepository
	 *   interface 接口名  extends CrudRepository<操作实体类型, 主键类型>
	 * @return
	 */
	@RequestMapping("/sb")
	public String saveBank(){
		if(bs.saveBank().equals("1")){
			return "新增成功";
		}
		return "新增失败";
	}
	@RequestMapping("/qb")
	public Bank queryBank(){
		return bs.queryBank();
	}
	@RequestMapping("/ub")
	public String updateBank(){
		if(bs.updateBank().equals("1")){
			return "修改成功";
		}
		return "修改失败";
	}
	@RequestMapping("/db")
	public String deleteBank(){
		if(bs.deleteBank().equals("1")){
			return "删除成功";
		}
		return "删除失败";
	}
}
