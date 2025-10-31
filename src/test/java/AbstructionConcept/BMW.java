package AbstructionConcept;

public class BMW implements Car{

    public void start(){
        System.out.println("BMW---start");
    }

    public void stop() {
        System.out.println("BMW--stop");
    }

    public void refuel(){
        System.out.println("BMW--refuel");
    }

    // non overriden methods:

    public void theSofety(){
        System.out.println("BMW--theftsafety");
    }



}
