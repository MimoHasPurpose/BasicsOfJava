package OverloadedConstructors;

public class Main {
    public static void main(String[] args){
        Pizza pizza=new Pizza("thicc crust","tomato","mozzerella","pepperoni");
        System.out.println("Ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        Pizza pizza2=new Pizza("thicc crust","tomato","mozzerella");



    }
}
