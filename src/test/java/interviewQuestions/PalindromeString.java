package interviewQuestions;

import java.util.Scanner;

public class PalindromeString {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check : ");

        String input = scanner.nextLine();

        boolean isPlindrome = checkPalindrome(input);

        if (isPlindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + "is not a palindrome.");
        }

        scanner.close();

    }

        public static boolean checkPalindrome(String s) {

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }

                left++;
                right--;

            }
            return true;



        }

    }



