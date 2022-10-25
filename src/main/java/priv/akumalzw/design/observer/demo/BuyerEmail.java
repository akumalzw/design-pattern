package priv.akumalzw.design.observer.demo;


import java.util.Observable;
import java.util.Observer;

public class BuyerEmail implements Observer {
    private String buyerId = "";
    private String mail = "";

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void update(Observable o, Object arg) {
        Book b = (Book) arg;
        System.out.println("给顾客发电子邮件：" + b.getName() + ", 价格变为：" + b.getPrice());
    }
}
