package CSVFile;

import User.User;

import java.io.*;
import java.util.ArrayList;


public class CSVFile{

    private static String filePath;
    private static File newFile = null;
    private static FileWriter writer;
    private static BufferedReader reader;
    private static ArrayList<String> data;


    public static void create() throws IOException {
        newFile = new File(filePath);
        newFile.createNewFile();
    }

    public static void check(String filePath) throws IOException,ClassCastException {
        newFile = new File(filePath);
        if (!newFile.exists()) {
            create();
        }
    }

    public static String convertObjectToString(User client){
        String delimiter = ",";
        String convertedObject = String.join(delimiter,client.getFirstName() +
                delimiter + client.getLastName() +
                delimiter + client.getUserName() +
                delimiter + client.getPassword() +
                delimiter + client.getUserID());
        return convertedObject;
    }

    public static void write(String filePath,User client) throws IOException {
        writer = new FileWriter(filePath,true);
        writer.append(convertObjectToString(client));
        writer.append("\n");
        writer.flush();
        writer.close();
    }

    public static ArrayList<String> read(String filePath) throws IOException {
        reader = new BufferedReader(new FileReader(filePath));
        data = new ArrayList<>();
        String stringOfCurrentLine;
        while((stringOfCurrentLine = reader.readLine()) != null) {
            data.add(stringOfCurrentLine);
        }
        return data;
    }

}
