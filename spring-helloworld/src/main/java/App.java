import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHello1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        boolean hello = beanHello.equals(beanHello1);
        boolean cat = beanCat.equals(beanCat1);
        System.out.println("hello: " + hello);
        System.out.println("cat: " + cat);

    }
}