package org.learn.solid.single_responsibility.good;

public class Employee {
  private int id;
  private String name;
  private Integer daysWorked;

  private String region;
  private String salaryBand;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getDaysWorked() {
    return daysWorked;
  }

  public void setDaysWorked(Integer daysWorked) {
    this.daysWorked = daysWorked;
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

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", daysWorked=" + daysWorked +
        ", region='" + region + '\'' +
        ", salaryBand='" + salaryBand + '\'' +
        '}';
  }
}
