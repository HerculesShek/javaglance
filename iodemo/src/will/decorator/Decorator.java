package will.decorator;

/**
 * 装饰角色
 * 装饰角色一定要继承或者实现抽象构件 并持有一个构件对象的引用
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void foo() {
        component.foo();
    }
}
