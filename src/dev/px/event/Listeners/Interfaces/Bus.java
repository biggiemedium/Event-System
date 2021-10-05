package dev.px.event.Listeners.Interfaces;

import dev.px.event.Event;
import dev.px.event.Function.Listener;

public interface Bus {

    void register(Object object);

    void unregister(Object object);

    void getTargets(Object object);

    boolean postEvent(Event event);

}
