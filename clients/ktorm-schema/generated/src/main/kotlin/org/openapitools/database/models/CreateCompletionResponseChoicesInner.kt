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
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
 * @param index 
 * @param logprobs 
 * @param text 
 */
object CreateCompletionResponseChoicesInners : BaseTable<CreateCompletionResponseChoicesInner>("CreateCompletionResponse_choices_inner") {
    val finishReason = text("finish_reason").transform({ CreateCompletionResponseChoicesInner.FinishReason.valueOf(it) }, { it.value }) /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters.  */
    val index = int("index")
    val logprobs = long("logprobs")
    val text = text("text")

    /**
     * Create an entity of type CreateCompletionResponseChoicesInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateCompletionResponseChoicesInner(
        finishReason = row[finishReason] ?: CreateCompletionResponseChoicesInner.FinishReason.valueOf("") /* kotlin.String */ /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters.  */,
        index = row[index] ?: 0 /* kotlin.Int */,
        logprobs = CreateCompletionResponseChoicesInnerLogprobss.createEntity(row, withReferences) /* CreateCompletionResponseChoicesInnerLogprobs */,
        text = row[text] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type CreateCompletionResponseChoicesInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateCompletionResponseChoicesInner()
    * database.update(CreateCompletionResponseChoicesInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateCompletionResponseChoicesInner) {
        this.apply {
            set(CreateCompletionResponseChoicesInners.finishReason, entity.finishReason)
            set(CreateCompletionResponseChoicesInners.index, entity.index)
            set(CreateCompletionResponseChoicesInners.logprobs, entity.logprobs)
            set(CreateCompletionResponseChoicesInners.text, entity.text)
        }
    }

}


