import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //File
        File file = new File("text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(file.isDirectory());
        File directory = new File("resource");
        if(!directory.exists()){

            //directory.delete();
            directory.mkdir();
        }
        if(directory.exists()){
            File[] listFile = directory.listFiles();
            for(File f:listFile){
                System.out.println(f.length());
            }
            //ghi ra file
            //text
            FileWriter fw=null;
            char[] chars ={'p','b','c'};
            try {
                File fileWriter = new File("text.txt");
                if(!fileWriter.exists()){
                    fileWriter.createNewFile();
                }
               fw = new FileWriter("text.txt");
                fw.write(chars);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            finally{
                if(fw!=null){
                    try{
                        fw.close();
                    }catch(IOException e){
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        //doc file
        //text
//        FileReader fr = null;
//        try{
//            fr = new FileReader("texxt.txt");
//
//            Character c = null;
//            while(c=fr.read()!=null)
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }
//    }
}}