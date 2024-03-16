/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
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
 * @param text 
 * @param index 
 * @param logprobs 
 * @param finishReason 
 */
object CreateEditResponseChoicesInners : BaseTable<CreateEditResponseChoicesInner>("CreateEditResponse_choices_inner") {
    val text = text("text") /* null */
    val index = int("index") /* null */
    val logprobs = long("logprobs") /* null */
    val finishReason = text("finish_reason").transform({ CreateEditResponseChoicesInner.FinishReason.valueOf(it ?: "stop") }, { it.value }) /* null */


    /**
     * Create an entity of type CreateEditResponseChoicesInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateEditResponseChoicesInner(
        text = row[text]  /* kotlin.String? */,
        index = row[index]  /* kotlin.Int? */,
        logprobs = CreateCompletionResponseChoicesInnerLogprobss.createEntity(row, withReferences) /* CreateCompletionResponseChoicesInnerLogprobs? */,
        finishReason = row[finishReason]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type CreateEditResponseChoicesInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateEditResponseChoicesInner()
    * database.update(CreateEditResponseChoicesInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateEditResponseChoicesInner) {
        this.apply {
            set(CreateEditResponseChoicesInners.text, entity.text)
            set(CreateEditResponseChoicesInners.index, entity.index)
            set(CreateEditResponseChoicesInners.logprobs, entity.logprobs)
            set(CreateEditResponseChoicesInners.finishReason, entity.finishReason)
        }
    }

}


