package ru.task20;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MethodExecutionTimeAspect {
  private long startTime;

  @Before("execution(* ru.task20.BankService.*(..)) || execution(* ru.task20.CardService.*(..))")
  public void beforeMethodExecution() {
    startTime = System.currentTimeMillis();
  }

  @After("execution(* ru.task20.BankService.*(..)) || execution(* ru.task20.CardService.*(..))")
  public void afterMethodExecution(JoinPoint joinPoint) {
    long executionTime = System.currentTimeMillis() - startTime;
    log.info("Method" + joinPoint.getSignature() + " was executed in " + executionTime + " ms");
  }
}


