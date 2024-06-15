package org.icycodes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.icycodes")
@EnableAspectJAutoProxy
public class BeanConfig {
}
