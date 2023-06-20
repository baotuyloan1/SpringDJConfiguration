package org.example.AnnotationDJ;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    /**
     * Here, you see an instance of AnnotationConfigApplicationContextis created to scan a Java
     * package to instantiate Spring-annotated classes as managed beans in the container:
     */
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
    appContext.scan("org.example");

    /** Then we need to refresh the application context to update the changes after scanning: */
    appContext.refresh();

    MyClient client = (MyClient) appContext.getBean("client1");
    client.doSomething();
  }
}
