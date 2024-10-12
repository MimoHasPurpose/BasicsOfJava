package constructors;

public class Main {
    public static void main(String[] args){
        Human human1=new Human("Rick",65,70);
        Human human2=new Human("Ninja",22,69);
        System.out.println(human1.name+" "+human2.name);
        human2.eat();
    }

}
