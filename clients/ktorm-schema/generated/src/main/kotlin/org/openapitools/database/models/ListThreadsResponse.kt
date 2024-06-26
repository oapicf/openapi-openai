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
object ListThreadsResponses : BaseTable<ListThreadsResponse>("ListThreadsResponse") {
    val object = text("object")
    val firstId = text("first_id")
    val lastId = text("last_id")
    val hasMore = boolean("has_more")

    /**
     * Create an entity of type ListThreadsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ListThreadsResponse(
        object = row[object] ?: "" /* kotlin.String */,
        data = emptyList() /* kotlin.Array<ThreadObject> */,
        firstId = row[firstId] ?: "" /* kotlin.String */,
        lastId = row[lastId] ?: "" /* kotlin.String */,
        hasMore = row[hasMore] ?: false /* kotlin.Boolean */
    )

    /**
    * Assign all the columns from the entity of type ListThreadsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ListThreadsResponse()
    * database.update(ListThreadsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ListThreadsResponse) {
        this.apply {
            set(ListThreadsResponses.object, entity.object)
            set(ListThreadsResponses.firstId, entity.firstId)
            set(ListThreadsResponses.lastId, entity.lastId)
            set(ListThreadsResponses.hasMore, entity.hasMore)
        }
    }

}


object ListThreadsResponseThreadObject : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ListThreadsResponseThreadObject") {
    val listThreadsResponse = long("listThreadsResponse")
    val threadObject = long("threadObject")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[listThreadsResponse] ?: 0, row[threadObject] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ListThreadsResponseThreadObject.listThreadsResponse, entity.first)
            set(ListThreadsResponseThreadObject.threadObject, entity.second)
        }
    }

}

