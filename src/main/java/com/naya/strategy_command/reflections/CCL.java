package com.naya.strategy_command.reflections;

import com.naya.springpatterns.scala_traits.Sender;
import com.naya.strategy_command.MessageSender;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Evgeny Borisov
 */
@Service
public class CCL extends ClassLoader {
    @Override
    @SneakyThrows
    public Class<?> findClass(String className) {
        String fileName = "target/classes/"+className.replace('.', File.separatorChar) + ".class";
        byte[] b =  Files.newInputStream(Path.of(fileName)).readAllBytes();
        return defineClass(className, b, 0, b.length);
    }


    @SneakyThrows
    public static void main(String[] args) {
        MessageSender o = (MessageSender) new CCL().findClass("com.naya.strategy_command.SmsSender").newInstance();
        System.out.println(o.send(null));
    }

}
