package mrtuz.springframework.springdi.controllers;

import mrtuz.springframework.springdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();
    }
    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}