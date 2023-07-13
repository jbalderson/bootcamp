package com.tn.qa.pages;

public class ShortestPath {

	public static void main(String[] args) {
		  int[][] graph = {
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
	        int source = 0;
	        int destination = 4;

	        int[] shortestDistances = dijkstra(graph, source);
	        int shortestDistance = shortestDistances[destination];

	        System.out.println("Shortest distance from node " + source + " to node " + destination + ": " + shortestDistance);
	}
	    
	        public static int[] dijkstra(int[][] graph, int source) {
	            int vertices = graph.length;
	            int[] distances = new int[vertices];
	            Arrays.fill(distances, Integer.MAX_VALUE);
	            distances[source] = 0;

	            boolean[] visited = new boolean[vertices];

	            for (int count = 0; count < vertices - 1; count++) {
	                int minDistanceVertex = findMinDistanceVertex(distances, visited);
	                visited[minDistanceVertex] = true;

	                for (int v = 0; v < vertices; v++) {
	                    if (!visited[v] && graph[minDistanceVertex][v] != 0 && distances[minDistanceVertex] != Integer.MAX_VALUE
	                            && distances[minDistanceVertex] + graph[minDistanceVertex][v] < distances[v]) {
	                        distances[v] = distances[minDistanceVertex] + graph[minDistanceVertex][v];
	                    }
	                }
	            }

	            return distances;
	        }

	        public static int findMinDistanceVertex(int[] distances, boolean[] visited) {
	            int minDistance = Integer.MAX_VALUE;
	            int minDistanceVertex = -1;

	            for (int v = 0; v < distances.length; v++) {
	                if (!visited[v] && distances[v] < minDistance) {
	                    minDistance = distances[v];
	                    minDistanceVertex = v;
	                }
	            }

	            return minDistanceVertex;
	            		
	        }
	    
	


	}


