package GradeBook;

public class GradeBook {
    public static void main(String[] args) {
        double[] grade = {90,87,88,80,30};
        double totalSum =0;
        for (double value : grade) {
            System.out.println(value);
        }
        for (double v : grade) {
            totalSum += v;
        }
        double average;
        average = totalSum/grade.length;
        System.out.println("Your average grade is: " + average);
        if (average>90) {
            System.out.println("your grade is A");
        }else if (average >80) {
            System.out.println("your grade is B");
        }else{
            System.out.println("you got C");
        }
    }
}
