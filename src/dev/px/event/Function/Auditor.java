package dev.px.event.Function;

import dev.px.event.Listeners.Priority;

import java.lang.reflect.Method;
import java.util.function.Predicate;

/**
 * @author PX
 * @since 2021-10-04
 */

public class Auditor<T> implements Hook<T> {

    /**
     * target events
     */
    private Class<T> clazz;

    /**
     * Method priority
     */
    private Priority priority;
    private Hook<T> hook;
    private Predicate<T>[] predicateList;

    public Auditor(Hook<T> hook, Predicate<T>... predicates) {
        this.hook = hook;
        this.priority = Priority.NORMAL;
        this.predicateList = predicates;
    }

    @Override
    public void invoke(T event) {

    }
}
