package org.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

    public static void main(String[] args) {
        String name = "praveen";

        Pattern namePattern = Pattern.compile("ee",  Pattern.CASE_INSENSITIVE);
        Matcher matcher = namePattern.matcher(name);
        if(matcher.find()){
            System.out.println(matcher.group());
        }

        if (name.matches("[abc]")) {
            System.out.println(name);
        }

        System.out.println(Pattern.matches("\\d{4}", "1234"));
    }
}
