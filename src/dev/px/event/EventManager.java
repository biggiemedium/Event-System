package dev.px.event;

import dev.px.event.Function.Auditor;
import dev.px.event.Function.ParamHandler;
import dev.px.event.Listeners.Interfaces.Bus;
import dev.px.event.Listeners.Subscribe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @author PX
 * @since 2021-10-04
 */

public class EventManager implements Bus {

    private List<Auditor> auditors;

    public EventManager() {
        this.auditors = new ArrayList<>();
    }

    @Override
    public void register(Object object) {
        getTargets(object);
    }

    @Override
    public void unregister(Object object) {

    }

    @Override
    public void getTargets(Object object) {

    }

    @Override
    public boolean postEvent(Event event) {
        return false;
    }
}
