package will.anonymousinner;


import will.staticinner.Speak;

public class AnonymousSpeak {
    public void printD(Speak speak) {
        speak.speak();
    }

    public static void main(String[] args) {
        AnonymousSpeak demo = new AnonymousSpeak();
        demo.printD(new Speak() {
            @Override
            public void speak() {
                System.out.println("hello");
            }
        });
    }
}
