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

import org.openapitools.client.models.ChatCompletionRequestMessageContentPart
import org.openapitools.client.models.ChatCompletionRequestMessageContentPartImage
import org.openapitools.client.models.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.client.models.ChatCompletionRequestMessageContentPartText

class ChatCompletionRequestMessageContentPartTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatCompletionRequestMessageContentPart
        //val modelInstance = ChatCompletionRequestMessageContentPart()

        // to test the property `type` - The type of the content part.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `text` - The text content.
        should("test text") {
            // uncomment below to test the property
            //modelInstance.text shouldBe ("TODO")
        }

        // to test the property `imageUrl`
        should("test imageUrl") {
            // uncomment below to test the property
            //modelInstance.imageUrl shouldBe ("TODO")
        }

    }
}
