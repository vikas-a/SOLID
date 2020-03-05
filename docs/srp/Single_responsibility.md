# Single Responsibility Principle

**Every class should have a single responsibility. There should never be more than one reason for a class to change.**

* Each responsibility should be separated to its own class, because each responsibility is an axis of change. Change to one responsibility may break others in the same class.
* Following the SRP leads to small, highly focused, cohesive classes, which each do only one thing. Each of them will be easy understand and change.

* Bad Example : 
  This example is derived from  Tic Tac Toe game. The bad example provides a generic Board class that does board-related things
    *  It stores the values of spots on the board, returns the board's rows, and prints the board out to the screen. 
    *  On the surface, everything seems legitimately related to a real-world Board object, but the Single Responsibility Principle tells us that this class is actually handling far too many responsibilities.

* Good Example

    Consider the Board class in the "good" example. The only thing it is responsible for is knowing the values of its spots. 
    * It is entirely unconcerned with how those spots are being manipulated per the rules of Tic Tac Toe (rows, columns, diagonals) 
or displayed to the user (in a console, on the web, etc.). 
    * The `BoardShaper` and `BoardPresenter` classes are similarly focused on specific tasks.
    * They are also only passed attributes they need; for example, `BoardShaper` objects are initialized with only a size (they don't need the whole board).