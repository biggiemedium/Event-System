package dev.px.event.Function;

import dev.px.event.Listeners.Interfaces.Clazz;
import dev.px.event.Listeners.Priority;

import java.lang.reflect.Method;
import java.util.function.Predicate;

public class ParamHandler<T> extends Auditor<T> implements Clazz<T> {

    private Class<T> clazz;

    private Method method;
    private Object object;
    private Priority priority;


    public ParamHandler(Class<T> clazz, Object obj, Predicate<T>... predicates) {
        this.clazz = clazz;
    }

    public ParamHandler(Class<T> clazz, Object obj, Priority priority, Predicate<T>... predicates) {
        this.clazz = clazz;
    }

    public ParamHandler(Method method, Object obj, Class<T> clazz, Priority priority) {
        this.method = method;
        this.object = obj;
        this.clazz = clazz;
        this.priority = priority;
    }

    public ParamHandler(Method method, Object obj, Class<T> clazz) {
        this.method = method;
        this.object = obj;
        this.clazz = clazz;
    }

    @Override
    public <T1> Class getTarget() {
        return this.clazz;
    }
}
