package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Library.class);
Library library = ctx.getBean("library", Library.class);
library.getBook();
ctx.close();
    }
}
