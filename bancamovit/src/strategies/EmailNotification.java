package strategies;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Enviando correo a " + recipient + ": " + message);
    }
}
