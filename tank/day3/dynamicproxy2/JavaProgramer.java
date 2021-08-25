package day3.dynamicproxy2;

/**
 * @author: bing
 * data  : 2021-08-23 11:41:46
 * day   : 周一
 * city  : shanghai
 * desc  : 被代理类
*/
public class JavaProgramer implements Programer{
    private String name;
    public JavaProgramer(String name){
        this.name=name;
    }

    @Override
    public void code() {
        System.out.println(name+" is coding");
    }

    @Override
    public void debug() {
        System.out.println(name+" is debuging");
    }
}
