package org.icycodes;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Auth {

    @Pointcut("within(org.icycodes..*)")
    public void authorisationPointCut() {
    }

    @Pointcut("within(org.icycodes..*)")
    public void authenticatePointCut() {

    }

    @Before("authenticatePointCut() && authorisationPointCut()")
    public void authenticate() {
        System.out.println("auth working");
    }
}


