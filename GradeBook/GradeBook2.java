package GradeBook;

import java.util.Scanner;

public class GradeBook2 {
    public static void printgrades(double[] grade) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
    }
    public static double averageGrade(double[] grade){
        double sum=0;
        for (double v : grade) {
            sum += v;
        }
        return sum/grade.length;
    }
    static void gradevalue(double avv) {
        if (avv > 90) {
            System.out.println("your grade is A");
        } else if (avv > 80) {
            System.out.println("your grade is B");
        } else {
            System.out.println("you got C");
        }
    }

    public static void main(String[] args) {
        double[] grades;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of grades: ");
        int num = sc.nextInt();
        grades = new double[num];

        for (int i=0;i<num;i++){
            System.out.print("grade: ");
            grades[i] = sc.nextDouble();

        }




        printgrades(grades);
        double average = averageGrade(grades);
        System.out.println("Your average is "+ average);
        gradevalue(average);





    }
//    double[] grades;
//        if (args.length == 0) return;
//    grades = new double[args.length];
//        for (int i=0; i <args.length;i++) {
//        grades[i] = Double.parseDouble(args[i]);
//    }
//    printgrades(grades);
//    double average = averageGrade(grades);
//        System.out.println("your average mark is " + average);
//}
}
