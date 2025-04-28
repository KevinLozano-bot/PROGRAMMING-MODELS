public class WebMaster implements Observer {
    @Override
    public void update(String courseUpdate) {
        System.out.println("Webmaster received update: " + courseUpdate);
    }
}