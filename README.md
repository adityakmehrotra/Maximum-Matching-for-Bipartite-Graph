# Maximum-Matching-for-Bipartite-Graph
This Java project implements an algorithm to find the maximum matching in a bipartite graph and determines whether the matching is perfect (all nodes are matched). The algorithm is optimized for both time and space efficiency.

## Project Overview

The algorithm takes multiple sets of bipartite graphs as input and outputs the size of the maximum matching for each set, along with a flag indicating whether the matching is perfect.

### Problem Description

Each input instance describes a bipartite graph with two sets of nodes (A and B) and edges connecting nodes across these sets.

#### Input Format

- First line: An integer `N`, the number of graph instances.
- For each instance:
  - First line: Three integers `m`, `n`, `q` representing the number of nodes in sets A and B, and the number of edges, respectively.
  - Next `q` lines: Each line contains two integers `i` and `j` which denotes an edge from node `i` in set A to node `j` in set B.

#### Sample Input
  ```markdown
  3
  2 2 4
  1 1
  1 2
  2 1
  2 2
  2 3 4
  2 3
  2 1
  1 2
  2 2
  5 5 10
  1 1
  1 3
  2 1
  2 2
  2 3
  2 4
  3 4
  4 4
  5 4
  5 5
  ```

#### Output Format
For each instance, output the size of the maximum matching followed by `Y` if the matching is perfect and `N` otherwise.

#### Sample Output
  ```markdown
  2 Y
  2 N
  4 N
  ```


### Time Complexity

The implemented algorithm runs in `O(n * E)` time, where `n` is the number of nodes and `E` is the number of edges.

## Getting Started

### Prerequisites

- Java JDK 8 or later.

### Setup and Execution

#### Running Locally

1. **Clone the Repository:**
  ``` markdown
  git clone https://github.com/your-username/Maximum-Matching-for-Bipartite-Graph.git
  cd Maximum-Matching-for-Bipartite-Graph
  ```

2. **Compile the Code:**
  ```markdown
  javac matching.java
  ```

3. **Run the Program:**
  ```markdown
  java matching
  ```

You can then input the number of instances and each graph's details as specified in the input format.

#### Using Makefile

If a `Makefile` is provided, simply run:
  ```markdown
  make
  ```

This command compiles and runs the `matching.java` file.

## Contributing

Contributions to this project are welcome. To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

### Last Updated
04/13/2024
