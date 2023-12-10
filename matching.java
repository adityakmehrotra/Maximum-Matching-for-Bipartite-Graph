import java.util.*;

public class matching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInstances = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInstances; i++) {
            int numNodesM = scanner.nextInt();
            int numNodesN = scanner.nextInt();
            int numEdges = scanner.nextInt();
            boolean graph[][] = new boolean[numNodesM][numNodesN];

            for (int j = 0; j < numEdges; j++) {
                int firstNode = scanner.nextInt();
                int secondNode = scanner.nextInt();
                graph[firstNode - 1][secondNode - 1] = true;
            }

            int amount = maximumBPM(graph);
            String match = "N";
            if (amount == Math.max(numNodesM, numNodesN)) {
                match = "Y";
            }

            System.out.println(amount + " " + match);

            if (i < numInstances - 1) {
                scanner.nextLine();
            }
        }
    }

    public static int maximumBPM(boolean graph[][]) {
        int[] match = new int[graph[0].length];
        int result = 0;

        for (int i = 0; i < graph[0].length; i++) {
            match[i] = -1;
        }

        for (int i = 0; i < graph.length; i++) {
            boolean seen[] = new boolean[graph[0].length];
            for (int j = 0; j < graph[0].length; j++) {
                seen[j] = false;
            }
            if (bpm(graph, i, seen, match) == true) {
                result += 1;
            }
        }
        return result;
    }

    public static boolean bpm(boolean[][] graph, int i, boolean[] seen, int[] match) {
        for (int x = 0; x < graph[0].length; x++) {
            if ((graph[i][x] == true) && (!(seen[x]))) {
                seen[x] = true;
                if ((match[x] < 0) || (bpm(graph, match[x], seen, match))) {
                    match[x] = i;
                    return true;
                }
            }
        }
        return false;
    }
}