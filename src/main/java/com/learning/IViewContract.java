package com.learning;

public interface IViewContract {
    /**
     * In this particular example I do not need to add the type, however,
     * I wanted to combine how I have handled it with Ryan's example.
     *
     * In his, this interface is top level and meant to be used across
     * multiple Logic classes.
     */
    interface Logic<T> {
        void onEvent(T event);
    }
}
