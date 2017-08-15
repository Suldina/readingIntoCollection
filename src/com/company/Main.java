package com.company;


public class Main {

    public static void main(String[] args) {
        String str;
    }
     Scanner str = new Scanner.read("c:/123.txt")
        List<String> list = new LinkedList<>(Arrays.asList(str.split(" ")));
        int i = 0;
        for(int n = 0; n < list.size(); n=0)	{
            String st = list.get(n);
            Iterator<String> iter = list.iterator();
            while(iter.hasNext())	{
                String st = iter.next();
                if(str.equals(st))	{
                    i++;

                    iter.remove();
                }
            }
            System.out.println(str + " : " + i);
            //System.out.println(list);

            i = 0;
    }
}
