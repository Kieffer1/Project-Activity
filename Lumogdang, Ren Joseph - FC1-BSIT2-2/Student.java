import java.util.Scanner;

class Student{
  String fName;
  String lName;
  int year;
  String course;
  double midterm;
  double finalGrades;

  Student( String fName,String lName, int year,String course, double midterm,double finalGrades){
    this.fName = fName;
    this.lName = lName;
    this.year = year;
    this.course = course;
    this.midterm = midterm;
    this.finalGrades = finalGrades;
  }

  public void introduceSelf(){
    System.out.println("* Introducing *");
    System.out.println("Full name: " + this.fName + " " + this.lName);
    System.out.println("Year: " + this.year);
    System.out.println("Course: " + this.course);
  }

  public void evaluateGrade(){
    double ave = (this.midterm+this.finalGrades)/2;

    System.out.println("* Evaluate *");
    System.out.println("Full name: " + this.fName + " " + this.lName);
    System.out.println("Average: "+ave);

    if(ave<75){
      System.out.println("Standing: Failed");
    }
    else if(ave >=75 || ave<=89.99){
        System.out.println("Passed");
    }
    else if(ave >=90 || ave<=94.99){
        System.out.println("With Honors");
    }
    else if(ave >=95 || ave<=97.99){
        System.out.println("With High Honors");
    }
    else if(ave >=98 || ave<=100){
      System.out.println("Standing: With Highest Honors");
    }
    else{
        System.out.println("Invalid Grade");
    }
  }

}

public class Mains{
      public static void main(String args[]){
        String fName;
        String lName;
        int year;
        String course;
        double midterm;
        double finalGrades;
        Scanner scans = new Scanner(System.in);

       
        System.out.print("First  name: ");
        fName = scans.nextLine();
        System.out.print("Last  name: ");
        lName = scans.nextLine();
        System.out.print("Course: ");
        course = scans.nextLine();
        System.out.print("Year: ");
        year = scans.nextInt();
        System.out.print("Midterm Grades: ");
        midterm = scans.nextDouble();
        System.out.print("Final Grade: ");
        finalGrades = scans.nextDouble();

        Student deets = new Student(fName, lName, year, course, midterm, finalGrades);
        deets.introduceSelf();
        deets.evaluateGrade();
}
}