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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
 * @param event 
 * @param data 
 */
object RunStreamEventOneOf6s : BaseTable<RunStreamEventOneOf6>("RunStreamEvent_oneOf_6") {
    val event = text("event").transform({ RunStreamEventOneOf6.Event.valueOf(it) }, { it.value })
    val data = long("data")

    /**
     * Create an entity of type RunStreamEventOneOf6 from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStreamEventOneOf6(
        event = row[event] ?: RunStreamEventOneOf6.Event.valueOf("") /* kotlin.String */,
        data = RunObjects.createEntity(row, withReferences) /* RunObject */
    )

    /**
    * Assign all the columns from the entity of type RunStreamEventOneOf6 to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStreamEventOneOf6()
    * database.update(RunStreamEventOneOf6s, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStreamEventOneOf6) {
        this.apply {
            set(RunStreamEventOneOf6s.event, entity.event)
            set(RunStreamEventOneOf6s.data, entity.data)
        }
    }

}


