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
object ListMessageFilesResponses : BaseTable<ListMessageFilesResponse>("ListMessageFilesResponse") {
    val object = text("object")
    val firstId = text("first_id")
    val lastId = text("last_id")
    val hasMore = boolean("has_more")

    /**
     * Create an entity of type ListMessageFilesResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ListMessageFilesResponse(
        object = row[object] ?: "" /* kotlin.String */,
        data = emptyList() /* kotlin.Array<MessageFileObject> */,
        firstId = row[firstId] ?: "" /* kotlin.String */,
        lastId = row[lastId] ?: "" /* kotlin.String */,
        hasMore = row[hasMore] ?: false /* kotlin.Boolean */
    )

    /**
    * Assign all the columns from the entity of type ListMessageFilesResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ListMessageFilesResponse()
    * database.update(ListMessageFilesResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ListMessageFilesResponse) {
        this.apply {
            set(ListMessageFilesResponses.object, entity.object)
            set(ListMessageFilesResponses.firstId, entity.firstId)
            set(ListMessageFilesResponses.lastId, entity.lastId)
            set(ListMessageFilesResponses.hasMore, entity.hasMore)
        }
    }

}


object ListMessageFilesResponseMessageFileObject : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ListMessageFilesResponseMessageFileObject") {
    val listMessageFilesResponse = long("listMessageFilesResponse")
    val messageFileObject = long("messageFileObject")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[listMessageFilesResponse] ?: 0, row[messageFileObject] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ListMessageFilesResponseMessageFileObject.listMessageFilesResponse, entity.first)
            set(ListMessageFilesResponseMessageFileObject.messageFileObject, entity.second)
        }
    }

}
