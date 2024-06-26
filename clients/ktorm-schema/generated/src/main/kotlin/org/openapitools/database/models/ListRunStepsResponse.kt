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
 * @param object 
 * @param data 
 * @param firstId 
 * @param lastId 
 * @param hasMore 
 */
object ListRunStepsResponses : BaseTable<ListRunStepsResponse>("ListRunStepsResponse") {
    val object = text("object")
    val firstId = text("first_id")
    val lastId = text("last_id")
    val hasMore = boolean("has_more")

    /**
     * Create an entity of type ListRunStepsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ListRunStepsResponse(
        object = row[object] ?: "" /* kotlin.String */,
        data = emptyList() /* kotlin.Array<RunStepObject> */,
        firstId = row[firstId] ?: "" /* kotlin.String */,
        lastId = row[lastId] ?: "" /* kotlin.String */,
        hasMore = row[hasMore] ?: false /* kotlin.Boolean */
    )

    /**
    * Assign all the columns from the entity of type ListRunStepsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ListRunStepsResponse()
    * database.update(ListRunStepsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ListRunStepsResponse) {
        this.apply {
            set(ListRunStepsResponses.object, entity.object)
            set(ListRunStepsResponses.firstId, entity.firstId)
            set(ListRunStepsResponses.lastId, entity.lastId)
            set(ListRunStepsResponses.hasMore, entity.hasMore)
        }
    }

}


object ListRunStepsResponseRunStepObject : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ListRunStepsResponseRunStepObject") {
    val listRunStepsResponse = long("listRunStepsResponse")
    val runStepObject = long("runStepObject")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[listRunStepsResponse] ?: 0, row[runStepObject] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ListRunStepsResponseRunStepObject.listRunStepsResponse, entity.first)
            set(ListRunStepsResponseRunStepObject.runStepObject, entity.second)
        }
    }

}

