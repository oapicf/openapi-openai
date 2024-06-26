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
 * @param type Always `image_file`.
 * @param imageFile 
 * @param text 
 */
object MessageObjectContentInners : BaseTable<MessageObjectContentInner>("MessageObject_content_inner") {
    val type = text("type").transform({ MessageObjectContentInner.Type.valueOf(it) }, { it.value }) /* Always `image_file`. */
    val imageFile = long("image_file")
    val text = long("text")

    /**
     * Create an entity of type MessageObjectContentInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageObjectContentInner(
        type = row[type] ?: MessageObjectContentInner.Type.valueOf("") /* kotlin.String */ /* Always `image_file`. */,
        imageFile = MessageContentImageFileObjectImageFiles.createEntity(row, withReferences) /* MessageContentImageFileObjectImageFile */,
        text = MessageContentTextObjectTexts.createEntity(row, withReferences) /* MessageContentTextObjectText */
    )

    /**
    * Assign all the columns from the entity of type MessageObjectContentInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageObjectContentInner()
    * database.update(MessageObjectContentInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageObjectContentInner) {
        this.apply {
            set(MessageObjectContentInners.type, entity.type)
            set(MessageObjectContentInners.imageFile, entity.imageFile)
            set(MessageObjectContentInners.text, entity.text)
        }
    }

}


