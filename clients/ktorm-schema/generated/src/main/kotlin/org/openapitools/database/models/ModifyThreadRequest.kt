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
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
object ModifyThreadRequests : BaseTable<ModifyThreadRequest>("ModifyThreadRequest") {
    val metadata = blob("metadata") /* null */ /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */

    /**
     * Create an entity of type ModifyThreadRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ModifyThreadRequest(
        metadata = row[metadata]  /* kotlin.Any? */ /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    )

    /**
    * Assign all the columns from the entity of type ModifyThreadRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ModifyThreadRequest()
    * database.update(ModifyThreadRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ModifyThreadRequest) {
        this.apply {
            set(ModifyThreadRequests.metadata, entity.metadata)
        }
    }

}


