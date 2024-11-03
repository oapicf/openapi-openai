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
 * @param index The index of the content part in the message.
 * @param type Always `image_file`.
 * @param imageFile 
 * @param text 
 */
object MessageDeltaObjectDeltaContentInners : BaseTable<MessageDeltaObjectDeltaContentInner>("MessageDeltaObject_delta_content_inner") {
    val index = int("index") /* The index of the content part in the message. */
    val type = text("type").transform({ MessageDeltaObjectDeltaContentInner.Type.valueOf(it) }, { it.value }) /* Always `image_file`. */
    val imageFile = long("image_file") /* null */
    val text = long("text") /* null */

    /**
     * Create an entity of type MessageDeltaObjectDeltaContentInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageDeltaObjectDeltaContentInner(
        index = row[index] ?: 0 /* kotlin.Int */ /* The index of the content part in the message. */,
        type = row[type] ?: MessageDeltaObjectDeltaContentInner.Type.valueOf("") /* kotlin.String */ /* Always `image_file`. */,
        imageFile = MessageDeltaContentImageFileObjectImageFiles.createEntity(row, withReferences) /* MessageDeltaContentImageFileObjectImageFile? */,
        text = MessageDeltaContentTextObjectTexts.createEntity(row, withReferences) /* MessageDeltaContentTextObjectText? */
    )

    /**
    * Assign all the columns from the entity of type MessageDeltaObjectDeltaContentInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageDeltaObjectDeltaContentInner()
    * database.update(MessageDeltaObjectDeltaContentInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageDeltaObjectDeltaContentInner) {
        this.apply {
            set(MessageDeltaObjectDeltaContentInners.index, entity.index)
            set(MessageDeltaObjectDeltaContentInners.type, entity.type)
            set(MessageDeltaObjectDeltaContentInners.imageFile, entity.imageFile)
            set(MessageDeltaObjectDeltaContentInners.text, entity.text)
        }
    }

}


