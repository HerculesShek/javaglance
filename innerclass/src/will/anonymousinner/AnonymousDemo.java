package will.anonymousinner;


import java.text.DateFormat;
import java.util.Date;

public class AnonymousDemo {
    public String printD(Date date) {
        DateFormat formatter = DateFormat.getDateTimeInstance();
        return formatter.format(date);
    }

    public static void main(String[] args) {
        AnonymousDemo demo = new AnonymousDemo();
        String str = demo.printD(new Date() {

        });
        System.out.println(str);
    }
}
