package com.zhaowy.factorymethod;

import com.zhaowy.ICourse;
import com.zhaowy.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
