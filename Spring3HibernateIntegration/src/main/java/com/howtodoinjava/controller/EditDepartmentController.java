package com.howtodoinjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.entity.DepartmentEntity;
import com.howtodoinjava.entity.EmployeeEntity;
import com.howtodoinjava.service.DepartmentManager;

@Controller
public class EditDepartmentController {
	
	@Autowired
	private DepartmentManager departmentManager;

	@RequestMapping(value = "/department", method = RequestMethod.GET)
	public String listDepartments(ModelMap map) 
	{
		map.addAttribute("department", new EmployeeEntity());
		map.addAttribute("departmentList", departmentManager.getAllDepartments());
		
		return "editDepartmentList";
	}

	@RequestMapping(value = "/department/add", method = RequestMethod.POST)
	public String addDepartment(@ModelAttribute(value="department") DepartmentEntity department, BindingResult result) 
	{
		departmentManager.addDepartment(department);
		return "redirect:/";
	}

	@RequestMapping("/department/delete/{departmentId}")
	public String deleteEmplyee(@PathVariable("departmentId") Integer departmentId)
	{
		departmentManager.deleteDepartment(departmentId);
		return "redirect:/";
	}

	public DepartmentManager getDepartmentManager() {
		return departmentManager;
	}

	public void setDepartmentManager(DepartmentManager departmentManager) {
		this.departmentManager = departmentManager;
	}
	
}
