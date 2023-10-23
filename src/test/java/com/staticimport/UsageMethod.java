package com.staticimport;


import AnotherPackage.demo;

import static com.staticimport.UtilityMethods.*;

public class UsageMethod {
    public static void main(String[] args) {
   // UtilityMethods utilityMethods=new UtilityMethods();
        add(1, 2);
        doSomething();
        demo d=new demo();
        d.demoone();
    }
}
