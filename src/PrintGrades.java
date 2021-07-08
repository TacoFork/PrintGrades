import java.util.Scanner;
public class PrintGrades {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String control = "";
        while (!control.equals("n")){
            System.out.print("Enter an exam score: ");
            int score = keyboard.nextInt();
            if (score >= 97){
                System.out.println("The grade is: A+");
            }
            else if (score >= 94){
                System.out.println("The grade is: A");
            }
            else if (score >= 90){
                System.out.println("The grade is: A-");
            }
            else if (score >= 87){
                System.out.println("The grade is: B+");
            }
            else if (score >= 84){
                System.out.println("The grade is: B");
            }
            else if (score >= 80){
                System.out.println("The grade is: B-");
            }
            else if (score >= 77){
                System.out.println("The grade is: C+");
            }
            else if (score >= 74){
                System.out.println("The grade is: C");
            }
            else if (score >= 70){
                System.out.println("The grade is: C-");
            }
            else if (score >= 60){
                System.out.println("The grade is: D");
            }
            else{
                System.out.println("Go back to school!");
            }
            System.out.print("Do you want to enter another score (y/n)?: ");
            control = keyboard.next().toLowerCase();
        }
    }
}
