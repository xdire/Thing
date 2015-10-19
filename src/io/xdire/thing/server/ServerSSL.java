package io.xdire.thing.server;


import javax.net.ssl.SSLServerSocket;

/**
 * Created by xdire on 18.10.15.
 */
public class ServerSSL implements Runnable {

    final private int port;
    final private String hostName;

    private SSLServerSocket serverSocket;

    public ServerSSL(int port,String host){
        this.port = port;
        this.hostName = host;
    }
    @Override
    public void run() {



    }

}
