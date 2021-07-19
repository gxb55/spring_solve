package com.trip.config;

/**
 * @author xbguo 郭晓兵
 * @date 2020-12-09 20:01
 */

import com.trip.bean.Calculate;
import com.trip.bean.Person;
import com.trip.bean.TulingCalculate;
import com.trip.bean.TulingLogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.trip")
public class AppConfig {
/*
    @Bean(name = "Person")
    public Person getPerson(){
        Person person = new Person();
        person.setAge(18);
        person.setName("张三");
        return person;
    }*/

/*    @Bean
    public Calculate calculate(){
        return new TulingCalculate() ;
    }
    @Bean
    public TulingLogAspect tulingLogAspect(){
        return new TulingLogAspect();
    }*/
}
