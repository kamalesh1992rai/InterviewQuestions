package interviewQuestions;

public class MissingNumber {

    public static void main(String[] args){

        int[] a ={2,3,5,6,7,8,9,10};

        int sum = 0;

        for ( int i=0; i<a.length; i++){
            sum = sum + a[i]; //12
        }
        System.out.println(sum);

        int sum1 = 0;
        for (int j=1; j<=10; j++){
            sum1 = sum1 + j; //15
        }

        System.out.println(sum1);

        System.out.println("Missing number is :" +(sum1-sum));



    }
}
