package io.xdire.thing;


import io.xdire.thing.interfaces.Middleware;
import io.xdire.thing.interfaces.RouteFinish;
import io.xdire.thing.server.Server;
import io.xdire.thing.server.ServerSSL;

/**
 * Created by xdire on 18.10.15.
 */
public class App {

    public static Config config;

    private static Server server;
    private static ServerSSL serverSSL;


    public void get(String path,Middleware ware,RouteFinish func){


    }

    public void get(String path,RouteFinish func){


    }

    public void post(String path, Middleware ware, RouteFinish func){


    }

    public void post(String path, RouteFinish func){


    }

    public Config getConfig(){
        return config;
    }

    public static void initWithConfig(Config c){

        config = c;

        if(config.isEnabledServer()) {
            Thread server = new Thread(new Server(config.getPort(),config.getHostName()));
            server.start();
        }

        if(config.isEnabledServerSSL()) {
            Thread serverSSL = new Thread(new ServerSSL(config.getPortSSL(),config.getHostName()));
            serverSSL.start();
        }

    }


}
