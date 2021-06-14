package com.block.spring.dto;

import java.sql.Timestamp;

public class EmployeeDTO {
	private int employee_id;
	private String first_Name;
	private String eMAIL;
	private Timestamp hire_date;
	private int SALARY;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String geteMAIL() {
		return eMAIL;
	}
	public void seteMAIL(String eMAIL) {
		this.eMAIL = eMAIL;
	}
	public Timestamp getHire_date() {
		return hire_date;
	}
	public void setHire_date(Timestamp hire_date) {
		this.hire_date = hire_date;
	}
	public int getSALARY() {
		return SALARY;
	}
	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employee_id=" + employee_id + ", first_Name=" + first_Name + ", eMAIL=" + eMAIL
				+ ", hire_date=" + hire_date + ", SALARY=" + SALARY + "]";
	}
	
	
	
}

	