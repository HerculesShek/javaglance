package will.decorator;

/**
 * 装饰角色 持有一个构件对象的引用 并定义一个与构件对象接口一致的方法
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
