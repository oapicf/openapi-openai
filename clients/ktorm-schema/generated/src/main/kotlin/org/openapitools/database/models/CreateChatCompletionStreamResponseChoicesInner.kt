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
 * @param delta 
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
 * @param index The index of the choice in the list of choices.
 * @param logprobs 
 */
object CreateChatCompletionStreamResponseChoicesInners : BaseTable<CreateChatCompletionStreamResponseChoicesInner>("CreateChatCompletionStreamResponse_choices_inner") {
    val delta = long("delta")
    val finishReason = text("finish_reason").transform({ CreateChatCompletionStreamResponseChoicesInner.FinishReason.valueOf(it) }, { it.value }) /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */
    val index = int("index") /* The index of the choice in the list of choices. */
    val logprobs = long("logprobs") /* null */

    /**
     * Create an entity of type CreateChatCompletionStreamResponseChoicesInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateChatCompletionStreamResponseChoicesInner(
        delta = ChatCompletionStreamResponseDeltas.createEntity(row, withReferences) /* ChatCompletionStreamResponseDelta */,
        finishReason = row[finishReason] ?: CreateChatCompletionStreamResponseChoicesInner.FinishReason.valueOf("") /* kotlin.String */ /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */,
        index = row[index] ?: 0 /* kotlin.Int */ /* The index of the choice in the list of choices. */,
        logprobs = CreateChatCompletionResponseChoicesInnerLogprobss.createEntity(row, withReferences) /* CreateChatCompletionResponseChoicesInnerLogprobs? */
    )

    /**
    * Assign all the columns from the entity of type CreateChatCompletionStreamResponseChoicesInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateChatCompletionStreamResponseChoicesInner()
    * database.update(CreateChatCompletionStreamResponseChoicesInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateChatCompletionStreamResponseChoicesInner) {
        this.apply {
            set(CreateChatCompletionStreamResponseChoicesInners.delta, entity.delta)
            set(CreateChatCompletionStreamResponseChoicesInners.finishReason, entity.finishReason)
            set(CreateChatCompletionStreamResponseChoicesInners.index, entity.index)
            set(CreateChatCompletionStreamResponseChoicesInners.logprobs, entity.logprobs)
        }
    }

}


