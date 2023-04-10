package inheritance_polymorphism.library_app;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        kidUser kid1 = new kidUser(10, "Kids");
        kidUser kid2 = new kidUser(18, "Fiction");

        kid1.registerAccount();
        kid2.registerAccount();

        kid1.requestBook();
        kid2.requestBook();

        AdultUser adult1 = new AdultUser(5, "Kids");
        AdultUser adult2 = new AdultUser(23, "Fiction");

        adult1.registerAccount();
        adult2.registerAccount();

        adult1.requestBook();
        adult2.requestBook();
    }
}
