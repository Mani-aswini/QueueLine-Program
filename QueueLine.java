import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine(); // consume newline
		Queue q = new LinkedList();
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine();
			if(line.startsWith("ENQUEUE")) {
				String name = line.split(" ")[1];
				q.add(name);
			} else {
				if(!q.isEmpty()) {
						q.poll();
				}
			}
		}
		if(q.isEmpty()) {
				System.out.println("EMPTY");
		}
		for (Object x: q) {
				System.out.print(x + " ");
		}
	}
}
