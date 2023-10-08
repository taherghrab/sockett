package client;
import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO Auto-generated method stub
        System.out.println("je suis un client non connecté ");
        Socket s = new Socket("localhost", 1237);

        System.out.println("je suis connecté ");
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        int nb =scanner.nextInt();
        int x;
       do{
           System.out.println("choisir un nombre 1:multiplication  2:soustraction 3:division 4:addition");
         x= scanner.nextInt();
       }
       while (x>4);
        //int nb=10;
        os.write(nb);
        os.write(x);
        int res=is.read();
        System.out.println(res);
        s.close();
    }
}
