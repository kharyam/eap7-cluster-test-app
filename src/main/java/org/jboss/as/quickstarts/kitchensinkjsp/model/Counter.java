package org.jboss.as.quickstarts.kitchensinkjsp.model;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@SessionScoped
public class Counter {
    private int count;

    @Produces
    @Named
    public int getCount() {
        increment();
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private void increment() {
        count++;
    }

}
