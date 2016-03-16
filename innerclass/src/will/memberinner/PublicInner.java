package will.memberinner;

public class PublicInner {
    private int age = 34;
    private static int num = 42;

    public void say() {
        System.out.println("hello");
    }

    private void foo() {
        System.out.println("world");
    }

    public class Inner {
        // public static int err = 44; // error!

        // public static void foo() {} // error!

        public void say() {
            PublicInner.this.say();
            PublicInner.this.foo();
            System.out.println(age);
            num++;
            System.out.println(num);
        }

        public PublicInner getOuter() {
            return PublicInner.this;
        }
    }
}
