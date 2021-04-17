package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent
{
    public MyThirdComponent(MySecondComponent mySecondComponent, MyFirstComponent myFirstComponent)
    {
        System.out.println("Hello from my third component");
        myFirstComponent.HelloFromFirstComponent();
        mySecondComponent.HelloFromSecondComponent();
    }
}

