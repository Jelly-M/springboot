package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class LogAspect {

    /**
     * 定义切入点
     */
    @Pointcut("execution(* com.example.service.*.*(..))")
    private void pointCutMethod(){

    }

    /**
     * 定义环绕通知
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        //pjp.getTarget().
        System.out.println("环绕通知:进入方法");
        Object proceed = pjp.proceed();
        System.out.println("环绕通知:退出方法方法");
        return proceed;
    }

    /**
     * 定义前置通知
     */
    @Before("pointCutMethod()")
    public void doBefor(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        //System.out.println(args.toString());
        System.out.println("前置通知");
    }

    /**
     * 定义后置通知
     */
    @After("pointCutMethod()")
    public void doAfter(){
        System.out.println("后置通知");
    }
}
