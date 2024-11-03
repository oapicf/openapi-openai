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
 * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
 * @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
 * @param name The name of the function to call.
 */
@Deprecated(message = "This schema is deprecated.")
object ChatCompletionRequestAssistantMessageFunctionCalls : BaseTable<ChatCompletionRequestAssistantMessageFunctionCall>("ChatCompletionRequestAssistantMessage_function_call") {
    val arguments = text("arguments") /* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. */
    val name = text("name") /* The name of the function to call. */

    /**
     * Create an entity of type ChatCompletionRequestAssistantMessageFunctionCall from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionRequestAssistantMessageFunctionCall(
        arguments = row[arguments] ?: "" /* kotlin.String */ /* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. */,
        name = row[name] ?: "" /* kotlin.String */ /* The name of the function to call. */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionRequestAssistantMessageFunctionCall to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionRequestAssistantMessageFunctionCall()
    * database.update(ChatCompletionRequestAssistantMessageFunctionCalls, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionRequestAssistantMessageFunctionCall) {
        this.apply {
            set(ChatCompletionRequestAssistantMessageFunctionCalls.arguments, entity.arguments)
            set(ChatCompletionRequestAssistantMessageFunctionCalls.name, entity.name)
        }
    }

}


