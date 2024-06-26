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
 * @param type The type of the content part.
 * @param text The text content.
 * @param imageUrl 
 */
object ChatCompletionRequestMessageContentParts : BaseTable<ChatCompletionRequestMessageContentPart>("ChatCompletionRequestMessageContentPart") {
    val type = text("type").transform({ ChatCompletionRequestMessageContentPart.Type.valueOf(it) }, { it.value }) /* The type of the content part. */
    val text = text("text") /* The text content. */
    val imageUrl = long("image_url")

    /**
     * Create an entity of type ChatCompletionRequestMessageContentPart from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionRequestMessageContentPart(
        type = row[type] ?: ChatCompletionRequestMessageContentPart.Type.valueOf("") /* kotlin.String */ /* The type of the content part. */,
        text = row[text] ?: "" /* kotlin.String */ /* The text content. */,
        imageUrl = ChatCompletionRequestMessageContentPartImageImageUrls.createEntity(row, withReferences) /* ChatCompletionRequestMessageContentPartImageImageUrl */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionRequestMessageContentPart to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionRequestMessageContentPart()
    * database.update(ChatCompletionRequestMessageContentParts, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionRequestMessageContentPart) {
        this.apply {
            set(ChatCompletionRequestMessageContentParts.type, entity.type)
            set(ChatCompletionRequestMessageContentParts.text, entity.text)
            set(ChatCompletionRequestMessageContentParts.imageUrl, entity.imageUrl)
        }
    }

}


