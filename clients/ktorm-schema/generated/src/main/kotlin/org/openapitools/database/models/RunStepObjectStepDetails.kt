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
 * The details of the run step.
 * @param type Always `message_creation`.
 * @param messageCreation 
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 */
object RunStepObjectStepDetailss : BaseTable<RunStepObjectStepDetails>("RunStepObject_step_details") {
    val type = text("type").transform({ RunStepObjectStepDetails.Type.valueOf(it) }, { it.value }) /* Always `message_creation`. */
    val messageCreation = long("message_creation")

    /**
     * Create an entity of type RunStepObjectStepDetails from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepObjectStepDetails(
        type = row[type] ?: RunStepObjectStepDetails.Type.valueOf("") /* kotlin.String */ /* Always `message_creation`. */,
        messageCreation = RunStepDetailsMessageCreationObjectMessageCreations.createEntity(row, withReferences) /* RunStepDetailsMessageCreationObjectMessageCreation */,
        toolCalls = emptyList() /* kotlin.Array<RunStepDetailsToolCallsObjectToolCallsInner> */ /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  */
    )

    /**
    * Assign all the columns from the entity of type RunStepObjectStepDetails to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepObjectStepDetails()
    * database.update(RunStepObjectStepDetailss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepObjectStepDetails) {
        this.apply {
            set(RunStepObjectStepDetailss.type, entity.type)
            set(RunStepObjectStepDetailss.messageCreation, entity.messageCreation)
        }
    }

}


object RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner") {
    val runStepObjectStepDetails = long("runStepObjectStepDetails")
    val runStepDetailsToolCallsObjectToolCallsInner = long("runStepDetailsToolCallsObjectToolCallsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[runStepObjectStepDetails] ?: 0, row[runStepDetailsToolCallsObjectToolCallsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner.runStepObjectStepDetails, entity.first)
            set(RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner.runStepDetailsToolCallsObjectToolCallsInner, entity.second)
        }
    }

}

