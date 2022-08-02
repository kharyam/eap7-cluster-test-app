package org.jboss.as.quickstarts.kitchensinkjsp.model;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
@SessionScoped
public class Counter implements Serializable{
    private int count;

    private static final long serialVersionUID = -1;

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
