import java.util.Scanner;

/*
Rewrite the student mark sheet programme using if else and while loop. (Week-7 Homework)
 */
public class Programme_2_Marksheet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Student Name\t \t: \t"); //input wizard
        String name = scan.next();
        System.out.println("Enter Student Roll No: ");
        int rollNum = scan.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t"); //input wizard
        int mathMarks = scan.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.println("\nInvalid Input, Mark should be between 0 to 100");
            mathMarks = scan.nextInt();
        }
        System.out.println("Enter Marks of Subject Science \t:\t"); //input wizard
        int sciMarks = scan.nextInt();
        while (sciMarks < 0 || sciMarks > 100) {
            System.out.println("\nInvalid Input, Mark should be between 0 to 100");
            sciMarks = scan.nextInt();
        }
        System.out.println("Enter Marks of Subject English \t:\t"); //input wizard
        int engMarks = scan.nextInt();
        while (engMarks < 0 || engMarks > 100) {
            System.out.println("\nInvalid Input, Mark should be between 0 to 100");
            engMarks = scan.nextInt();
        }
        int total = sum(mathMarks, sciMarks, engMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, sciMarks, engMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, sciMarks, engMarks, total, percentage, result, grade);
        //closing the scanner object
        scan.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Calculating the results on subjects marks
    public static String calculateResult(int mathMarks, int sciMarks, int engMarks) {
        if (mathMarks < 35 || sciMarks < 35 || engMarks < 35) {
            return "FAIL";
        } else
            return "PASS";
    }

    //Calculating the grade on percentage and results
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("PASS")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = " - ";
        }
        return grade;
    }

    //printing the Mark Sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathMarks, int sciMarks, int engMarks, double total, double percentage, String result, String grade) {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|                    MARK SHEET                 |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| Name:       " + name + "                      |");
        System.out.println("| Roll No:    " + rollNum + "                   |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| Subject:       Marks                          |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| Maths:      " + mathMarks + "                 |");
        System.out.println("| Science:    " + sciMarks + "                  |");
        System.out.println("| English:    " + engMarks + "                  |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| Total:      " + total + "                     |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|Percentage:  " + percentage + "                |");
        System.out.println("|Result:      " + result + "                    |");
        System.out.println("|Grade:       " + grade + "                     |");
        System.out.println("|-----------------------------------------------|");
    }
}