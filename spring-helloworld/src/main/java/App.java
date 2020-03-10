import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello = applicationContext.getBean(HelloWorld.class);
        HelloWorld beanHello1 = applicationContext.getBean(HelloWorld.class);
        Cat beanCat = applicationContext.getBean(Cat.class);
        Cat beanCat1 = applicationContext.getBean(Cat.class);
        boolean hello = beanHello.equals(beanHello1);
        boolean cat = beanCat.equals(beanCat1);
        System.out.println("hello: " + hello);
        System.out.println("cat: " + cat);

    }
}