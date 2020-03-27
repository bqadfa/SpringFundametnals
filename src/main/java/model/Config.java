package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "model")
public class Config {

    //@Bean
//    model.Child getChild() {
//        model.Child child = new model.Child();
//        child.setMiddle(getMiddle());
//        return child;
//    }
//
//    @Bean
//    model.Middle getMiddle(){
//        model.Middle middle = new model.Middle();
//        middle.setParent(getParent());
//        return middle;
//    }
//
//    @Bean
//    model.Parent getParent() {
//        return new model.Parent();
//    }
}
