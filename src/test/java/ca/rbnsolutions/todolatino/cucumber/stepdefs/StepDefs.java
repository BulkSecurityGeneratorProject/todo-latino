package ca.rbnsolutions.todolatino.cucumber.stepdefs;

import ca.rbnsolutions.todolatino.TodolatinoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TodolatinoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
