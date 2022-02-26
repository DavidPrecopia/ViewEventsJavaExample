package com.learning;

/**
 * {@link LogicViewEvents#getEvent()} returns once of it's {@link com.learning.LogicViewEvents.Event}
 * {@link LogicViewEvents#getData()} return what that particular Event contains, if anything at all.
 *
 * The largest flaw with this over Kotlin's Sealed Classes is lack of type safety.
 * It is possible to invoke {@link #getData()} when nothing has been assigned to it.
 * Moreover, you have to cast the Object to the expected type...
 */
public class LogicViewEvents {

    private final Event event;
    private final Object data;

    public LogicViewEvents(Event event, Object data) {
        this.event = event;
        this.data = data;
    }

    public Event getEvent() {
        return event;
    }

    public Object getData() {
        return data;
    }


    public enum Event {
        INIT,
        BURGER_SELECTED,
        DONE_CLICKED
    }
}

