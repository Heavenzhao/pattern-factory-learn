package com.zhaowy.factorymethod;

import com.zhaowy.ICourse;
import com.zhaowy.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
