import java.util.ArrayList;

public class ArrayListsCode {
public static void main(String[] args){


    ArrayList<String> food=new ArrayList<String>();
    food.add("pizza");
    food.add("hamburger");
    food.set(0,"sushi");
    food.remove(1);
//    food.clear();
    for(int i=0;i<food.size();i++){
        System.out.println(food.get(i));
    }
}

}
