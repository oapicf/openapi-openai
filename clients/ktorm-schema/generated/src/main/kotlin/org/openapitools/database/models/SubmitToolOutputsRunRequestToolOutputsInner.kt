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
 * @param toolCallId The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
 * @param output The output of the tool call to be submitted to continue the run.
 */
object SubmitToolOutputsRunRequestToolOutputsInners : BaseTable<SubmitToolOutputsRunRequestToolOutputsInner>("SubmitToolOutputsRunRequest_tool_outputs_inner") {
    val toolCallId = text("tool_call_id") /* null */ /* The ID of the tool call in the `required_action` object within the run object the output is being submitted for. */
    val output = text("output") /* null */ /* The output of the tool call to be submitted to continue the run. */

    /**
     * Create an entity of type SubmitToolOutputsRunRequestToolOutputsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = SubmitToolOutputsRunRequestToolOutputsInner(
        toolCallId = row[toolCallId]  /* kotlin.String? */ /* The ID of the tool call in the `required_action` object within the run object the output is being submitted for. */,
        output = row[output]  /* kotlin.String? */ /* The output of the tool call to be submitted to continue the run. */
    )

    /**
    * Assign all the columns from the entity of type SubmitToolOutputsRunRequestToolOutputsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = SubmitToolOutputsRunRequestToolOutputsInner()
    * database.update(SubmitToolOutputsRunRequestToolOutputsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: SubmitToolOutputsRunRequestToolOutputsInner) {
        this.apply {
            set(SubmitToolOutputsRunRequestToolOutputsInners.toolCallId, entity.toolCallId)
            set(SubmitToolOutputsRunRequestToolOutputsInners.output, entity.output)
        }
    }

}

