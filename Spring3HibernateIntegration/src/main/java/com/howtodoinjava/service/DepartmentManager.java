package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.entity.DepartmentEntity;

public interface DepartmentManager {
	public void addDepartment(DepartmentEntity department);
    public List<DepartmentEntity> getAllDepartments();
    public void deleteDepartment(Integer departmentId);
}
