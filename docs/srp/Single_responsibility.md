# Single Responsibility Principle

**Every class should have a single responsibility. There should never be more than one reason for a class to change.**

* Each responsibility should be separated to its own class, because each responsibility is an axis of change. Change to one responsibility may break others in the same class.
* Following the SRP leads to small, highly focused, cohesive classes, which each do only one thing. Each of them will be easy understand and change.
* Separate the code that different actors depend on
* The word “cohesive” implies the SRP. Cohesion is the force that binds together the code responsible to a single actor
* Refer [SRP](http://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html)

### Bad example
Consider the class `Employee`. 
* This class violates the SRP because those three methods are responsible to three very different actors.
* Responsibility is a family of function that serves one particular actor
* When the needs of that actor change, it becomes the source of change for that family of functions
* The actor for that change becomes a single source of change for that responsibiliy 
* There are three actors : Policy, Architecture , Operations
* All the actors using the same modules are coupled
* When a change to the module due to one responsiblity changes the behaviour of the other responsibility, it introduces **fragility**

#### Good example
The divergent responsibilities of the `Employee` class has been moved into different classes with clear segregation
* `EmployeeGateway` class is responsible for the persistence of the data
* `EmployeePolicy` class is responsible for setting the policies across employees
* `EmployeeReports` is responsible for generating formatted data for reporting purposes