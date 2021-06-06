package by.andervyd._1_procedural.memory.class_loader;

/* -XX:+TraceClassLoading */

public class ExClassLoader {
    public static void main(String[] args) {

        ClassLoader classLoaderOne = ExClassLoader.class.getClassLoader();
        ClassLoader classLoaderTwo = new Object().getClass().getClassLoader();

        System.out.println(classLoaderOne);
        // >> jdk.internal.loader.ClassLoaders$AppClassLoader@3d4eac69

        System.out.println(classLoaderTwo);
        // >> null
    }
}
