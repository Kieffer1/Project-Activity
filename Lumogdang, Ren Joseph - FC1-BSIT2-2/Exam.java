class Exam{
  String subject;
  int totalMarks;
  int obtainedMarks;

  Exam( String subject, int totalMarks){
    this.subject = subject;
    this.totalMarks = totalMarks;
    this.obtainedMarks = 0;
  }

  public void displayExamDetails(){
    System.out.println("Exam Details: ");
    System.out.println("Subject name: " + this.subject);
    System.out.println("Total Marks: " + this.totalMarks);
    System.out.println("Obtained Marks: " + this.obtainedMarks);
}

  public void displayResult(){
    double result = (this.obtainedMarks+this.totalMarks)/2;

    System.out.println("Results: ");
    if(result<=40){
      System.out.println("Result: Pass");
    }
    else if(result>=40){
      System.out.println("Result: Fail");
    
    System.out.println("Percentage: "+ result);
    }
    Exam deets = new Exam(subject, totalMarks, obtainedMarks);
    deets.displayExamDetails();
    deets.displayResult();
  }
}
