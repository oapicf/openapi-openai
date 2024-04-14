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

import org.openapitools.client.models.AssistantStreamEvent
import org.openapitools.client.models.DoneEvent
import org.openapitools.client.models.ErrorEvent
import org.openapitools.client.models.MessageStreamEvent
import org.openapitools.client.models.RunStepStreamEvent
import org.openapitools.client.models.RunStreamEvent
import org.openapitools.client.models.ThreadStreamEvent

class AssistantStreamEventTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AssistantStreamEvent
        //val modelInstance = AssistantStreamEvent()

        // to test the property `event`
        should("test event") {
            // uncomment below to test the property
            //modelInstance.event shouldBe ("TODO")
        }

        // to test the property ``data``
        should("test `data`") {
            // uncomment below to test the property
            //modelInstance.`data` shouldBe ("TODO")
        }

    }
}
