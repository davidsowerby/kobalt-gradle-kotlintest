package com.example

import io.kotlintest.matchers.numerics.shouldBeEven
import io.kotlintest.matchers.numerics.shouldBeOdd
import io.kotlintest.specs.BehaviorSpec

/**
 * Created by David Sowerby on 15 Oct 2018
 */
class KotlinTest : BehaviorSpec() {
    init {
        Given("We want to try a pass") {
            When("We test something that is correct") {
                Then("it should pass") {
                    42.shouldBeEven()
                }
            }
        }

        Given("we want to try a fail") {
            When("We test something which is incorrect") {
                Then("it should fail") {
                    42.shouldBeOdd()
                }
            }
        }
    }
}