package com.myapp2;

import com.myapp3.ModuleC;
import com.myapp4.ModuleD;

/**
 * Created by Aleksey on 03.04.2018.
 */
public class ModuleB {
    public String moduleB (){
        ModuleC c = new ModuleC();
        ModuleD d = new ModuleD();
        return "Module B" + " " + c.moduleC() + " " + d.moduleD();
    }
}
