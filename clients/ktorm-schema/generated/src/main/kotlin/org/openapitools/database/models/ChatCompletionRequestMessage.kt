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
 * @param content The contents of the function message.
 * @param role The role of the messages author, in this case `function`.
 * @param name The name of the function to call.
 * @param toolCallId Tool call that this message is responding to.
 * @param toolCalls The tool calls generated by the model, such as function calls.
 * @param functionCall 
 */
object ChatCompletionRequestMessages : BaseTable<ChatCompletionRequestMessage>("ChatCompletionRequestMessage") {
    val content = text("content") /* The contents of the function message. */
    val role = text("role").transform({ ChatCompletionRequestMessage.Role.valueOf(it) }, { it.value }) /* The role of the messages author, in this case `function`. */
    val name = text("name") /* The name of the function to call. */
    val toolCallId = text("tool_call_id") /* Tool call that this message is responding to. */
    @Deprecated(message = "This property is deprecated.")
    val functionCall = long("function_call") /* null */

    /**
     * Create an entity of type ChatCompletionRequestMessage from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionRequestMessage(
        content = row[content] ?: "" /* kotlin.String */ /* The contents of the function message. */,
        role = row[role] ?: ChatCompletionRequestMessage.Role.valueOf("") /* kotlin.String */ /* The role of the messages author, in this case `function`. */,
        name = row[name] ?: "" /* kotlin.String */ /* The name of the function to call. */,
        toolCallId = row[toolCallId] ?: "" /* kotlin.String */ /* Tool call that this message is responding to. */,
        toolCalls = emptyList() /* kotlin.Array<ChatCompletionMessageToolCall>? */ /* The tool calls generated by the model, such as function calls. */,
        functionCall = ChatCompletionRequestAssistantMessageFunctionCalls.createEntity(row, withReferences) /* ChatCompletionRequestAssistantMessageFunctionCall? */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionRequestMessage to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionRequestMessage()
    * database.update(ChatCompletionRequestMessages, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionRequestMessage) {
        this.apply {
            set(ChatCompletionRequestMessages.content, entity.content)
            set(ChatCompletionRequestMessages.role, entity.role)
            set(ChatCompletionRequestMessages.name, entity.name)
            set(ChatCompletionRequestMessages.toolCallId, entity.toolCallId)
            set(ChatCompletionRequestMessages.functionCall, entity.functionCall)
        }
    }

}


object ChatCompletionRequestMessageChatCompletionMessageToolCall : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ChatCompletionRequestMessageChatCompletionMessageToolCall") {
    val chatCompletionRequestMessage = long("chatCompletionRequestMessage")
    val chatCompletionMessageToolCall = long("chatCompletionMessageToolCall")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[chatCompletionRequestMessage] ?: 0, row[chatCompletionMessageToolCall] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ChatCompletionRequestMessageChatCompletionMessageToolCall.chatCompletionRequestMessage, entity.first)
            set(ChatCompletionRequestMessageChatCompletionMessageToolCall.chatCompletionMessageToolCall, entity.second)
        }
    }

}

