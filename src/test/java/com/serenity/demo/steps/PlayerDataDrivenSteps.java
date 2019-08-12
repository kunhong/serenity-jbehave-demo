package com.serenity.demo.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.junit.annotations.Qualifier;

public class PlayerDataDrivenSteps extends ScenarioSteps {
    private int spid;
    private String fullName;

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Qualifier
    public String qualifier() {
        return spid + " : " + fullName;
    }

    @Step
    public void a_player_can_be_searched_in_item() {

    }
}
