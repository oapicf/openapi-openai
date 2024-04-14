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

import org.openapitools.client.models.CreateEmbeddingResponseUsage

class CreateEmbeddingResponseUsageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateEmbeddingResponseUsage
        //val modelInstance = CreateEmbeddingResponseUsage()

        // to test the property `promptTokens` - The number of tokens used by the prompt.
        should("test promptTokens") {
            // uncomment below to test the property
            //modelInstance.promptTokens shouldBe ("TODO")
        }

        // to test the property `totalTokens` - The total number of tokens used by the request.
        should("test totalTokens") {
            // uncomment below to test the property
            //modelInstance.totalTokens shouldBe ("TODO")
        }

    }
}
