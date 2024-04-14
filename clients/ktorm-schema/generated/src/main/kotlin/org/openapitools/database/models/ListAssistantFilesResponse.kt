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
object ListAssistantFilesResponses : BaseTable<ListAssistantFilesResponse>("ListAssistantFilesResponse") {
    val object = text("object")
    val firstId = text("first_id")
    val lastId = text("last_id")
    val hasMore = boolean("has_more")

    /**
     * Create an entity of type ListAssistantFilesResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ListAssistantFilesResponse(
        object = row[object] ?: "" /* kotlin.String */,
        data = emptyList() /* kotlin.Array<AssistantFileObject> */,
        firstId = row[firstId] ?: "" /* kotlin.String */,
        lastId = row[lastId] ?: "" /* kotlin.String */,
        hasMore = row[hasMore] ?: false /* kotlin.Boolean */
    )

    /**
    * Assign all the columns from the entity of type ListAssistantFilesResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ListAssistantFilesResponse()
    * database.update(ListAssistantFilesResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ListAssistantFilesResponse) {
        this.apply {
            set(ListAssistantFilesResponses.object, entity.object)
            set(ListAssistantFilesResponses.firstId, entity.firstId)
            set(ListAssistantFilesResponses.lastId, entity.lastId)
            set(ListAssistantFilesResponses.hasMore, entity.hasMore)
        }
    }

}


object ListAssistantFilesResponseAssistantFileObject : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ListAssistantFilesResponseAssistantFileObject") {
    val listAssistantFilesResponse = long("listAssistantFilesResponse")
    val assistantFileObject = long("assistantFileObject")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[listAssistantFilesResponse] ?: 0, row[assistantFileObject] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ListAssistantFilesResponseAssistantFileObject.listAssistantFilesResponse, entity.first)
            set(ListAssistantFilesResponseAssistantFileObject.assistantFileObject, entity.second)
        }
    }

}

