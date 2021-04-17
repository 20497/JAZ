package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
    public MySecondComponent(MyFirstComponent myFirstComponent){
        System.out.println("Hello from MySecondComponent");

    }

    public void HelloFromSecondComponent(){
        System.out.println("Hello from second component");
    }
}