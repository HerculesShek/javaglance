package will.staticinner;

public class PublicStaticInner {
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
        PublicStaticInner.Inner inner = new PublicStaticInner.Inner("Will");
        inner.say();
        PublicStaticInner.Inner inner2 = new PublicStaticInner.Inner("Jack");
        inner2.say();
        System.out.println(PublicStaticInner.getA() + " inner class instance(s)");
    }

}

