package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List swap(List l, int i, int j) {

        Collections.swap(l, 1, 2);
        return l;
    }

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        swap(colors, 0, 0);
        for(String color: colors) {
            System.out.println(color);
        }

    }
}