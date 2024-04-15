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
 * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
 * @param event 
 * @param data 
 */
object RunStepStreamEventOneOf4s : BaseTable<RunStepStreamEventOneOf4>("RunStepStreamEvent_oneOf_4") {
    val event = text("event").transform({ RunStepStreamEventOneOf4.Event.valueOf(it) }, { it.value })
    val data = long("data")

    /**
     * Create an entity of type RunStepStreamEventOneOf4 from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepStreamEventOneOf4(
        event = row[event] ?: RunStepStreamEventOneOf4.Event.valueOf("") /* kotlin.String */,
        data = RunStepObjects.createEntity(row, withReferences) /* RunStepObject */
    )

    /**
    * Assign all the columns from the entity of type RunStepStreamEventOneOf4 to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepStreamEventOneOf4()
    * database.update(RunStepStreamEventOneOf4s, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepStreamEventOneOf4) {
        this.apply {
            set(RunStepStreamEventOneOf4s.event, entity.event)
            set(RunStepStreamEventOneOf4s.data, entity.data)
        }
    }

}

