package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentServices {
	
	public List<Department> findAll(){
		List<Department> lista = new ArrayList<Department>();
		lista.add(new Department(1, "Books"));
		lista.add(new Department(2, "Computers"));
		lista.add(new Department(3, "Electronics"));
		
		return lista;
	}

}
