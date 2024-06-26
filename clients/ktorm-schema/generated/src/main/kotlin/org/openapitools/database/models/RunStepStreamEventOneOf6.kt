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
 * Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
 * @param event 
 * @param data 
 */
object RunStepStreamEventOneOf6s : BaseTable<RunStepStreamEventOneOf6>("RunStepStreamEvent_oneOf_6") {
    val event = text("event").transform({ RunStepStreamEventOneOf6.Event.valueOf(it) }, { it.value })
    val data = long("data")

    /**
     * Create an entity of type RunStepStreamEventOneOf6 from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepStreamEventOneOf6(
        event = row[event] ?: RunStepStreamEventOneOf6.Event.valueOf("") /* kotlin.String */,
        data = RunStepObjects.createEntity(row, withReferences) /* RunStepObject */
    )

    /**
    * Assign all the columns from the entity of type RunStepStreamEventOneOf6 to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepStreamEventOneOf6()
    * database.update(RunStepStreamEventOneOf6s, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepStreamEventOneOf6) {
        this.apply {
            set(RunStepStreamEventOneOf6s.event, entity.event)
            set(RunStepStreamEventOneOf6s.data, entity.data)
        }
    }

}


