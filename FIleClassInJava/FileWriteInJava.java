package FIleClassInJava;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteInJava {
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("C:\\Users\\user\\Desktop\\DivingIntoJava\\FIleClassInJava\\poem.txt");
            writer.write("Roses are red!!\n");
            writer.write("violets are blue!!\n");
            writer.write("booty booty wee!!\n");
            writer.write("Who are we!!\n");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
