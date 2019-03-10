package com.zhaowy.simplefactory;

import com.zhaowy.ICourse;
import com.zhaowy.JavaCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }
}
