package strategies;

public class PushNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Enviando notificación push a " + recipient + ": " + message);
    }
}
