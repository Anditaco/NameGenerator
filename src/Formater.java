import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

class Formater {
    //Processes a txt file into a parsable array
    ArrayList<String> format(String fileName) throws Exception{
        File file = new File("Data/English_Words");

        BufferedReader br = new BufferedReader(new FileReader(file));


        ArrayList<String> data = new ArrayList<>();
        String datum;
        while ((datum = br.readLine()) != null)
            data.add(" " + datum + ".");

        return data;
    }
}
