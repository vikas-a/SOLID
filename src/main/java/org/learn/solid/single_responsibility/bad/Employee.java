package org.learn.solid.single_responsibility.bad;

public class Employee {
  private int id;
  private String name;
  private Integer daysWorked;
  private Integer basicSalaryPerDay;
  private String region;
  private String salaryBand;


  // Operations
  public double calculatePay(){
    return basicSalaryPerDay * daysWorked;
  }

  public String describeEmployee(){
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", daysWorked=" + daysWorked +
        ", basicSalaryPerDay=" + basicSalaryPerDay +
        '}';
  }


  // Architecture
 public void save(){
    System.out.print("Saved");
 }

  public void setId(int id) {
    this.id = id;
  }

  // Policy

  public void setBasicSalaryPerDay(Integer basicSalaryPerDay) {
    this.basicSalaryPerDay = basicSalaryPerDay;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDaysWorked(Integer daysWorked) {
    this.daysWorked = daysWorked;
  }

  public Integer getDaysWorked() {
    return daysWorked;
  }

  public Integer getBasicSalaryPerDay() {
    return basicSalaryPerDay;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getSalaryBand() {
    return salaryBand;
  }

  public void setSalaryBand(String salaryBand) {
    this.salaryBand = salaryBand;
  }
}
