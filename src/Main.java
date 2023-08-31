import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println(eligible(age));


    }
  static String eligible(int age)
    {
        if (age>=18)
        {
            return "Eligible For Voting";
        }
        else
        {
            return "Not Eligible For Voting";
        }
    }
}