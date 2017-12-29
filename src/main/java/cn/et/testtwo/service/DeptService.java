package cn.et.testtwo.service;

import java.util.List;

import cn.et.testtwo.entity.Emp;
import cn.et.testtwo.entity.TreeNode;
import cn.et.testtwo.utils.PageTools;

public interface DeptService {
	public abstract List<TreeNode> queryDept(Integer pid);
	
	public PageTools queryEmpByDept(Integer id, String empName, Integer page, Integer rows);
	
	public void deleteEmp(String empid);
	
	public void updateEmp(Emp emp);
	
	public void saveEmp(Emp emp);
}