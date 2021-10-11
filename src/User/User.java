package User;

import CSVFile.CSVFile;
import java.io.*;
import java.util.ArrayList;
import java.util.UUID;

public class User {

    private final UUID userID = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    final String filePath = "src\\Files\\user_info.csv";

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public UUID getUuid() {
        return userID;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static String convertObjectToString(User client){
        String delimiter = ",";
        String convertedObject = String.join(delimiter,client.firstName + delimiter + client.lastName + delimiter + client.userName + delimiter + client.password + delimiter + client.userID);
        return convertedObject;
    }

    public static void register(User client) throws IOException {
        CSVFile.checkTheFile(client.filePath);
        CSVFile.writeData(client.filePath, convertObjectToString(client));
    }

    public static void displayData() throws IOException{
        ArrayList<Object> returnedArrayList = CSVFile.readData("src\\Files\\user_info.csv");
        for(int i = 0 ; i < returnedArrayList.size() ; i++){
            System.out.println(returnedArrayList.get(i));
        }

    }
}
