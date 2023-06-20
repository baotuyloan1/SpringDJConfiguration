package org.example.JavaConfigurationDI;

public class ClientImpl2 implements Client {

  private Service service;

  public ClientImpl2(Service service) {
    this.service = service;
  }

  @Override
  public void doSomething() {
    String info = service.getInfo();
    System.out.println(info);
  }
}
