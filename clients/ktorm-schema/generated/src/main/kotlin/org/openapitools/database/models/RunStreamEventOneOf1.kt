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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 * @param event 
 * @param data 
 */
object RunStreamEventOneOf1s : BaseTable<RunStreamEventOneOf1>("RunStreamEvent_oneOf_1") {
    val event = text("event").transform({ RunStreamEventOneOf1.Event.valueOf(it) }, { it.value })
    val data = long("data")

    /**
     * Create an entity of type RunStreamEventOneOf1 from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStreamEventOneOf1(
        event = row[event] ?: RunStreamEventOneOf1.Event.valueOf("") /* kotlin.String */,
        data = RunObjects.createEntity(row, withReferences) /* RunObject */
    )

    /**
    * Assign all the columns from the entity of type RunStreamEventOneOf1 to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStreamEventOneOf1()
    * database.update(RunStreamEventOneOf1s, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStreamEventOneOf1) {
        this.apply {
            set(RunStreamEventOneOf1s.event, entity.event)
            set(RunStreamEventOneOf1s.data, entity.data)
        }
    }

}

