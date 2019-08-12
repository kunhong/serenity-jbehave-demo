package com.serenity.demo.junit;

import com.google.common.collect.Lists;
import com.serenity.demo.steps.PlayerDataDrivenSteps;
import com.serenity.demo.steps.SampleDataDrivenSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import net.thucydides.core.model.TestTag;
import net.thucydides.core.steps.StepEventBus;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class LicensePlayerTestScenario {
    @Steps
    private SampleDataDrivenSteps steps;

    @Steps
    private PlayerDataDrivenSteps playerDataDrivenSteps;



    @Test
    @WithTags({
            @WithTag("feature:license"),
            @WithTag("season:NHD")
    })
    public void player_should_be_in_item() throws Throwable {
        withTestDataFrom("data/testdata.csv").run(playerDataDrivenSteps).a_player_can_be_searched_in_item();
    }

    @Test
    @WithTags({
            @WithTag("feature:license"),
            @WithTag("season:TT")
    })
    public void sample_data_driven_test() throws Throwable {
        withTestDataFrom("data/simple-data.csv").run(steps).data_driven_test_step();
    }

    @Test
    public void sample_data_driven_test2() throws Throwable {
        List<TestTag> myTags = Lists.newArrayList(TestTag.withName("18TOTY").andType("season"),TestTag.withName("license").andType("feature"));
        StepEventBus.getEventBus().addTagsToCurrentTest(myTags);
        withTestDataFrom("data/simple-data.csv").run(steps).data_driven_test_step();
    }

}
