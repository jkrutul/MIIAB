package com.howtodoinjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.entity.DepartmentEntity;

@Repository
public class DepartementDaoImpl implements DepartmentDAO {
	@Autowired
    private SessionFactory sessionFactory;
	public void addDepartment(DepartmentEntity department) {
		this.sessionFactory.getCurrentSession().save(department);
	}

	public List<DepartmentEntity> getAllDepartments() {
		return this.sessionFactory.getCurrentSession().createQuery("from DepartmentEntity").list();
	}

	public void deleteDepartment(Integer departmentId) {
		DepartmentEntity department = (DepartmentEntity) sessionFactory.getCurrentSession().load(
					DepartmentEntity.class, departmentId);
		if (null != department) {
			this.sessionFactory.getCurrentSession().delete(department);
		}
	}

}
