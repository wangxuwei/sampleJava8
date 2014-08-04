package com.britesnow.j8.test;

import java.util.stream.Stream;

import org.junit.Test;

import com.britesnow.j8.Hint;
import com.britesnow.j8.Hints;
import com.britesnow.j8.Person;
import com.britesnow.j8.Person1;

/**
 * <p>
 * </p>
 */
public class AnnotationTest {

    @Test
    public void testAnnotation() {
        Hint[] hints = Person.class.getAnnotationsByType(Hint.class);
        System.out.println(hints);
        Stream.of(hints).forEach(System.out::println);
        
        Hints hints1 = Person1.class.getAnnotation(Hints.class);
        System.out.println(hints1.value());
        Stream.of(hints1.value()).forEach(System.out::println);
    }

}
