package CSVFile;

import java.io.*;
import java.util.ArrayList;


public class CSVFile{

    public static void checkTheFile(String filePath) throws IOException,ClassCastException {
        File newFile = new File(filePath);
        if (!newFile.exists()) {
            createNewFile(filePath);
        }
    }
    public static void createNewFile(String filePath) throws IOException {
        File newFile = new File(filePath);
        newFile.createNewFile();
    }

    public static void writeData(String filePath,String data) throws IOException {
        FileWriter writer = new FileWriter(filePath,true);
        writer.append(data);
        writer.append("\n");
        writer.flush();
        writer.close();
    }

    public static ArrayList<Object> readData(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        ArrayList<Object> data = new ArrayList<>();
        String stringOfCurrentLine;
        while((stringOfCurrentLine = reader.readLine()) != null){
            data.add(stringOfCurrentLine);
        }
        return data;
    }

}
