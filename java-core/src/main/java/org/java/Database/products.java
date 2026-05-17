package org.java.Database;
import java.util.*;
public class products
{
	public static int[] kMostFrequent(int[] nums, int k) {
 
      //Map which stores number and it's occurrence count
      Map<Integer, Integer> countMap = new HashMap<>();
 
      //Variable which stores maximum frequency of any number
      int maxFreq = 0;
 
      //Traverse an array
      for(int i = 0; i < nums.length; i++) {
       
         //Get the occurrence of current element and add 1
        int freq = countMap.getOrDefault(nums[i],0)+1;         
 
        //put the elem and it's freq in a map 
        countMap.put(nums[i], freq);  
          
        //keep track of maximum occurrence
        maxFreq = Math.max(maxFreq, freq);            
      }
 
      //Declare a bucket, which store multiple values
      List<Integer>[] bucket = new ArrayList[maxFreq + 1];
 
      for(int n : countMap.keySet()) {
          int freq = countMap.get(n);
 
          if(bucket[freq]==null)
              bucket[freq] = new ArrayList<>();
 
              bucket[freq].add(n);
       }
 
       int[] resultArr = new int[k];
       int count = 0;
 
       //Pick top k elements
       for(int i = bucket.length-1; i >= 0; i--) {
           if(bucket[i]!=null){
               for (int n : bucket[i]) {
                   resultArr[count++] = n;
 
                  if (count == k)  
                        return resultArr;
         }
      }
 }
       return resultArr;
   }
 
  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int row = in.nextInt();
       int col = in.nextInt();
       int temp = 0;
//       int arr[] = new int[row*col];
//       for(int i = 0; i<row; i++)
//       {
//          for(int j = 0; j<col; j++)
//            {
//                arr[temp] = in.nextInt();
//                temp++;
//            } 
//       }
       int arr[] = {5,1,6,7,7,5,1,6,9,8,4,10};
       int k = in.nextInt();
       int[] result = kMostFrequent(arr, k);
 
       for(int elem : result) {
         System.out.print(elem + " ");
       }
  }
}
