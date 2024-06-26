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
 * @param id 
 * @param deleted 
 * @param object 
 */
object DeleteAssistantResponses : BaseTable<DeleteAssistantResponse>("DeleteAssistantResponse") {
    val id = text("id")
    val deleted = boolean("deleted")
    val object = text("object").transform({ DeleteAssistantResponse.Object.valueOf(it) }, { it.value })

    /**
     * Create an entity of type DeleteAssistantResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = DeleteAssistantResponse(
        id = row[id] ?: "" /* kotlin.String */,
        deleted = row[deleted] ?: false /* kotlin.Boolean */,
        object = row[object] ?: DeleteAssistantResponse.Object.valueOf("") /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type DeleteAssistantResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = DeleteAssistantResponse()
    * database.update(DeleteAssistantResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: DeleteAssistantResponse) {
        this.apply {
            set(DeleteAssistantResponses.id, entity.id)
            set(DeleteAssistantResponses.deleted, entity.deleted)
            set(DeleteAssistantResponses.object, entity.object)
        }
    }

}


