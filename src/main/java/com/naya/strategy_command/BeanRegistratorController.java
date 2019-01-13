package com.naya.strategy_command;

import com.naya.strategy_command.reflections.CCL;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.net.URL;
import java.net.URLClassLoader;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

/**
 * @author Evgeny Borisov
 */
@RestController
public class BeanRegistratorController {

    @Autowired
    private GenericApplicationContext context;

    @Autowired
    private CCL ccl;

    @PostMapping("/regbean")
    @SneakyThrows
    public String hi(@RequestBody BeanMD beanMD){

        Class loadedClass = ccl.findClass(beanMD.getBeanClassName());
        var registry = (BeanDefinitionRegistry) context.getBeanFactory();
        GenericBeanDefinition myBeanDefinition = new GenericBeanDefinition();
        myBeanDefinition.setBeanClass(loadedClass);
        myBeanDefinition.setScope(SCOPE_SINGLETON);
        registry.registerBeanDefinition(beanMD.getBeanName(), myBeanDefinition);
        context.getBean(beanMD.getBeanName());
        return "registered";
    }






}
