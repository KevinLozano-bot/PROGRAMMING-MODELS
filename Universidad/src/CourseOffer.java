import java.util.ArrayList;
import java.util.List;

public class CourseOffer implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String courseUpdate) {
        for (Observer observer : observers) {
            observer.update(courseUpdate);
        }
    }

    public void addCourse(String courseName) {
        System.out.println("New course added: " + courseName);
        notifyObservers("New course available: " + courseName);
    }
}