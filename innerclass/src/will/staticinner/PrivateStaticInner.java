package will.staticinner;

public class PrivateStaticInner {
    private static int a = 0;
    private Inner inner;

    public void setInner(String name) {
        inner = new Inner(name);
    }

    public Inner getInner() {
        return inner;
    }

    public static int getA() {
        return a;
    }

    /**
     * private关键词修饰的静态内部类 在外部类之外不能访问
     */
    private static class Inner implements Speak {
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

        @Override
        public void speak() {
            System.out.println(a + "#\t" + this.getName() + " " + num);
        }
    }
}
