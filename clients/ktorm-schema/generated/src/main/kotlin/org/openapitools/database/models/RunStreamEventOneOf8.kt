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
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 * @param event 
 * @param data 
 */
object RunStreamEventOneOf8s : BaseTable<RunStreamEventOneOf8>("RunStreamEvent_oneOf_8") {
    val event = text("event").transform({ RunStreamEventOneOf8.Event.valueOf(it) }, { it.value })
    val data = long("data")

    /**
     * Create an entity of type RunStreamEventOneOf8 from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStreamEventOneOf8(
        event = row[event] ?: RunStreamEventOneOf8.Event.valueOf("") /* kotlin.String */,
        data = RunObjects.createEntity(row, withReferences) /* RunObject */
    )

    /**
    * Assign all the columns from the entity of type RunStreamEventOneOf8 to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStreamEventOneOf8()
    * database.update(RunStreamEventOneOf8s, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStreamEventOneOf8) {
        this.apply {
            set(RunStreamEventOneOf8s.event, entity.event)
            set(RunStreamEventOneOf8s.data, entity.data)
        }
    }

}


