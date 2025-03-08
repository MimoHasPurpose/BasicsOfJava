package Basics;

public class StringsCode {
    public static void main(String[] args){

        String name="Bro";
        boolean result=name.equals("Bro");
        boolean result2=name.equalsIgnoreCase("bro");
        int result3=name.length();
        char result4=name.charAt(2);
        int result5=name.indexOf("o");
        boolean result6=name.isEmpty();
        String result7=name.toUpperCase();
        String result8=name.trim();
        String result9=name.replace('o','a');

        System.out.println(result);
    }
}
