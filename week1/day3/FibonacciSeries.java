package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;  // Number of Fibonacci numbers to generate
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " numbers:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Update the numbers
            int next = first + second;
            first = second;
            second = next;
	}

}
}