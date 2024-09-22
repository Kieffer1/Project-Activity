import java.util.Scanner;

class Exam{
  String subject;
  int totalMarks;
  int obtainedMarks;
    Exam( String subject, int totalMarks, int obtainedMarks){
    this.subject = subject;
    this.totalMarks = totalMarks;
    this.obtainedMarks = obtainedMarks;
    }

public void setObtainedMarks(){
    if(obtainedMarks >= 0 && obtainedMarks <= totalMarks){
        this.obtainedMarks = obtainedMarks;
    }
    else{
        System.out.println("Invalid Obtained Marks, Marks should be between 0 and 50");
    }
}

public void displayExamDetails(){
    System.out.println("Exam Details: ");
    System.out.println("Subject name: " + this.subject);
    System.out.println("Total Marks: " + this.totalMarks);
    System.out.println("Obtained Marks: " + this.obtainedMarks);
}
public void displayResult(){
    System.out.println("Results: ");

    double a = this.obtainedMarks;
    double b = this.totalMarks;
    double result = ((a/b)*100);

    if(result >= 40){
        System.out.println("Result: Pass");
        System.out.println("Percentage: " + result +"%");

    }else if(result <= 39){
        System.out.println("Result: Fail");
        System.out.println("Percentage: " + result +"%");
    }
    }

public static void main(String []args){
String subject;
int totalMarks;
int obtainedMarks;
Scanner scans = new Scanner(System.in);

System.out.print("Enter Subject for the Exam: ");
subject = scans.nextLine();
System.out.print("Enter Total Marks for the Exam: ");
totalMarks = scans.nextInt();
System.out.print("Enter Obtained Marks for the Exam: ");
obtainedMarks = scans.nextInt();

Exam deets = new Exam(subject, totalMarks, obtainedMarks);
deets.displayExamDetails();
deets.displayResult();
}
}

public class Main{
}