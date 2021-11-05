import javax.net.ssl.HostnameVerifier;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

/** Created by Rahel Engelmann on 05.11.2021 */
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        try
        {
        /** parsing a CSV file into BufferedReader class constructor */
            BufferedReader br = new BufferedReader(new FileReader("sfm_holder_report.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] index = line.split(splitBy);    // use comma as separator

                String address = index[0];
                String holderAddress = address.substring(1, address.length() - 1);
                String balance = index[1];
                String holderBalance = balance.substring(1, balance.length() - 1);
                String pendingUpdate = index[2];
                String holderPendingUpdate = pendingUpdate.substring(1, pendingUpdate.length() - 1);



                System.out.println("Address: " + holderAddress);
                System.out.println("Balance: " + holderBalance);
                System.out.println("Pending: " + holderPendingUpdate);
                System.out.println("________________________________________");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}