package org.example.JavaConfigurationDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    Client client1 = (Client) applicationContext.getBean("client1");
    client1.doSomething();
    Client client2 = (Client) applicationContext.getBean("cl2");
    client2.doSomething();
    Client client3 = (Client) applicationContext.getBean("CL3");
    client3.doSomething();
  }
}
