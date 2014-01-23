/**
 * The MIT License
 * Copyright (C) 2013-2013 Slawomir Borowiec
 */

package pl.java.przodownik.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Sławomir Borowiec
 *         Module name : refactor_mch
 *         Creating time : 22 gru 2013 23:49:01
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR })
@Deprecated
public @interface RefactoringAlert {
    String cause() default "demand refactoring!!!";

    pl.java.przodownik.annotation.Priority[] priority() default pl.java.przodownik.annotation.Priority.LOW;

    pl.java.przodownik.annotation.Mechanics[] mechanics() default pl.java.przodownik.annotation.Mechanics.MANUAL;

}
