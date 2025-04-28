package services;

import models.User;

public class NotificationService {
    public void sendNotification(User user, String message) {
        user.notifyUser(message);
    }
}
