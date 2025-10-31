package AbstructionConcept;

public interface Car {

    //only final and static vars:

    int wheels =4;
    // Always define abstract methods
    // no method body
    // only method declaration
    // we achine 100% abstraction
    // canot create the object of interface

    public void start();
    public void stop();
    public void refuel();
}


