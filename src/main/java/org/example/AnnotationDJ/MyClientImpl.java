package org.example.AnnotationDJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The first annotation you can use to mark a class as a managed bean in Spring is the @Component
 * annotation. Here, the class MyClientImpl is marked with the @Component annotation so Spring will
 * create an instance of this class and manage it as a bean with the name client1 in the container.
 *
 * <p>To tell Spring to inject an instance of another class into this class, declare an instance
 * field with the @Autowired annotation, for example:
 *
 * <p>- There cannot have two beans in the IoC container with the same name, so the name you specify
 * in the @Component must be unique.
 *
 * <p>- You can also mark a class with @Service and @Repository annotations. These annotations have
 * same technical purpose as the @Component annotation. They have different names to mark classes in
 * different layers of the application.
 *
 * <p>- The @Autowired annotation can be also applied on setter method and constructor.
 */
@Component("client1")
public class MyClientImpl implements MyClient {

  /**
   * nếu có 2 bean cùng implement MyService thì sử dụng tên của global variable để sử dụng bean sử
   * dụng service2 để gọi đến bean service2
   */
  @Autowired private MyService service2;

  @Override
  public void doSomething() {
    String info = service2.getInfo();
    System.out.println(info);
  }
}
