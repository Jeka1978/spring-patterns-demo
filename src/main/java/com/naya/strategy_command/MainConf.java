package com.naya.strategy_command;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import static com.naya.strategy_command.DeliveryType.SMS;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class MainConf {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainConf.class);


    }
}
