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
 * Details of the Code Interpreter tool call the run step was involved in.
 * @param id The ID of the tool call.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeInterpreter 
 */
object RunStepDetailsToolCallsCodeObjects : BaseTable<RunStepDetailsToolCallsCodeObject>("RunStepDetailsToolCallsCodeObject") {
    val id = text("id") /* The ID of the tool call. */
    val type = text("type").transform({ RunStepDetailsToolCallsCodeObject.Type.valueOf(it) }, { it.value }) /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    val codeInterpreter = long("code_interpreter")

    /**
     * Create an entity of type RunStepDetailsToolCallsCodeObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepDetailsToolCallsCodeObject(
        id = row[id] ?: "" /* kotlin.String */ /* The ID of the tool call. */,
        type = row[type] ?: RunStepDetailsToolCallsCodeObject.Type.valueOf("") /* kotlin.String */ /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */,
        codeInterpreter = RunStepDetailsToolCallsCodeObjectCodeInterpreters.createEntity(row, withReferences) /* RunStepDetailsToolCallsCodeObjectCodeInterpreter */
    )

    /**
    * Assign all the columns from the entity of type RunStepDetailsToolCallsCodeObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepDetailsToolCallsCodeObject()
    * database.update(RunStepDetailsToolCallsCodeObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepDetailsToolCallsCodeObject) {
        this.apply {
            set(RunStepDetailsToolCallsCodeObjects.id, entity.id)
            set(RunStepDetailsToolCallsCodeObjects.type, entity.type)
            set(RunStepDetailsToolCallsCodeObjects.codeInterpreter, entity.codeInterpreter)
        }
    }

}

