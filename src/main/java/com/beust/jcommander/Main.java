package com.beust.jcommander;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dimitrios Zisis <zdimitris@outlook.com>
 * Date: 06/01/2021
 */
public class Main {
    @Parameter
    List<String> args = new ArrayList<>();

    static String quoted = "\" \"";
    public static void main(String[] args) {
        JCommander jc = new JCommander();
        jc.parse(quoted);
    }
}
