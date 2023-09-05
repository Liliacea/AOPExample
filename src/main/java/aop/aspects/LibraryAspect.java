package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LibraryAspect {
@Before("execution(* aop.Library.getBook())")
    public void beforeGetBookAdvice(){
    System.out.println("tryinng to get book");
}
}
