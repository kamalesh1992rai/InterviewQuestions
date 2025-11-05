package RahulShettyAcademy;

public class MethodDemo {

    public static void main(String[] args){

        MethodDemo d = new MethodDemo();
        String name =d.getData();
        System.out.println(name);

        MethodDemo2 d1 = new MethodDemo2();
        d1.getUserData();
        getData2();


    }

    public  String getData(){

        System.out.println("helo world");
        return "rahul shetty";

    }

    public  static String getData2(){

        System.out.println("helo world");
        return "rahul shetty";

    }
}
