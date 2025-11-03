package Read_Writte;

import java.io.FileWriter;
import java.io.IOException;

public class W_F {
    public static void main(String[] args) {
        try{
            FileWriter write = new FileWriter("E:\\IdeaProjects\\JAVA Practice\\src\\Read_Writte\\poem.txt");
            write.write("Rose are Red !! ZIDAN\n O nunupakkhhii!!");
            write.close();

            System.out.println("writing is done.");

        }
        catch(IOException e){
            System.out.println("Something error!");
        }

    }

}
