# Open/Closed Principle

**Software entities should be open for extension, but closed for modification**

 Strategy Pattern is a good demonstration of the open/closed principle. 
 
 * Bad example
    * Any time we want to add a new style of greeting, we have to change the `Greeter` class to accept a new type of personality. 
    * We have to modify our existing, working code to add something new. 
     
 * Good example
    * We have a high-level `Greeter` class that is instantiated with some Personality... we don't know which yet,
 just that it will be some object that implements the `Personality` interface. 
    * Now we can add new objects like `FormalPersonality`, `CasualPersonality`, and `IntimatePersonality`, and just make sure they 
 correctly implement the `Personality` interface (in this case that means they must have a `greet()` method).
    * The `Greeter` class is now open for future extension, while remaining closed for modification.