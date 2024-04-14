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
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image 
 */
object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners : BaseTable<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner") {
    val index = int("index") /* The index of the output in the outputs array. */
    val type = text("type").transform({ RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type.valueOf(it) }, { it.value }) /* Always `logs`. */
    val logs = text("logs") /* null */ /* The text output from the Code Interpreter tool call. */
    val image = long("image") /* null */

    /**
     * Create an entity of type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
        index = row[index] ?: 0 /* kotlin.Int */ /* The index of the output in the outputs array. */,
        type = row[type] ?: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type.valueOf("") /* kotlin.String */ /* Always `logs`. */,
        logs = row[logs]  /* kotlin.String? */ /* The text output from the Code Interpreter tool call. */,
        image = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImages.createEntity(row, withReferences) /* RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? */
    )

    /**
    * Assign all the columns from the entity of type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner()
    * database.update(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) {
        this.apply {
            set(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners.index, entity.index)
            set(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners.type, entity.type)
            set(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners.logs, entity.logs)
            set(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners.image, entity.image)
        }
    }

}


