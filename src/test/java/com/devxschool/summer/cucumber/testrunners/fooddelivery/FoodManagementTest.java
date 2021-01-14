package com.devxschool.summer.cucumber.testrunners.fooddelivery;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/food-delivery/Food.feature"
        },
        glue = {
                "com.devxschool.cucumber.steps.foodmanagement"
        },
        tags = {
                "@addNewFoodEntry"
        },
        dryRun = true
)
public class FoodManagementTest { }