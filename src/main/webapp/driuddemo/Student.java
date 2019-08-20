package main.webapp.driuddemo;

/**
 * 构建与数据库字段对应的类用于读取存储数据
 * 构建成  JavaBean形式
 */
public class Student {
    private  String name=null;
    private  Integer old=null;
    private  String number=null;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public String getnumber() {
        return number;
    }

    public void setnumber(String number) {
        this.number = number;
    }
}
