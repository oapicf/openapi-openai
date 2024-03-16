/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
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
 * @param object 
 * @param bytes 
 * @param createdAt 
 * @param filename 
 * @param purpose 
 * @param status 
 * @param statusDetails 
 */
object OpenAIFiles : BaseTable<OpenAIFile>("OpenAIFile") {
    val id = text("id")
    val object = text("object")
    val bytes = int("bytes")
    val createdAt = int("created_at")
    val filename = text("filename")
    val purpose = text("purpose")
    val status = text("status") /* null */
    val statusDetails = blob("status_details") /* null */

    /**
     * Create an entity of type OpenAIFile from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OpenAIFile(
        id = row[id] ?: "" /* kotlin.String */,
        object = row[object] ?: "" /* kotlin.String */,
        bytes = row[bytes] ?: 0 /* kotlin.Int */,
        createdAt = row[createdAt] ?: 0 /* kotlin.Int */,
        filename = row[filename] ?: "" /* kotlin.String */,
        purpose = row[purpose] ?: "" /* kotlin.String */,
        status = row[status]  /* kotlin.String? */,
        statusDetails = row[statusDetails]  /* kotlin.Any? */
    )

    /**
    * Assign all the columns from the entity of type OpenAIFile to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OpenAIFile()
    * database.update(OpenAIFiles, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OpenAIFile) {
        this.apply {
            set(OpenAIFiles.id, entity.id)
            set(OpenAIFiles.object, entity.object)
            set(OpenAIFiles.bytes, entity.bytes)
            set(OpenAIFiles.createdAt, entity.createdAt)
            set(OpenAIFiles.filename, entity.filename)
            set(OpenAIFiles.purpose, entity.purpose)
            set(OpenAIFiles.status, entity.status)
            set(OpenAIFiles.statusDetails, entity.statusDetails)
        }
    }

}


