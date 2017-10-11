package com.xfansfan.spring.si.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages={"com.xfansfan.spring.si"})
@ImportResource({})
public class BaseIntegratorSpringConfig {

}
