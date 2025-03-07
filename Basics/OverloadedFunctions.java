package Basics;

public class OverloadedFunctions {
    public static void main(String[] args){
        int x=add(1,2);
        System.out.println(x);
    }

    static int add(int a,int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static int add(int a,int b, int c, int d){
        return a+b+c+d;
    }
}
