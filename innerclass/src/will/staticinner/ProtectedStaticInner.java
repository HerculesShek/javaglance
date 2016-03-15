package will.staticinner;

public class ProtectedStaticInner {
    private static int a = 0;

    public static int getA() {
        return a;
    }

    /**
     * protected关键词修饰的静态内部类是包级别的访问权限
     */
    protected static class Inner {
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
        }
    }
}
