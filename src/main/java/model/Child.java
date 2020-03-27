package model;

import org.springframework.stereotype.Component;

@Component
//@Qualifier(value = "model.Child")
public class Child {


    private Middle middle;

    public Child(Middle middle) {
        this.middle = middle;
    }


    public void setMiddle(Middle middle) {
        this.middle = middle;
    }

    public Middle getMiddle() {
        return middle;
    }

}
