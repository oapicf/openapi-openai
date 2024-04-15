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
 * Represents a chat completion response returned by model, based on the provided input.
 * @param id A unique identifier for the chat completion.
 * @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
 * @param created The Unix timestamp (in seconds) of when the chat completion was created.
 * @param model The model used for the chat completion.
 * @param object The object type, which is always `chat.completion`.
 * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param usage 
 */
object CreateChatCompletionResponses : BaseTable<CreateChatCompletionResponse>("CreateChatCompletionResponse") {
    val id = text("id") /* A unique identifier for the chat completion. */
    val created = int("created") /* The Unix timestamp (in seconds) of when the chat completion was created. */
    val model = text("model") /* The model used for the chat completion. */
    val object = text("object").transform({ CreateChatCompletionResponse.Object.valueOf(it) }, { it.value }) /* The object type, which is always `chat.completion`. */
    val systemFingerprint = text("system_fingerprint") /* null */ /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    val usage = long("usage") /* null */

    /**
     * Create an entity of type CreateChatCompletionResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateChatCompletionResponse(
        id = row[id] ?: "" /* kotlin.String */ /* A unique identifier for the chat completion. */,
        choices = emptyList() /* kotlin.Array<CreateChatCompletionResponseChoicesInner> */ /* A list of chat completion choices. Can be more than one if `n` is greater than 1. */,
        created = row[created] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) of when the chat completion was created. */,
        model = row[model] ?: "" /* kotlin.String */ /* The model used for the chat completion. */,
        object = row[object] ?: CreateChatCompletionResponse.Object.valueOf("") /* kotlin.String */ /* The object type, which is always `chat.completion`. */,
        systemFingerprint = row[systemFingerprint]  /* kotlin.String? */ /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */,
        usage = CompletionUsages.createEntity(row, withReferences) /* CompletionUsage? */
    )

    /**
    * Assign all the columns from the entity of type CreateChatCompletionResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateChatCompletionResponse()
    * database.update(CreateChatCompletionResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateChatCompletionResponse) {
        this.apply {
            set(CreateChatCompletionResponses.id, entity.id)
            set(CreateChatCompletionResponses.created, entity.created)
            set(CreateChatCompletionResponses.model, entity.model)
            set(CreateChatCompletionResponses.object, entity.object)
            set(CreateChatCompletionResponses.systemFingerprint, entity.systemFingerprint)
            set(CreateChatCompletionResponses.usage, entity.usage)
        }
    }

}


object CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner") {
    val createChatCompletionResponse = long("createChatCompletionResponse")
    val createChatCompletionResponseChoicesInner = long("createChatCompletionResponseChoicesInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[createChatCompletionResponse] ?: 0, row[createChatCompletionResponseChoicesInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner.createChatCompletionResponse, entity.first)
            set(CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner.createChatCompletionResponseChoicesInner, entity.second)
        }
    }

}
