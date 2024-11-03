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

import org.openapitools.client.models.MessageDeltaContentTextAnnotationsFileCitationObject
import org.openapitools.client.models.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

class MessageDeltaContentTextAnnotationsFileCitationObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MessageDeltaContentTextAnnotationsFileCitationObject
        //val modelInstance = MessageDeltaContentTextAnnotationsFileCitationObject()

        // to test the property `index` - The index of the annotation in the text content part.
        should("test index") {
            // uncomment below to test the property
            //modelInstance.index shouldBe ("TODO")
        }

        // to test the property `type` - Always `file_citation`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `text` - The text in the message content that needs to be replaced.
        should("test text") {
            // uncomment below to test the property
            //modelInstance.text shouldBe ("TODO")
        }

        // to test the property `fileCitation`
        should("test fileCitation") {
            // uncomment below to test the property
            //modelInstance.fileCitation shouldBe ("TODO")
        }

        // to test the property `startIndex`
        should("test startIndex") {
            // uncomment below to test the property
            //modelInstance.startIndex shouldBe ("TODO")
        }

        // to test the property `endIndex`
        should("test endIndex") {
            // uncomment below to test the property
            //modelInstance.endIndex shouldBe ("TODO")
        }

    }
}
