package com.wenlan.ems_vue.utils;

import org.mybatis.generator.api.ShellRunner;

public class generator {

    public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\generator\\generatorConfig.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
