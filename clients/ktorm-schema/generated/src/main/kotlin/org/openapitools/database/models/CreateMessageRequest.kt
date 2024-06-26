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
 * @param role The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
 * @param content The content of the message.
 * @param fileIds A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
object CreateMessageRequests : BaseTable<CreateMessageRequest>("CreateMessageRequest") {
    val role = text("role").transform({ CreateMessageRequest.Role.valueOf(it) }, { it.value }) /* The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  */
    val content = text("content") /* The content of the message. */
    val metadata = blob("metadata") /* null */ /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */

    /**
     * Create an entity of type CreateMessageRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateMessageRequest(
        role = row[role] ?: CreateMessageRequest.Role.valueOf("") /* kotlin.String */ /* The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  */,
        content = row[content] ?: "" /* kotlin.String */ /* The content of the message. */,
        fileIds = emptyList() /* kotlin.Array<kotlin.String>? */ /* A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files. */,
        metadata = row[metadata]  /* kotlin.Any? */ /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    )

    /**
    * Assign all the columns from the entity of type CreateMessageRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateMessageRequest()
    * database.update(CreateMessageRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateMessageRequest) {
        this.apply {
            set(CreateMessageRequests.role, entity.role)
            set(CreateMessageRequests.content, entity.content)
            set(CreateMessageRequests.metadata, entity.metadata)
        }
    }

}


object CreateMessageRequestFileIds : BaseTable<Pair<kotlin.Long, kotlin.String>>("CreateMessageRequestFileIds") {
    val createMessageRequest = long("createMessageRequest")
    val fileIds = text("fileIds")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[createMessageRequest] ?: 0, row[fileIds] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(CreateMessageRequestFileIds.createMessageRequest, entity.first)
            set(CreateMessageRequestFileIds.fileIds, entity.second)
        }
    }

}

