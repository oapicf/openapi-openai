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
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image 
 */
object RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners : BaseTable<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>("RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner") {
    val type = text("type").transform({ RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type.valueOf(it) }, { it.value }) /* Always `logs`. */
    val logs = text("logs") /* The text output from the Code Interpreter tool call. */
    val image = long("image")

    /**
     * Create an entity of type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
        type = row[type] ?: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type.valueOf("") /* kotlin.String */ /* Always `logs`. */,
        logs = row[logs] ?: "" /* kotlin.String */ /* The text output from the Code Interpreter tool call. */,
        image = RunStepDetailsToolCallsCodeOutputImageObjectImages.createEntity(row, withReferences) /* RunStepDetailsToolCallsCodeOutputImageObjectImage */
    )

    /**
    * Assign all the columns from the entity of type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner()
    * database.update(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) {
        this.apply {
            set(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners.type, entity.type)
            set(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners.logs, entity.logs)
            set(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInners.image, entity.image)
        }
    }

}


