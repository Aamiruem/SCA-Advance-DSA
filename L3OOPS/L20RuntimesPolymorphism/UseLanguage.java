package OPPS.L20RuntimesPolymorphism;

public class UseLanguage {
    public static void main(String[] args) {
        //runtime polymorphism
        //non polymorphism
        // Hindi h = new Hindi();
        // h.greeting();

        // English e = new English();
        // e.greeting();

        // Spanish s = new Spanish();
        // s.greeting();

        // French f = new French();
        // f.greeting();



        //polymorphism

        Language lang;
        lang = new Hindi();
        lang.greetings();

        lang = new English();
        lang.greetings();

        lang = new French();
        lang.greetings();

        lang = new Spanish();
        lang.greetings();

        lang = new Urdu();
        lang.greetings();

    }
}
