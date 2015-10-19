package io.xdire.thing;

/**
 * Created by xdire on 18.10.15.
 */
public class Config {

    private int port;
    private int portSSL;
    private String hostName;
    private String domainName;

    private boolean enableServer = true;
    private boolean enableServerSSL = true;

    public void defaultConfig(){
        port = 4890;
        portSSL = 4891;
        hostName = "localhost";
        domainName = "localhost";
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getPortSSL() {
        return portSSL;
    }

    public void setPortSSL(int portSSL) {
        this.portSSL = portSSL;
    }

    public boolean isEnabledServer() {
        return enableServer;
    }

    public void enableServer() {
        this.enableServer = true;
    }

    public boolean isEnabledServerSSL() {
        return enableServerSSL;
    }

    public void enableServerSSL() {
        this.enableServerSSL = true;
    }

    public void disableServerSSL() {
        this.enableServerSSL = false;
    }
}
