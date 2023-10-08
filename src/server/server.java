package server;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {






        public static void main(String[] args) throws IOException {
            // TODO Auto-generated method stub
            ServerSocket ss = new ServerSocket(1237);

            System.out.println("Le server attend la connexion un client ");
            Socket s = ss.accept();
            System.out.println("client connécté");
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            int nb  = is.read();
            int y =is.read();
            int res;
            switch (y){
                case 1 : res = nb*5; break;
                case 2:  res=nb-5;break;
            case 3:res=nb/5;break;
                case 4: res=nb+5;break;
                default:
                    throw new IllegalStateException("Unexpected value: " + y);
            }
            os.write(res);
            //System.out.println(res);
            s.close();
            ss.close();

        }}

