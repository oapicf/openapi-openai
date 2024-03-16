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

import org.openapitools.client.models.CreateCompletionResponseChoicesInner
import org.openapitools.client.models.CreateCompletionResponseChoicesInnerLogprobs

class CreateCompletionResponseChoicesInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateCompletionResponseChoicesInner
        //val modelInstance = CreateCompletionResponseChoicesInner()

        // to test the property `text`
        should("test text") {
            // uncomment below to test the property
            //modelInstance.text shouldBe ("TODO")
        }

        // to test the property `index`
        should("test index") {
            // uncomment below to test the property
            //modelInstance.index shouldBe ("TODO")
        }

        // to test the property `logprobs`
        should("test logprobs") {
            // uncomment below to test the property
            //modelInstance.logprobs shouldBe ("TODO")
        }

        // to test the property `finishReason`
        should("test finishReason") {
            // uncomment below to test the property
            //modelInstance.finishReason shouldBe ("TODO")
        }

    }
}
