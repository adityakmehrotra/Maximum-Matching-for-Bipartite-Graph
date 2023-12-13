# Maximum-Matching-for-Bipartite-Graph
Implementation of an algorithm to determine the maximum matching in a bipartite graph and if that matching is perfect (all nodes are matched).

## Optimal Algorithm for determining the Maximum Matching in a Bipartite Graph

### Problem Description
The input will start with an positive integer, giving the number of instances that follow. For each instance, there will be 3 positive integers m, n, and q. Numbers m and n are the number of nodes in node set A and node set B. Number q is the number of edges in the bipartite graph. For each edge, there will be 2 more positive integers i, and j representing an edge between node 1 ≤ i ≤ m in A and node 1 ≤ j ≤ n in B.

### Sample Input
3<br>
2 2 4<br>
1 1<br>
1 2<br>
2 1<br>
2 2<br>
2 3 4<br>
2 3<br>
2 1<br>
1 2<br>
2 2<br>
5 5 10<br>
1 1<br>
1 3<br>
2 1<br>
2 2<br>
2 3<br>
2 4<br>
3 4<br>
4 4<br>
5 4<br>
5 5

### Sample Output
2 Y<br>
2 N<br>
4 N

### Problem Input and Output Description
The sample input has 3 instances.
For each instance, your program should output the size of the maximum matching, followed by a space, followed by an N if the matching is not perfect and a Y if the matching is perfect. Each output line should be terminated by a newline.

### Time Complexity
The time complexity of the optimal algorithm for determining the maximum matching in a bipartite graph is **O(n * E)**, where n is the number of nodes and E is the number of edges.

### Run the Code
- Downloard the required files:
  - `matching.java`: Java file with the algorithm that determines the maximum matching in a bipartite graph optimally in terms of time and space.
  - `Makefile`: Makefile to build the Java file (`matching.java`) through the compiler and run the algorithm in the Java file (`matching.java`).
- You can run the `matching.java` file through your IDE/Console.
- You can use the `Makefile` to build the Java file (`matching.java`) through the compiler and run the algorithm in the Java file (`matching.java`).
