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

import org.openapitools.client.models.MessageFileObject

class MessageFileObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MessageFileObject
        //val modelInstance = MessageFileObject()

        // to test the property `id` - The identifier, which can be referenced in API endpoints.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always `thread.message.file`.
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds) for when the message file was created.
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `messageId` - The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
        should("test messageId") {
            // uncomment below to test the property
            //modelInstance.messageId shouldBe ("TODO")
        }

    }
}
