package interviewQuestions;

public class RemoveJunk {

    public static void main(String[] args) {

        String s="卡姆萊什 latin string 0123456789";

        String s1="卡姆萊什@#  @#卡姆萊什 testing #@卡姆萊什 Selenium $$卡姆萊什 java";

        //Regular Expression: [^a-zA-Z0-9]

        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

        s1=s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}

