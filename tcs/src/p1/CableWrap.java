import java.util.Scanner;
package p1;

public class CableWrap  {

	    public static int solve(int N, int M, String[][] grid) {
	        int count = 0;
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                if ("C".equals(grid[i][j])) count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int M = scanner.nextInt();
	        scanner.nextLine();

	        String[][] grid = new String[N][M];
	        for (int i = 0; i < N; i++) {
	            String line = scanner.nextLine().trim();
	            String[] parts = line.split(" ");
	            if (parts.length == M) {
	                System.arraycopy(parts, 0, grid[i], 0, M);
	            } else {
	                for (int j = 0; j < M && j < line.length(); j++) {
	                    grid[i][j] = String.valueOf(line.charAt(j));
	                }
	            }
	        }

	        System.out.println(solve(N, M, grid));
	        scanner.close();
	    }
	}


