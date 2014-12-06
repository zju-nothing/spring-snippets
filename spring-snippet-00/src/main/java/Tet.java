import java.io.File;

/**
 * @author chenliu, create at 12/3/14 16:45
 */
public class Tet {
    public static void main(String[] args) {
        System.out.println("fs");
        ClassLoader parent = Tet.class.getClassLoader();
        GroovyClassLoader loader = new GroovyClassLoader(parent);
        Class groovyClass = loader.parseClass(new File("src/test/groovy/script/HelloWorld.groovy"));

// let's call some method on an instance
        GroovyObject groovyObject = (GroovyObject) groovyClass.newInstance();
        Object[] args = {};
        groovyObject.invokeMethod("run", args);
    }
}
