package io.syamb4u.utilityservices.cucumber.stepdefs;

import io.syamb4u.utilityservices.UtilityservicesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = UtilityservicesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
