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

import org.openapitools.client.models.ChatCompletionResponseMessage
import org.openapitools.client.models.ChatCompletionMessageToolCall
import org.openapitools.client.models.ChatCompletionRequestAssistantMessageFunctionCall

class ChatCompletionResponseMessageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatCompletionResponseMessage
        //val modelInstance = ChatCompletionResponseMessage()

        // to test the property `content` - The contents of the message.
        should("test content") {
            // uncomment below to test the property
            //modelInstance.content shouldBe ("TODO")
        }

        // to test the property `role` - The role of the author of this message.
        should("test role") {
            // uncomment below to test the property
            //modelInstance.role shouldBe ("TODO")
        }

        // to test the property `toolCalls` - The tool calls generated by the model, such as function calls.
        should("test toolCalls") {
            // uncomment below to test the property
            //modelInstance.toolCalls shouldBe ("TODO")
        }

        // to test the property `functionCall`
        should("test functionCall") {
            // uncomment below to test the property
            //modelInstance.functionCall shouldBe ("TODO")
        }

    }
}
