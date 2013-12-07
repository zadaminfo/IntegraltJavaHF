package com.zadam.intjavahf.workmanintegraljavahf;

import com.zadam.intjavahf.workmanintegraljavahf.Task;
import com.zadam.intjavahf.workmanintegraljavahf.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2013-12-05T13:51:43")
@StaticMetamodel(MeasureEntry.class)
public class MeasureEntry_ { 

    public static volatile SingularAttribute<MeasureEntry, Integer> id;
    public static volatile SingularAttribute<MeasureEntry, String> creationDate;
    public static volatile SingularAttribute<MeasureEntry, Double> duration;
    public static volatile SingularAttribute<MeasureEntry, Task> task;
    public static volatile SingularAttribute<MeasureEntry, String> comment;
    public static volatile SingularAttribute<MeasureEntry, User> user;

}