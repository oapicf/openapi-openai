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

import org.openapitools.client.models.ChatCompletionRequestSystemMessage

class ChatCompletionRequestSystemMessageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatCompletionRequestSystemMessage
        //val modelInstance = ChatCompletionRequestSystemMessage()

        // to test the property `content` - The contents of the system message.
        should("test content") {
            // uncomment below to test the property
            //modelInstance.content shouldBe ("TODO")
        }

        // to test the property `role` - The role of the messages author, in this case `system`.
        should("test role") {
            // uncomment below to test the property
            //modelInstance.role shouldBe ("TODO")
        }

        // to test the property `name` - An optional name for the participant. Provides the model information to differentiate between participants of the same role.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

    }
}
