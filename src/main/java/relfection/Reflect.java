package relfection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version Reflect.java, v 0.1 2021年09月13日 11:50 上午
 */
public class Reflect {
    private String ClassName;

    public static String[] getMethodName(String className){
        return  (String[]) getMethodNameList(className).toArray();
    }

    public static List<String> getMethodNameList(String className){
        Class clazz;
        List<String> methodNameList = new ArrayList<>();
        try {
            clazz = Class.forName(className);
            Method[] methods = clazz.getMethods();
            for (Method method : methods){
                methodNameList.add(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return methodNameList;
    }
    /**
     * Getter method for property <tt>ClassName</tt>.
     *
     * @return property value of ClassName
     */
    public String getClassName() {
        return ClassName;
    }

    /**
     * Setter method for property <tt>ClassName</tt>.
     *
     * @param ClassName value to be assigned to property ClassName
     */
    public void setClassName(String className) {
        ClassName = className;
    }
}