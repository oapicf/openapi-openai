/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
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
 * @param url Either a URL of the image or the base64 encoded image data.
 * @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
 */
object ChatCompletionRequestMessageContentPartImageImageUrls : BaseTable<ChatCompletionRequestMessageContentPartImageImageUrl>("ChatCompletionRequestMessageContentPartImage_image_url") {
    val url = text("url") /* Either a URL of the image or the base64 encoded image data. */
    val detail = text("detail").transform({ ChatCompletionRequestMessageContentPartImageImageUrl.Detail.valueOf(it ?: "auto") }, { it.value }) /* null */ /* Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). */


    /**
     * Create an entity of type ChatCompletionRequestMessageContentPartImageImageUrl from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionRequestMessageContentPartImageImageUrl(
        url = row[url] ?: "" /* java.net.URI */ /* Either a URL of the image or the base64 encoded image data. */,
        detail = row[detail] ?: Detail.auto /* kotlin.String? */ /* Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionRequestMessageContentPartImageImageUrl to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionRequestMessageContentPartImageImageUrl()
    * database.update(ChatCompletionRequestMessageContentPartImageImageUrls, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionRequestMessageContentPartImageImageUrl) {
        this.apply {
            set(ChatCompletionRequestMessageContentPartImageImageUrls.url, entity.url)
            set(ChatCompletionRequestMessageContentPartImageImageUrls.detail, entity.detail)
        }
    }

}


