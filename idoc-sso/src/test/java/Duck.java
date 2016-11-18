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
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public Duck(){

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All the ducks can fly");
    }

    public void  setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
