package com.zadam.intjavahf.workmanintegraljavahf;

import com.zadam.intjavahf.workmanintegraljavahf.Project;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2013-12-05T13:51:43")
@StaticMetamodel(Task.class)
public class Task_ { 

    public static volatile SingularAttribute<Task, Integer> id;
    public static volatile SingularAttribute<Task, Project> project;
    public static volatile SingularAttribute<Task, String> description;
    public static volatile SingularAttribute<Task, String> name;

}