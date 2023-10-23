package com.staticimport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("orange", "banana");

  /*      List<String> customName=new ArrayList<>();
        for (String s:names){
            String newName=s +"fruit";
            customName.add(newName);
        }
        System.out.println("Before -->>" + names);
        System.out.println("after -->>" + customName);
    }*/
        Stream<String> nameStream = names.stream();
        Stream<String> stringStream = nameStream.map(e -> e + "fruit");
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);
    }
}