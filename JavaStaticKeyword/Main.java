package JavaStaticKeyword;

public class Main {
public static void main(String[] args){

    Friend friend1=new Friend("Sponegbob");
    Friend friend2=new Friend("Patrick");
    Friend friend3=new Friend("Squidward");
    Friend friend4=new Friend("Sandy");
    System.out.println(Friend.numberOfFriends);

    Friend.displayFriends();

}
}
