package com.employee;

import java.util.*;

public class EmployeePayroll
{
  private final List<EmployeePayrollData> employeePayrollList;

     
      //Constructor
      public EmployeePayroll(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }
    public static void main( String[] args )
    {
      Scanner data = new Scanner(System.in);
      ArrayList<EmployeePayrollData>employeePayrollList = new ArrayList<>();
      EmployeePayroll employeePayroll = new EmployeePayroll(employeePayrollList);
      employeePayroll.readData(data);
      employeePayroll.writeData(data);
    }

    public void readData(Scanner data){
      System.out.println("ENTER THE EMPLOYEE ID: ");
      int id = data.nextInt();
      System.out.println("ENTER EMPLOYEE NAME: ");
      String name = data.nextLine();
      System.out.println("ENTER THE SALARY: ");
      double salary = data.nextDouble();
      employeePayrollList.add(new EmployeePayrollData(id,name,salary));
   }
       
   private void writeData(Scanner data) {
		System.out.println("\n: Employee Payroll :\n" + employeePayrollList);
}
}
