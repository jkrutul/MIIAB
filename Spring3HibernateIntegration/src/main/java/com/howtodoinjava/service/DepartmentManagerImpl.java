package com.howtodoinjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.dao.DepartmentDAO;
import com.howtodoinjava.dao.EmployeeDAO;
import com.howtodoinjava.entity.DepartmentEntity;

@Service
public class DepartmentManagerImpl implements DepartmentManager{
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Transactional
	public void addDepartment(DepartmentEntity department) {
		departmentDAO.addDepartment(department);
	}
	
	@Transactional
	public List<DepartmentEntity> getAllDepartments() {
		return departmentDAO.getAllDepartments();
	}
	
	@Transactional
	public void deleteDepartment(Integer departmentId) {
		departmentDAO.deleteDepartment(departmentId);
		
	}


	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}


}
