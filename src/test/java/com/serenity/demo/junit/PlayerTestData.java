package com.serenity.demo.junit;

import com.serenity.demo.steps.PlayerSteps;
import lombok.Data;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
public class PlayerTestData {

    private int spid;
    private String fullName;

    @Steps
    public PlayerSteps playerSteps;

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



}
