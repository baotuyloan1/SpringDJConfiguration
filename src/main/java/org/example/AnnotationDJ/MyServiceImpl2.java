package org.example.AnnotationDJ;

import org.springframework.stereotype.Component;

@Component("service2")
public class MyServiceImpl2 implements MyService {
    @Override
    public String getInfo() {
        return "Service 2's Info";
    }
}
