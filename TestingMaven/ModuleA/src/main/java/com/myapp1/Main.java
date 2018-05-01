package com.myapp1;
import com.myapp2.ModuleB;


/**
 * Created by Aleksey on 01.04.2018.
 */
public class Main {
    public static void main (String args[]){
        System.out.println("Module A");

        ModuleB  b = new ModuleB();
        System.out.println(b.moduleB());
    }

}
