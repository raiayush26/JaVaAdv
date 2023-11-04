//https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/

import java.util.PriorityQueue;

public class MinimumCost {
    public static long minCost(long arr[], int n) 
    {
        // your code here
         // your code here
        PriorityQueue<Long> pq = new PriorityQueue<>();

    for (int i = 0; i < n; i++) {
        pq.add(arr[i]);
    }
    long cost = 0;
    while (pq.size() > 1) {
        long min = pq.remove();
        long min2 = pq.remove();
        cost += min + min2;
        pq.add(min + min2);
    }
    return cost;
    }
    public static void main(String[] args) {
        long [] arr ={4 ,3, 2 ,6};
        int n=4;
        System.out.println(minCost(arr, n));

    }
    
}
