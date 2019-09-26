import java.io.*;
import java.util.*;

public class SumOfTwo {
	private StreamTokenizer scanner;
	private PrintWriter printer;

	public static void main(String[] args) throws IOException {
		new SumOfTwo().run();
	}

	private int nextInt() throws IOException {
		scanner.nextToken();
		return (int)scanner.nval;
	}

	public void run() throws IOException {
		scanner = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		printer = new PrintWriter(new OutputStreamWriter(System.out));
		solve();
		System.out.flush();
	}

	private void solve() throws IOException {
		System.out.print("First number: ");
		int firstNumber = nextInt();

		System.out.print("Second number: ");
		int secondNumber = nextInt();

		int result = firstNumber + secondNumber;
		System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, result);
	}
}
