package Model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("time")
@RequestScoped
public class Time {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Time user) {
        return this.getName().equalsIgnoreCase(user.getName());
    }
}
