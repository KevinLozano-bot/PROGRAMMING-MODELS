package models;

import strategies.NotificationStrategy;

public class User {
    private String name;
    private String contactInfo;
    private NotificationStrategy notificationStrategy;

    public User(String name, String contactInfo, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void notifyUser(String message) {
        notificationStrategy.sendNotification(message, contactInfo);
    }

    public String getName() {
        return name;
    }
}