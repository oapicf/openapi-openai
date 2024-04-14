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
 * Text output from the Code Interpreter tool call as part of a run step.
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
object RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjects : BaseTable<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject>("RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject") {
    val index = int("index") /* The index of the output in the outputs array. */
    val type = text("type").transform({ RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.Type.valueOf(it) }, { it.value }) /* Always `logs`. */
    val logs = text("logs") /* null */ /* The text output from the Code Interpreter tool call. */

    /**
     * Create an entity of type RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(
        index = row[index] ?: 0 /* kotlin.Int */ /* The index of the output in the outputs array. */,
        type = row[type] ?: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.Type.valueOf("") /* kotlin.String */ /* Always `logs`. */,
        logs = row[logs]  /* kotlin.String? */ /* The text output from the Code Interpreter tool call. */
    )

    /**
    * Assign all the columns from the entity of type RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
    * database.update(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) {
        this.apply {
            set(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjects.index, entity.index)
            set(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjects.type, entity.type)
            set(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjects.logs, entity.logs)
        }
    }

}


