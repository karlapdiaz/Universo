package mx.uv.universo.events;

import de.greenrobot.event.EventBus;

public class BusProvider {
    private static final EventBus BUS = new EventBus();

    public static EventBus getInstance() {
        return BUS;
    }

    private BusProvider() {}
}
