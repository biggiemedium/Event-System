package dev.px.event.Listeners.Interfaces;

/**
 * @author PX
 * @since 2021-10-04
 */

public interface IEvent {

    /**
     * Cancel method used to cancel the current state
     */

    void cancel();

    /**
     * @return cancel
     */

    boolean isCancelled();

}
