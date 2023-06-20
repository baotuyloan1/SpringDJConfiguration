package org.example.JavaConfigurationDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean("client1")
  public Client getClient1(Service service1) {
    return new ClientImpl1(service1);
  }

  @Bean("service1")
  public Service getService1() {
    return new ServiceImpl1();
  }

  @Bean({"client2", "cl2", "CL2"})
  public Client getClient2() {
    return new ClientImpl2(service2());
  }

  @Bean("service2")
  public Service service2() {
    return new ServiceImpl2();
  }

  @Bean({"client3", "cl3", "CL3"})
  public Client client3(Service SRV) {
    return new ClientImpl3(SRV);
  }

  @Bean({"service3", "srv", "SRV"})
  public Service service3() {
    return new ServiceImpl3();
  }
}
