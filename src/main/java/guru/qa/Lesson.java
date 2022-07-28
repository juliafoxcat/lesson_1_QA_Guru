package guru.qa;

public class Lesson {

    static void furOrNot(Cat сat1, Cat сat2) {
        if (сat1.fur && сat2.fur) {
            System.out.println("So fluffy cats!");
        } else if (сat1.fur || сat2.fur) {
            System.out.println("Flyffy and not fluffy cats!");
        } else {
            System.out.println("Nice shorthair cats!");
        }
    }

    public static void main(String[] args) {
        Cat pushok = new Cat("pushok", 4, true, true);
        pushok.hungryMeow();
        Cat barsik = new Cat("barsik", 2, false, false);
        furOrNot(pushok, barsik);

    }
}

