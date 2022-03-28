package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//标志该类是SPring的核心配置类
@Configuration
@ComponentScan("com.itheima")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {


}
