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

import org.openapitools.client.models.ChatCompletionStreamResponseDelta
import org.openapitools.client.models.ChatCompletionMessageToolCallChunk
import org.openapitools.client.models.ChatCompletionStreamResponseDeltaFunctionCall

class ChatCompletionStreamResponseDeltaTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatCompletionStreamResponseDelta
        //val modelInstance = ChatCompletionStreamResponseDelta()

        // to test the property `content` - The contents of the chunk message.
        should("test content") {
            // uncomment below to test the property
            //modelInstance.content shouldBe ("TODO")
        }

        // to test the property `functionCall`
        should("test functionCall") {
            // uncomment below to test the property
            //modelInstance.functionCall shouldBe ("TODO")
        }

        // to test the property `toolCalls`
        should("test toolCalls") {
            // uncomment below to test the property
            //modelInstance.toolCalls shouldBe ("TODO")
        }

        // to test the property `role` - The role of the author of this message.
        should("test role") {
            // uncomment below to test the property
            //modelInstance.role shouldBe ("TODO")
        }

    }
}
