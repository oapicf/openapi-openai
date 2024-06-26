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

import org.openapitools.client.models.RunStepDetailsToolCallsRetrievalObject

class RunStepDetailsToolCallsRetrievalObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RunStepDetailsToolCallsRetrievalObject
        //val modelInstance = RunStepDetailsToolCallsRetrievalObject()

        // to test the property `id` - The ID of the tool call object.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `type` - The type of tool call. This is always going to be `retrieval` for this type of tool call.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `retrieval` - For now, this is always going to be an empty object.
        should("test retrieval") {
            // uncomment below to test the property
            //modelInstance.retrieval shouldBe ("TODO")
        }

    }
}
