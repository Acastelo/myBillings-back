package br.com.alexandre.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	
	private List<Student> studentRecords;
	
	private static StudentRegistration stdregd = null;
	
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}
	
	public static StudentRegistration getInstance() {
		
		if(stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		} else {
			return stdregd;
		}
	}
	
	public void add(Student std) {
		studentRecords.add(std);
	}
	
	public String upDateStudent(Student std) {
		for(int i = 0; i < studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if (stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				studentRecords.set(i, std);
				return "Estudante Atualizado";
			}
		}
		return "Estudante não atualizado";
	}
	
	public String deleteStudent(String registrationNumber) {
		for(int i=0; i<studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
		    if(stdn.getRegistrationNumber().equals(registrationNumber)){
		    	studentRecords.remove(i);//update the new record
		        return "Estudante Deletado";
		     }
		}
		return "Estudante não pôde ser deletado";
	}
	
	public List<Student> getStudentRecords() {
		return studentRecords;
	}

}
