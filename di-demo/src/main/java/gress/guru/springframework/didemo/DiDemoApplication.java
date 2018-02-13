package gress.guru.springframework.didemo;

import gress.guru.springframework.didemo.controllers.ConstructorInjectedController;
import gress.guru.springframework.didemo.controllers.MyController;
import gress.guru.springframework.didemo.controllers.PropertyInjectedController;
import gress.guru.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        String result = myController.hello();

        System.out.println(result);

        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    }
}
