import models.User;
import services.NotificationService;
import strategies.EmailNotification;
import strategies.PushNotification;
import strategies.SMSNotification;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Juan", "juan@gamil.com", new EmailNotification());
        User user2 = new User("Maria", "3118507496", new SMSNotification());
        User user3 = new User("Carlos", "Carlos Lopez", new PushNotification());

        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification(user1, "Tu saldo ha cambiado.");
        notificationService.sendNotification(user2, "Nueva promoción disponible.");
        notificationService.sendNotification(user3, "Alerta de seguridad: inicio de sesión no reconocido.");

        user1.setNotificationStrategy(new SMSNotification());
        notificationService.sendNotification(user1, "Tu saldo está por debajo del umbral.");
        user2.setNotificationStrategy(new EmailNotification());
        notificationService.sendNotification(user2, "Tu cuenta ha sido actualizada.");
        user3.setNotificationStrategy(new EmailNotification());
        notificationService.sendNotification(user3, "Tu contraseña ha sido cambiada.");
    }
}