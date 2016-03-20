package will.decorator;


public class Main {
    public static void main(String[] args) {
        /** 节点流 */
        Component component = new ConcreteComponent();
        /** 过滤流1 */
        Component component1 = new ConcreteDecorator1(component);
        /** 过滤流2 */
        Component component2 = new ConcreteDecorator2(component1);

        component2.foo();
        System.out.println("----------------------------------");

        /** 换一下顺序 */
        component1 = new ConcreteDecorator2(component);
        component2 = new ConcreteDecorator1(component1);
        component2.foo();

    }
}
