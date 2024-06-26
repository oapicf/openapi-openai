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
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @param type Always `image_file`.
 * @param imageFile 
 */
object MessageContentImageFileObjects : BaseTable<MessageContentImageFileObject>("MessageContentImageFileObject") {
    val type = text("type").transform({ MessageContentImageFileObject.Type.valueOf(it) }, { it.value }) /* Always `image_file`. */
    val imageFile = long("image_file")

    /**
     * Create an entity of type MessageContentImageFileObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageContentImageFileObject(
        type = row[type] ?: MessageContentImageFileObject.Type.valueOf("") /* kotlin.String */ /* Always `image_file`. */,
        imageFile = MessageContentImageFileObjectImageFiles.createEntity(row, withReferences) /* MessageContentImageFileObjectImageFile */
    )

    /**
    * Assign all the columns from the entity of type MessageContentImageFileObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageContentImageFileObject()
    * database.update(MessageContentImageFileObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageContentImageFileObject) {
        this.apply {
            set(MessageContentImageFileObjects.type, entity.type)
            set(MessageContentImageFileObjects.imageFile, entity.imageFile)
        }
    }

}


