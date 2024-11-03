/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.RunStepDetailsToolCallsFunctionObjectFunction

class RunStepDetailsToolCallsFunctionObjectFunctionTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RunStepDetailsToolCallsFunctionObjectFunction
        //val modelInstance = RunStepDetailsToolCallsFunctionObjectFunction()

        // to test the property `name` - The name of the function.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `arguments` - The arguments passed to the function.
        should("test arguments") {
            // uncomment below to test the property
            //modelInstance.arguments shouldBe ("TODO")
        }

        // to test the property `output` - The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
        should("test output") {
            // uncomment below to test the property
            //modelInstance.output shouldBe ("TODO")
        }

    }
}
