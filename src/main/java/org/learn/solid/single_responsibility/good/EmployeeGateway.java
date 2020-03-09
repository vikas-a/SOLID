package org.learn.solid.single_responsibility.good;

import java.util.UUID;

public class EmployeeGateway {

  public void save(Employee employee){
    System.out.print("Employee: "+employee.getName()+" Saved");
  }

}
