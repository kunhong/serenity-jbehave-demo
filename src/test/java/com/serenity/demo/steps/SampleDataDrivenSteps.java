package com.serenity.demo.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SampleDataDrivenSteps extends ScenarioSteps {
    public String name;
    public String age;
    public String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Step
    public void data_driven_test_step() {

    }
}
