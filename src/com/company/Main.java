package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        String str;
//    }
//     Scanner str = new Scanner.read("c:/123.txt")
//        List<String> list = new LinkedList<>(Arrays.asList(str.split(" ")));
//        int i = 0;
//        for(int n = 0; n < list.size(); n=0)	{
//            String st = list.get(n);
//            Iterator<String> iter = list.iterator();
//            while(iter.hasNext())	{
//                String st = iter.next();
//                if(str.equals(st))	{
//                    i++;
//
//                    iter.remove();
//                }
//            }
//            System.out.println(str + " : " + i);
//            //System.out.println(list);
//
//            i = 0;
//    }

        Scanner scanner = new Scanner(new File("example.txt"));
        Map<String, Integer> statistics = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        Integer i=0;
        Integer maxCount=0;
//
        for (Integer key : statistics.keySet()) {
            if( maxCount>=statistics[i].getKey()){
                maxCount=statistics[i].getKey();
            }

        System.out.println(statistics);
            System.out.println(statistics[maxCount], '-',maxCount );
    }
}


