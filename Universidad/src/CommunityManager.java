public class CommunityManager implements Observer {
    @Override
    public void update(String courseUpdate) {
        System.out.println("Community Manager received update: " + courseUpdate);
    }
}
