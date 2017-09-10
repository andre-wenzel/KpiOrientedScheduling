package de.wenzel.kos.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class CdiContext {
    public static final CdiContext INSTANCE = new CdiContext();

    private final Weld weld;
    private final WeldContainer container;

    private CdiContext() {
        this.weld = new Weld();
        this.container = weld.initialize();
    }

    public <T> T getBean(Class<T> type) {
        return container.select(type).get();
    }
}