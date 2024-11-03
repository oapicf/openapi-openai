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
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param id The ID of the tool call object.
 * @param codeInterpreter 
 * @param retrieval For now, this is always going to be an empty object.
 * @param function 
 */
object RunStepDeltaStepDetailsToolCallsObjectToolCallsInners : BaseTable<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>("RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner") {
    val index = int("index") /* The index of the tool call in the tool calls array. */
    val type = text("type").transform({ RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.Type.valueOf(it) }, { it.value }) /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    val id = text("id") /* null */ /* The ID of the tool call object. */
    val codeInterpreter = long("code_interpreter") /* null */
    val retrieval = blob("retrieval") /* null */ /* For now, this is always going to be an empty object. */
    val function = long("function") /* null */

    /**
     * Create an entity of type RunStepDeltaStepDetailsToolCallsObjectToolCallsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(
        index = row[index] ?: 0 /* kotlin.Int */ /* The index of the tool call in the tool calls array. */,
        type = row[type] ?: RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.Type.valueOf("") /* kotlin.String */ /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */,
        id = row[id]  /* kotlin.String? */ /* The ID of the tool call object. */,
        codeInterpreter = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreters.createEntity(row, withReferences) /* RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? */,
        retrieval = row[retrieval]  /* kotlin.Any? */ /* For now, this is always going to be an empty object. */,
        function = RunStepDeltaStepDetailsToolCallsFunctionObjectFunctions.createEntity(row, withReferences) /* RunStepDeltaStepDetailsToolCallsFunctionObjectFunction? */
    )

    /**
    * Assign all the columns from the entity of type RunStepDeltaStepDetailsToolCallsObjectToolCallsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner()
    * database.update(RunStepDeltaStepDetailsToolCallsObjectToolCallsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) {
        this.apply {
            set(RunStepDeltaStepDetailsToolCallsObjectToolCallsInners.index, entity.index)
            set(RunStepDeltaStepDetailsToolCallsObjectToolCallsInners.type, entity.type)
            set(RunStepDeltaStepDetailsToolCallsObjectToolCallsInners.id, entity.id)
            set(RunStepDeltaStepDetailsToolCallsObjectToolCallsInners.codeInterpreter, entity.codeInterpreter)
            set(RunStepDeltaStepDetailsToolCallsObjectToolCallsInners.retrieval, entity.retrieval)
            set(RunStepDeltaStepDetailsToolCallsObjectToolCallsInners.function, entity.function)
        }
    }

}


