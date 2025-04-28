public class Emisora implements Observer {
    @Override
    public void update(String courseUpdate) {
        System.out.println("Journalist received update: " + courseUpdate);
    }
}
