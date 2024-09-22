import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main{
    public static void main(String args[]){
        Queue<String> x = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("Queue Elements: " + x);
			System.out.println("Selections:");  
			System.out.println("1 --- Offer");
			System.out.println("2 --- Peek");
			System.out.println("3 --- Poll");
			System.out.print("  > ");
			int selection = scan.nextInt();
		
			if(selection == 1) {
				System.out.print("Enter element to offer/add: ");
				String input = scan2.nextLine();
				x.offer(input);
			} else if(selection == 2) {
				System.out.println("The element at front is "+ x.peek());
			} else if(selection == 3) {
				System.out.println("Removed element " + x.poll());
			}
		}
    }
}