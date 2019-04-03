package pl.training.bank.profiler;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
public class Profiler {

    @Around("@annotation(ExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.nanoTime();
        Object result = proceedingJoinPoint.proceed();
        long totalTime = System.nanoTime() - startTime;
        System.out.println(String.format("%s executed in %d ns", proceedingJoinPoint.getSignature(), totalTime));
        return result;
    }

}