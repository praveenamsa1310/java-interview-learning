package org.java.collection;
import java.util.*;
public class Jamescode2 
{
    public static void main(String[] args)
    {
        int t = 2;
        while(t-- > 0)
        {
            Scanner obj = new Scanner(System.in);
            String value = obj.nextLine();
            int noOfneighbours = Integer.parseInt(value);
            String natureOfNeighbours = obj.nextLine();
            int callToNeighbour = natureOfNeighbours.indexOf("nnc")+3;
            List<Character> chars = new ArrayList<>();
            
            for(int i = 0; i < natureOfNeighbours.length(); i++)
            {
                chars.add(natureOfNeighbours.charAt(i));
            }
            Map<Integer, String>  outputmap = new HashMap<Integer, String>();
            outputmap = rightExtracted(noOfneighbours, callToNeighbour-1, callToNeighbour-2, chars, outputmap);
            Map<Integer, String>  leftOutputMap = new HashMap<Integer, String>();
            leftOutputMap = leftExtracted(noOfneighbours, callToNeighbour-2, callToNeighbour-3, chars, leftOutputMap);
            leftOutputMap.putAll(outputmap);
            
            Map<Integer, String> sortedMap = new TreeMap<Integer, String>(leftOutputMap);
           // Map<Integer, String> sortedMap2 = new TreeMap<Integer, String>(righ);
            String output = "";
            for(int i = 0; i < noOfneighbours; i++)
            {
                if(sortedMap.containsKey(i))
                {
                    output = output + sortedMap.get(i);
                }
                else
                {
                    output = output + "U";
                }
            }
            System.out.println(output);
           // obj.close();
        }
    }
    private static Map<Integer, String> leftExtracted(int noOfneighbours, int callToNeighbour, int count, List<Character> chars, Map<Integer, String> outputMap)
    {
        outputMap.put(callToNeighbour, "I");
        for(int i = callToNeighbour-1; i >=count; i--)
        {
            if(chars.get(i) == 'c')
            {
                if(i+2 <= 0 )
                {
                    count = i - 2;
                    leftExtracted(noOfneighbours, i, count, chars, outputMap);
                }
                else{ break;}
            }
            else if(chars.get(i) == 'n')
            {
                leftExtracted(noOfneighbours, i, count, chars, outputMap);
            }
        }
        return outputMap;
    }
    private static Map<Integer, String> rightExtracted(int noOfneighbours, int callToNeighbour, int count, List<Character> chars, Map<Integer, String> outputMap)
    {
        outputMap.put(callToNeighbour, "I");
        for(int i = callToNeighbour + 1; i <= count; i++)
        {
            outputMap.put(i, "I");
            if(chars.get(i) == 'c')
            {
                if(i+2 <= noOfneighbours )
                {
                    count = i + 2;
                    rightExtracted(noOfneighbours, i, count, chars, outputMap);
                }
                else{ break;}
            }
            else if(chars.get(i) == 'n')
            {
                rightExtracted(noOfneighbours, i, count, chars, outputMap);
            }
        }
        return outputMap;
    }
}




