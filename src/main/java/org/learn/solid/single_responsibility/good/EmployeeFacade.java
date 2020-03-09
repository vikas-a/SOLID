package org.learn.solid.single_responsibility.good;

public class EmployeeFacade {

  private EmployeeGateway gateway;
  private EmployeePolicy policy;
  private  EmployeeReports report;

  public double calculatePay(Employee employee){
    return policy.calculatePay(employee.getDaysWorked(),employee.getRegion(),employee.getSalaryBand());
  }
  public void save(Employee employee){
    gateway.save(employee);
  }

  public String describeEmployee(Employee employee){
    return report.describeEmployee(employee);
  }

  public void setGateway(EmployeeGateway gateway) {
    this.gateway = gateway;
  }

  public void setPolicy(EmployeePolicy policy) {
    this.policy = policy;
  }

  public void setReport(EmployeeReports report) {
    this.report = report;
  }

}
