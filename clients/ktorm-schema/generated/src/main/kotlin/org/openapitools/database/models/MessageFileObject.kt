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
 * A list of files attached to a `message`.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param object The object type, which is always `thread.message.file`.
 * @param createdAt The Unix timestamp (in seconds) for when the message file was created.
 * @param messageId The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
 */
object MessageFileObjects : BaseTable<MessageFileObject>("MessageFileObject") {
    val id = text("id") /* The identifier, which can be referenced in API endpoints. */
    val object = text("object").transform({ MessageFileObject.Object.valueOf(it) }, { it.value }) /* The object type, which is always `thread.message.file`. */
    val createdAt = int("created_at") /* The Unix timestamp (in seconds) for when the message file was created. */
    val messageId = text("message_id") /* The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. */

    /**
     * Create an entity of type MessageFileObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageFileObject(
        id = row[id] ?: "" /* kotlin.String */ /* The identifier, which can be referenced in API endpoints. */,
        object = row[object] ?: MessageFileObject.Object.valueOf("") /* kotlin.String */ /* The object type, which is always `thread.message.file`. */,
        createdAt = row[createdAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the message file was created. */,
        messageId = row[messageId] ?: "" /* kotlin.String */ /* The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. */
    )

    /**
    * Assign all the columns from the entity of type MessageFileObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageFileObject()
    * database.update(MessageFileObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageFileObject) {
        this.apply {
            set(MessageFileObjects.id, entity.id)
            set(MessageFileObjects.object, entity.object)
            set(MessageFileObjects.createdAt, entity.createdAt)
            set(MessageFileObjects.messageId, entity.messageId)
        }
    }

}


