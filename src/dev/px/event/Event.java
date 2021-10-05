package dev.px.event;

import dev.px.event.Listeners.Interfaces.IEvent;

/**
 *
 * @see IEvent
 *
 * @author PX
 * @since 2021-10-04
 */

public class Event implements IEvent {

    boolean cancel;

    /**
     * Cancels the event
     */

    @Override
    public void cancel() {
        this.cancel = true;
    }

    @Override
    public boolean isCancelled() {
        return this.cancel;
    }
}
