import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int total = 0;

  int attendance = 0; 

  for (int i = 0; i < 8; i++){
    System.out.println("how many fans attended game "+ (i + 1) + "?");
    attendance = scan.nextInt();
    total = total + attendance;
  }

  double average = total/8;

  int averageRounded = (int) Math.round(average);

   System.out.println("The Average cricket attendance is " +averageRounded+ " this year.");
  
  }
}
