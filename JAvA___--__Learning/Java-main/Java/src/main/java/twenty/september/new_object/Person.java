/*
 * @Author: Weidows
 * @Date: 2020-09-04 17:39:50
 * @LastEditors: Weidows
 * @LastEditTime: 2020-09-07 11:11:06
 * @FilePath: \Weidows\Java\src\main\java\twenty\september\new_object\Person.java
 */
package twenty.september.new_object;

/**
 * ! 在new Person()时,执行顺序是
 *    1.name这种成员变量的初始化
 *    2.执行代码块(多个代码块会按照从上到下顺序执行)
 *    3.执行构造函数
 *
 *  两种代码块都可以用输出语句,可以对类的成员变量做初始化操作
 */
public class Person {
  String name;
  static TestPerson tp = new TestPerson();

  public Person() {
    this.name = "张三";
    System.out.println("执行的是构造方法");
  }

  public void test() {
    System.out.println("这是Person的test方法");
  }

  // ! 非静态的代码块
  {
    System.out.println("执行的是非静态的代码块1");
  }
  {
    System.out.println("执行的是非静态的代码块2");
  }
  {
    System.out.println("执行的是非静态的代码块3");
  }

  /**
   * ! 静态代码块
   * 里面只能放/调用static变量/方法
   * static代码块在程序运行周期只能被执行一次(new多次对象时共用一个静态类变量,不能被重复调用)
   * 静态代码块运行优先于非静态代码块
   *  实际开发中常用,用来初始化类的静态对象属性(成员对象变量),比如tp那样,或者用在内部类替代构造器使用
   */
  static {
    System.out.println("执行的是静态的代码块");
    tp.age = 1;
    tp.name = "张三";
  }
}

class TestPerson {
  int age;
  String name;
}