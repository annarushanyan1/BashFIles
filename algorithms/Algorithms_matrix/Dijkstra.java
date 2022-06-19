public class Dijkstra {
  static int V = 9;

  int mindistanceListance(int distanceList[], boolean visitedList[]) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int v = 0; v < V; v++) {
      if (visitedList[v] == false && distanceList[v] <= min) {
        System.out.println("min = " + distanceList[v]);

        min = distanceList[v];
        minIndex = v;
      }
    }
    return minIndex;
  }

  void print(int distanceList[]) {
   System.out.println("Vertex \t\t distanceListance from Source");
    for (int i = 0; i < V; i++) {
     System.out.println(i + " \t\t\t\t " +
        distanceList[i]);
    }
  }

  void dijkstra(int arr[][], int x) {
    int distanceList[] = new int[V];
    boolean visitedList[] = new boolean[V];

    for (int i = 0; i < V; i++) {
      distanceList[i] = Integer.MAX_VALUE;
      visitedList[i] = false;
    }
    distanceList[x] = 0;
    for (int count = 0; count < V - 1; count++) {
      int u = mindistanceListance(distanceList, visitedList);
      visitedList[u] = true;
      System.out.println("u = " + u);
      for (int v = 0; v < V; v++) {
        if (!visitedList[v] && arr[u][v] != 0 &&
          distanceList[u] != Integer.MAX_VALUE &&
          distanceList[u] + arr[u][v] < distanceList[v]) {
          distanceList[v] = distanceList[u] + arr[u][v];
        }
      }
    }
    print(distanceList);
  }

  public static void main(String args[]) {

    int graph[][] = {
              {0, 4, 0, 0, 0, 0, 0, 8, 0},
              {4, 0, 8, 0, 0, 0, 0, 11, 0},
              {0, 8, 0, 7, 0, 4, 0, 0, 2},
              {0, 0, 7, 0, 9, 14, 0, 0, 0},
              {0, 0, 0, 9, 0, 10, 0, 0, 0},
              {0, 0, 4, 14, 10, 0, 2, 0, 0},
              {0, 0, 0, 0, 0, 2, 0, 1, 6},
              {8, 11, 0, 0, 0, 0, 1, 0, 7},
              {0, 0, 2, 0, 0, 0, 6, 7, 0}
            };
    Dijkstra instance = new Dijkstra();
    instance.dijkstra(graph, 0);
  }
}
