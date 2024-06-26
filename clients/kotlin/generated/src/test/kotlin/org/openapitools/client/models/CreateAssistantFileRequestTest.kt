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

import org.openapitools.client.models.CreateAssistantFileRequest

class CreateAssistantFileRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateAssistantFileRequest
        //val modelInstance = CreateAssistantFileRequest()

        // to test the property `fileId` - A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
        should("test fileId") {
            // uncomment below to test the property
            //modelInstance.fileId shouldBe ("TODO")
        }

    }
}
