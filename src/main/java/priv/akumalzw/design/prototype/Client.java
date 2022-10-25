package priv.akumalzw.design.prototype;

import java.io.Serializable;

public class Client implements Serializable {
    private String ip;
    private String name;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("ip=" + this.ip + ", name=" + this.name);
    }
}
