import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Scanner;

public class TextFileReading {
    public static void main(String[] args){
        TextFileReading obj = new TextFileReading();
        obj.Reading("Network_1.txt");
    }
    void Reading(String filename){
        String number = "";
        int count=0;
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                number = "";
                while(data.length()!=count) {
                    if (data.substring(count, count+1).equals(",")) {
                        System.out.print(number+" ");
                        number="";
                    }else{
                        number=number+data.substring(count,count+1);
                    }
                    count++;
                }
                System.out.println();
                count=0;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
