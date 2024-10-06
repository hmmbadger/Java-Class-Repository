import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int grade1, grade2, grade3;
        double average;

        System.out.println("Enter grade1");
        grade1= scan.nextInt();

        System.out.println("Enter grade2");
        grade2= scan.nextInt();

        System.out.println("Enter grade3");
        grade3= scan.nextInt();

        average = (grade1+grade2+grade3)/3;
        System.out.println("your average is  "+ average);

        if (average <75) {
            System.out.println("HAHAHAHA angas ng grades ya");
        } else {
            System.out.println("Congrats bossing, pasado ka");
        }
    }
}