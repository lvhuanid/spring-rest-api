package com.dailycodebuffer.springrestapi.service;

import com.dailycodebuffer.springrestapi.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();
}
