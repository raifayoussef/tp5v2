package ma.education.tp5.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Programmer {
    abstract int id();
    String name();

}
