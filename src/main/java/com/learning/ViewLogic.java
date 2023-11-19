package com.learning;

public class ViewLogic implements IViewContract.Logic<LogicViewEvents> {

    /**
     * {@link LogicViewEvents#getEvent()} returns once of it's {@link com.learning.LogicViewEvents.Event}
     * {@link LogicViewEvents#getData()} return what that particular Event contains, if anything at all.
     */
    @Override
    public void onEvent(LogicViewEvents event) {
        switch (event.getEvent()) {
            case INIT:
                // this will have to be cast since field type is Object.
                event.getData();
                break;
            case BURGER_SELECTED, DONE_CLICKED:
                break;
        }
    }
}
