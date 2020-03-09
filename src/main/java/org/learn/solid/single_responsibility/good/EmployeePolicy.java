package org.learn.solid.single_responsibility.good;

public class EmployeePolicy {

  private static Integer basicSalaryPerDayB1 = 1000;


  public double calculatePay(int daysWorked,String region,String salaryBand){
    double pay = 0.0;
    if(region.equals("IMEA") && salaryBand.equals("B1")) {
      pay =  daysWorked * basicSalaryPerDayB1;
    }
    return pay;
  }

}
