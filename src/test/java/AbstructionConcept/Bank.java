package AbstructionConcept;

public abstract class Bank {

    int amt= 100;
    final int rate=10;
    static int loanRate = 5;

    //partial abstraction
    //hiding the implementation logic -- is called Abstraction
    // Abs class can have abs methods and non abs methods
    // canot create the object of interface

    public abstract void loan(); //abstract method -- no method body

    //non abstract methods
    public void credit(){
        System.out.println("Bank-- Credit");

    }

    public void debit(){
        System.out.println("Bank-- Debit");
    }


}
