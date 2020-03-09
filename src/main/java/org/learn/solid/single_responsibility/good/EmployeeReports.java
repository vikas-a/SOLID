package org.learn.solid.single_responsibility.good;

public class EmployeeReports {

  public String describeEmployee(Employee employee) {
    return "Employee{" +
        "id=" + employee.getId() +
        ", name='" + employee.getName() + '\'' +
        ", daysWorked=" + employee.getDaysWorked() +
        ", region='" + employee.getRegion() + '\'' +
        ", salaryBand='" + employee.getSalaryBand() + '\'' +
        '}';
  }
}
