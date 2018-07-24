package com.serenity.demo.github;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.io.IOException;

public class GithubUserProfilePayloadStepDefinitions {
    @Steps
    private GithubRestAssuredUserAPISteps userAPISteps;

    @Steps
    private GithubRestUserAPISteps githubRestUserAPISteps;

    @Given("github user profile api")
    public void givenGithubUserProfileApi() {
        userAPISteps.withUserProfileAPIEndpoint();
        githubRestUserAPISteps.withUserProfileAPIEndpoint();
    }

    @When("looking for $user via the api")
    public void whenLookingForProfileOf(String user) throws IOException {
        userAPISteps.getProfileOfUser(user);
        githubRestUserAPISteps.getProfileOfUser(user);
    }

    @Then("github's response contains a 'login' payload same as $user")
    public void thenGithubsResponseContainsAloginPayloadSameAs(String user) {
        userAPISteps.profilePayloadShouldContainLoginValue(user);
        githubRestUserAPISteps.profilePayloadShouldContainLoginValue(user);
    }
}
