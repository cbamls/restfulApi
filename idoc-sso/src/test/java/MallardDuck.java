/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-main
 * Comments:
 * Author:cbam
 * Create Date:2016/11/17
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I hava my own display methods~!");
    }

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        System.out.println("now we want to our duck be powered by rocket~!");
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
