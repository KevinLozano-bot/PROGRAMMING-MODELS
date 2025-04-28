package strategies;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Enviando SMS a " + recipient + ": " + message);
    }
}
