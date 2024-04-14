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

import org.openapitools.client.models.ChatCompletionRequestMessage
import org.openapitools.client.models.ChatCompletionRequestMessageFunctionCall

class ChatCompletionRequestMessageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatCompletionRequestMessage
        //val modelInstance = ChatCompletionRequestMessage()

        // to test the property `role` - The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
        should("test role") {
            // uncomment below to test the property
            //modelInstance.role shouldBe ("TODO")
        }

        // to test the property `content` - The contents of the message. `content` is required for all messages except assistant messages with function calls.
        should("test content") {
            // uncomment below to test the property
            //modelInstance.content shouldBe ("TODO")
        }

        // to test the property `name` - The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `functionCall`
        should("test functionCall") {
            // uncomment below to test the property
            //modelInstance.functionCall shouldBe ("TODO")
        }

    }
}