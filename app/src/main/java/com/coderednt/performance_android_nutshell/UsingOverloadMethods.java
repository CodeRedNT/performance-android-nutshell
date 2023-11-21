package com.coderednt.performance_android_nutshell;

public class UsingOverloadMethods {

    void Execute() {
        OverloadMethods om1 = new OverloadMethods("name", 11);
        OverloadMethods om2 = new OverloadMethods("name", null);
        OverloadMethods om3 = new OverloadMethods("name");
    }
}
