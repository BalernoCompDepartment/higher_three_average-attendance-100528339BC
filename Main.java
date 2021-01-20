import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int total;

  int attendance; 

  for (i = 0; i<8;i++){
    system.out.println("how many fans attended game "+ (i + 1) + "?");
    attendance = scan.next();
    total = total + attendance;
  }

  double average = total/8

  int averageRounded = (int) Math.round(average);

   system.out.println("The Average cricket attendance is " +averageRounded+ " this year.")
  
  }
}
