package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MyFirstComponent {
    public MyFirstComponent(MySimplePojo mySimplePojo, List<String> defaultData, @Value("${my.custom.property}") String property)
    {
        System.out.println("Hello form MyFirstComponent");
        mySimplePojo.soutSomething();
        System.out.println(defaultData);
        System.out.println(property);
    }

    public void HelloFromFirstComponent()
    {
        System.out.println("Hello form MyFirstComponent.printHelloFromMethon()");
    }
}
