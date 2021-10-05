package dev.px.event.Function;

/**
 * @author PX
 * @since 2021-10-04
 */

@FunctionalInterface
public interface Hook<T> {
    void invoke(T event);
}
