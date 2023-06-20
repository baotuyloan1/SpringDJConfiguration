package org.example.AnnotationDJ;

import org.springframework.stereotype.Component;

@Component("service1")
public class MyServiceImpl1 implements MyService{
    @Override
    public String getInfo() {
        return "Service 1's info";
    }
}
