##静态代理 和 动态代理
###### https://www.cnblogs.com/jie-y/p/10732347.html

#### 成员如下
##### 1、接口：Start 明星，功能：唱歌 sing()
```$xslt
/**
 *  接口 明星
 */
public interface Star {

    /**
     *  明星 会唱歌
     */
    void sing();
}
```

##### 2、明星接口实现类：LDHStart 刘德华明星
- 刘德华是普通人，他实现Star明星接口后就成为明星了，则他就必须具备（实现）明星的一个功能 sing() 唱歌
```$xslt

/**
 *  真实对象：刘德华明星
 */
public class LDHStar implements Star{

    @Override
    public void sing() {
        System.out.println("给我一杯忘情水。。。");
    }
}
```

##### 3、问题引出
- 刘德华还会 跳舞，通过什么方式实现 在不修改源代码的情况下 给刘德华添加一个 dance功能？
- 问题解决：创建刘德华的  **静态代理**  对象，通过静态代理对刘德华类进行增强或对类中指定方法增强
```$xslt
/**
 *  LDHStar 的代理（刘德华增强类）
 */
public class LDHStarProxy implements Star {

    private Star star;

    public LDHStarProxy() {
        super();
    }

    public LDHStarProxy(Star star) {
        super();
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("唱歌前准备（方法 前置增强）");
        star.sing();
        System.out.println("善后工作（方法 后置增强）");
    }

    public void dance(){
        System.out.println("刘德华跳舞了。。。（对类的功能增强）");
    }
}
```

##### 效果如下：
```$xslt
public static void main(String[] args) {
        LDHStarProxy ldhStarProxy = new LDHStarProxy(new LDHStar());
        ldhStarProxy.sing();
        ldhStarProxy.dance();
    }
------------------------------------------
唱歌前准备（方法 前置增强）
给我一杯忘情水。。。
善后工作（方法 后置增强）
刘德华跳舞了。。。（对类的功能增强）
------------------------------------------
```
##### 静态代理总结
```$xslt
静态代理总结:
优点：可以做到在不修改目标对象的功能前提下,对目标功能扩展.
缺点:
因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
而动态代理方式可以解决上面的问题
```