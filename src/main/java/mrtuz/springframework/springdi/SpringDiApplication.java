package mrtuz.springframework.springdi;

import mrtuz.springframework.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.getGreeting());

        System.out.println("___primary______");
        System.out.println(myController.sayHello());

        System.out.println("___Property___");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("___Setter____");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("____constructor____");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
