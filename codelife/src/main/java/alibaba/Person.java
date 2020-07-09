package alibaba;

import java.util.Date;

public class Person {

    private String name;
    private String school;
    private Date hireDay;

    public Date getHireDay(){
        return (Date) hireDay.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Person(String name, String school,Date hireDay) {
        super();
        this.name = name;
        this.school = school;
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", school=" + school + "],hireDay="+hireDay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static void main(String[] args) {
        Date yrHireDay = new Date();
        Person yr=new Person("yr","临朐六中",yrHireDay);
        System.out.println(yr.toString());
        Date testDate1=yr.getHireDay();
        testDate1.setTime(testDate1.getTime()+60000);
        System.out.println(yr.toString());
    }

}
