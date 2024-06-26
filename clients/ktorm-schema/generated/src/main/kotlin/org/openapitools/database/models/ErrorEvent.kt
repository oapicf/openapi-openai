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
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 * @param event 
 * @param data 
 */
object ErrorEvents : BaseTable<ErrorEvent>("ErrorEvent") {
    val event = text("event").transform({ ErrorEvent.Event.valueOf(it) }, { it.value })
    val data = long("data")

    /**
     * Create an entity of type ErrorEvent from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ErrorEvent(
        event = row[event] ?: ErrorEvent.Event.valueOf("") /* kotlin.String */,
        data = Errors.createEntity(row, withReferences) /* Error */
    )

    /**
    * Assign all the columns from the entity of type ErrorEvent to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ErrorEvent()
    * database.update(ErrorEvents, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ErrorEvent) {
        this.apply {
            set(ErrorEvents.event, entity.event)
            set(ErrorEvents.data, entity.data)
        }
    }

}


