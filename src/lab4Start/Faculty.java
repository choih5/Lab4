package lab4Start;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.security.util.Length;

/**
 * Created by nuoup on 2017-02-15.
 */
public class Faculty extends Employee {
    String[] courses;
    Faculty(String name, int salary,String courses[]){
        super(name,salary);
        if(courses!=null) {
            this.courses = new String[courses.length];
            for (int i=0; i<courses.length;i++){
                this.courses[i]=courses[i];
            }
        }
    }
    public String[] getCourses(){
        String[] copyCourses = new String[courses.length];
        for (int i=0; i<courses.length; i++){
            copyCourses[i]=courses[i];
        }
        return copyCourses;
    }
    public void setCourses(String[] inputcourses){
        if(inputcourses!=null) {
            courses= new String[inputcourses.length];
            String[] copyArray = new String[inputcourses.length];
            for (int i = 0; i < inputcourses.length; i++){
                this.courses[i] = inputcourses[i];
                copyArray[i]=inputcourses[i];
            }
        }
    }

    public String toString(){
        String facultyinfo = "Faculty's name is " + getName() + " and salary is " + getSalary() + " and course is ";
        for(int i = 0; i< getCourses().length; i++){
            facultyinfo = facultyinfo + getCourses()[i] + " ";

        }
        return facultyinfo;
    }

}