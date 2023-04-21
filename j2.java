import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quiz:");
        int quiz = scan.nextInt();

        System.out.println("Midterm Exam:");
        int Exam = scan.nextInt();

        System.out.println("Final score:");
        int Final = scan.nextInt();

        int avg = (quiz + Exam + Final) / 3;

        if (avg >= 90) {
            System.out.print("Your Grade is A\n");
        } else if (avg >= 70 && avg < 90) {
            System.out.print("Your Grade is B\n");
        } else if (avg >= 50 && avg < 70) {
            System.out.print("Your Grade is C\n");
        } else if (avg < 50) {
            System.out.print("Your Grade is D\n");
        }

    }
}
