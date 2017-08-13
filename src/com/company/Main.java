package com.company;

public class Main {

    public static void main(String[] args) {

    Scanner.read("c:/123.txt")
        List<String> list = new LinkedList<>(Arrays.asList(s.split(" ")));
        int i = 0;
        for(int n = 0; n < list.size(); n=0)	{
            String st = list.get(n);
            Iterator<String> iter = list.iterator();
            while(iter.hasNext())	{
                String str = iter.next();
                if(st.equals(str))	{
                    i++;

                    iter.remove();
                }
            }
            System.out.println(st + " : " + i);
            //System.out.println(list);
            i = 0;
    }
}
