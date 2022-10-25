package priv.akumalzw.design.observer.demo;

import java.util.Observable;
import java.util.Observer;

public class BuyerPhone implements Observer {
    private String buyerId = "";
    private String phone = "";

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(Observable o, Object arg) {
        Book b = (Book) arg;
        System.out.println("给顾客发手机信息：" + b.getName() + ", 价格变为：" + b.getPrice());
    }
}
