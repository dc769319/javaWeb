import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String args[]){
        try {
            ServerSocket serverSocket = new ServerSocket(9998);
            Socket socket = serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            FileInputStream inputStream = new FileInputStream("src/log.txt");
            byte byteStr[] = new byte[1024];

            while(-1 != inputStream.read(byteStr)){
                outputStream.write(byteStr);
            }
            inputStream.close();
            outputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
