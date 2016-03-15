package will;

class Outer {
    private static int a = 0;

    public static int getA() {
        return a;
    }

    public static class Inner {
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
            System.out.println(a + "#\t" + this.getName());
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner("Will");
        inner.say();
    }
}
