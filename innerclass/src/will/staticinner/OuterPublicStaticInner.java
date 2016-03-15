package will.staticinner;

public class OuterPublicStaticInner {
    private static int a = 0;
    private int age;

    public static int getA() {
        return a;
    }

    public static class Inner {
        private static int num = 45;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Inner(String name) {
            a++;
            this.name = name;
        }

        public void say() {
            System.out.println(a + "#\t" + this.getName() + " " + num);
            // System.out.println(age); // error!
        }
    }

    public static void main(String[] args) {
        OuterPublicStaticInner.Inner inner = new OuterPublicStaticInner.Inner("Will");
        inner.say();
        OuterPublicStaticInner.Inner inner2 = new OuterPublicStaticInner.Inner("Jack");
        inner2.say();
        System.out.println(OuterPublicStaticInner.getA() + " inner class instance(s)");
    }

}

