package org.java.dataStructure;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(findNonRepeating("aaccdbb"));
        String s = "aaccdbb";
        for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if (s.indexOf(c) == s.lastIndexOf(c)) {
               System.out.println(c);
               break;
           } else {
               System.out.println("No");
           }
        }

        String ss = "AABAAACCAADCC";

        Map<String, Integer> result = new HashMap<>();
        String temp = "";
        for (int i = 0; i < ss.length(); i++) {
            temp = temp + ss.charAt(i);
            if (i == ss.length() -1 || ss.charAt(i) != ss.charAt(i + 1)) {

                result.put(temp, result.getOrDefault(temp, 0) + 1);
                temp = "";
            }
        }

//        select name, department,  sum(salary) as totalEarning from employee group by name

        for (Map.Entry<String, Integer> entry: result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static int findNonRepeating (String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isRepeating = false;
            for (int j = 0; j < s.length(); j++) {
                char eachChar = s.charAt(j);
                if (i != j && c == eachChar) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating)
                return i;
        }
        return -1;
    }
}
