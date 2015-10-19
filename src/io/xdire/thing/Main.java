package io.xdire.thing;

/**
 * Created by xdire on 18.10.15.
 */
public class Main {


    public static void main(String[] args){

        Main runner = new Main();
        runner.runServer();

    }

    public void runServer(){

        Config conf = new Config();
        conf.defaultConfig();
        App.initWithConfig(conf);

    }

}
