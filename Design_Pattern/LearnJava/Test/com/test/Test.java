package com.test;

public class Test{

    static Static aa=new Static();
    static sub bb= new sub();
    public static void main(String[] args)
    {
        System.out.println(aa.i);
        aa.i++;
        System.out.println(aa.i);
        System.out.println(bb.i);
    }
}

class Static{
    public int i=10;
}

class sub extends Static{

}
class sub2 extends Static{

}