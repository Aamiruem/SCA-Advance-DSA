package OPPS.L21AbstractMethod;

public class UseLanguage {
    public static void main(String[] args) {
        
        Language lang;
        lang = new Hindi();
        lang.greetings();

        lang = new English();
        lang.greetings();

        lang = new French();
        lang.greetings();
    }
}
