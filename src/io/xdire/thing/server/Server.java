package io.xdire.thing.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xdire on 18.10.15.
 */
public class Server implements Runnable {

    final private int port;
    final private String hostName;

    private ServerSocket serverSocket;

    public Server(int port,String host){
        this.port = port;
        this.hostName = host;
    }

    @Override
    public void run() {

        try {

            // Create server socket
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on "+serverSocket.getInetAddress()+" on port "+port);

            while (true){
                Socket clientSocket = serverSocket.accept();
                SimpleConnection simpleConnection = new SimpleConnection(clientSocket);
                simpleConnection.start();
            }

        } catch (IOException e) {

            System.out.println("Server cannot start on port "+port);
            System.out.println(e.getMessage());

            e.printStackTrace();

        }


    }

}
