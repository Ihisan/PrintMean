package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sortering {
    public static List<Integer> swap(List<Integer> l, int i, int j) {
        int tmp = l.get (i);
        l.set (i, l.get (j));
        l.set (j, tmp);
        return l;
    }
    public static void sort(List<Integer> List){
        for(int i = 0; i<List.size (); i++){
            for(int j =i; j<List.size (); j++){
                if(List.get (j) < List.get (i)){ //if(List.get (j) > List.get (i)) sorterar åt andra hållet
                    swap (List,i,j);
                }
            }
        }
    }
    public static void main(String [] args){
        List<Integer> list = new ArrayList<> ();
        for(int i = 0; i<10; i++){
            list.add((int)(Math.random()*9+1));
        }
        sort (list);
        for(int l: list) {
            System.out.println (l);

        }
    }
}
