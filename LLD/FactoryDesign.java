package LLD;

interface Notification{
    void send();
}

class EmailNotification implements Notification{

    public void send(){
        System.out.println("Sending Email");
    }
}

class SMSNotification implements Notification{
    
    public void send(){
        System.out.println("Sending SMS Notification");
    }
}


class NotificationFactory{
    public static Notification geNotification(String type){
        if(type.equals("Email")){
            return new EmailNotification();
        }
        if(type.equals("SMS")){
            return new SMSNotification();
        }
        return new EmailNotification();
    }
}


public class FactoryDesign {
    public static void main(String[] args){
        Notification notification= NotificationFactory.geNotification("Email");
        notification.send();
    }
}
