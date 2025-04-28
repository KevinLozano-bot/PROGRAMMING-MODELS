public class App {
    public static void main(String[] args) {
        CourseOffer courseOffer = new CourseOffer();

        Observer communityManager = new CommunityManager();
        Observer webmaster = new WebMaster();
        Observer journalist = new Emisora();

        courseOffer.subscribe(communityManager);
        courseOffer.subscribe(webmaster);
        courseOffer.subscribe(journalist);

        courseOffer.addCourse("Artificial Intelligence in Education");
        courseOffer.addCourse("Decolonial Pedagogy");
    }
}
