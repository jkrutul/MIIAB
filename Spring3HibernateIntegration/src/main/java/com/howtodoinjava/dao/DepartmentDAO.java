package com.howtodoinjava.dao;

import java.util.List;

import com.howtodoinjava.entity.DepartmentEntity;

public interface DepartmentDAO {
    public void addDepartment(DepartmentEntity department);
    public List<DepartmentEntity> getAllDepartments();
    public void deleteDepartment(Integer departmentId);
    
}
