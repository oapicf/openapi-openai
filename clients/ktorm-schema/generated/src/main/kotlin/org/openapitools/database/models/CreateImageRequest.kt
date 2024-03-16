/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
 * @param n The number of images to generate. Must be between 1 and 10.
 * @param propertySize The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
object CreateImageRequests : BaseTable<CreateImageRequest>("CreateImageRequest") {
    val prompt = text("prompt") /* A text description of the desired image(s). The maximum length is 1000 characters. */
    val n = int("n") /* null */ /* The number of images to generate. Must be between 1 and 10. */
    val propertySize = text("size").transform({ CreateImageRequest.PropertySize.valueOf(it ?: "256x256") }, { it.value }) /* null */ /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. */

    val responseFormat = text("response_format").transform({ CreateImageRequest.ResponseFormat.valueOf(it ?: "url") }, { it.value }) /* null */ /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. */

    val user = text("user") /* null */ /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */

    /**
     * Create an entity of type CreateImageRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateImageRequest(
        prompt = row[prompt] ?: "" /* kotlin.String */ /* A text description of the desired image(s). The maximum length is 1000 characters. */,
        n = row[n] ?: 1 /* kotlin.Int? */ /* The number of images to generate. Must be between 1 and 10. */,
        propertySize = row[propertySize] ?: PropertySize._1024x1024 /* kotlin.String? */ /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. */,
        responseFormat = row[responseFormat] ?: ResponseFormat.url /* kotlin.String? */ /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. */,
        user = row[user]  /* kotlin.String? */ /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    )

    /**
    * Assign all the columns from the entity of type CreateImageRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateImageRequest()
    * database.update(CreateImageRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateImageRequest) {
        this.apply {
            set(CreateImageRequests.prompt, entity.prompt)
            set(CreateImageRequests.n, entity.n)
            set(CreateImageRequests.propertySize, entity.propertySize)
            set(CreateImageRequests.responseFormat, entity.responseFormat)
            set(CreateImageRequests.user, entity.user)
        }
    }

}

