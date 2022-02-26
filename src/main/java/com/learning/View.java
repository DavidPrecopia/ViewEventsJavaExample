package com.learning;

public class View implements IViewContract.View {

    private final IViewContract.Logic<LogicViewEvents> logic;

    public View(IViewContract.Logic<LogicViewEvents> logic) {
        this.logic = logic;
        init();
    }

    //including data
    private void init() {
        logic.onEvent(new LogicViewEvents(LogicViewEvents.Event.INIT, this));
    }

    //not including data
    public void doneBtn() {
        logic.onEvent(new LogicViewEvents(LogicViewEvents.Event.DONE_CLICKED, null));
    }
}
