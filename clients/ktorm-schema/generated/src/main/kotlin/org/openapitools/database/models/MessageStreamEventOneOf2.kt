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
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 * @param event 
 * @param data 
 */
object MessageStreamEventOneOf2s : BaseTable<MessageStreamEventOneOf2>("MessageStreamEvent_oneOf_2") {
    val event = text("event").transform({ MessageStreamEventOneOf2.Event.valueOf(it) }, { it.value })
    val data = long("data")

    /**
     * Create an entity of type MessageStreamEventOneOf2 from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageStreamEventOneOf2(
        event = row[event] ?: MessageStreamEventOneOf2.Event.valueOf("") /* kotlin.String */,
        data = MessageDeltaObjects.createEntity(row, withReferences) /* MessageDeltaObject */
    )

    /**
    * Assign all the columns from the entity of type MessageStreamEventOneOf2 to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageStreamEventOneOf2()
    * database.update(MessageStreamEventOneOf2s, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageStreamEventOneOf2) {
        this.apply {
            set(MessageStreamEventOneOf2s.event, entity.event)
            set(MessageStreamEventOneOf2s.data, entity.data)
        }
    }

}


