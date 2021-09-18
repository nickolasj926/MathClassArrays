import java.util.Arrays;

public class Classroom {
  
  public static void main(String[] args){
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    double[] mathScores = {94.5, 67.9, 76.8, 87.9};

    System.out.println("The number of students in the class is " + students.length + ".");
    System.out.println(students[3] + " got an " + mathScores[3] + " on their paper.");
  }
}
