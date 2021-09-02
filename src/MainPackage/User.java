package MainPackage;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class User {

    private final UUID uuid = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public UUID getUuid() {
        return uuid;
    }

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
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


    // public static void register(User client) {userInfo.add(client);}


    public static void writeData(User client , String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath,true);
        writer.write(client.firstName + " " + client.lastName + " " + client.userName + " " + client.password);
        writer.write("\r\n");
        writer.flush();
        writer.close();
    }

    public static void readData(String filePath) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filePath));
        input.useDelimiter(",");
        while (input.hasNext()){
            System.out.print(input.next() + " ");
        }
        input.close();
    }

}
