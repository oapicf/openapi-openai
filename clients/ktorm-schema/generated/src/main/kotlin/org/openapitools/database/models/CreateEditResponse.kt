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
 * @param object 
 * @param created 
 * @param choices 
 * @param usage 
 */
object CreateEditResponses : BaseTable<CreateEditResponse>("CreateEditResponse") {
    val object = text("object")
    val created = int("created")
    val usage = long("usage")

    /**
     * Create an entity of type CreateEditResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateEditResponse(
        object = row[object] ?: "" /* kotlin.String */,
        created = row[created] ?: 0 /* kotlin.Int */,
        choices = emptyList() /* kotlin.Array<CreateEditResponseChoicesInner> */,
        usage = CreateCompletionResponseUsages.createEntity(row, withReferences) /* CreateCompletionResponseUsage */
    )

    /**
    * Assign all the columns from the entity of type CreateEditResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateEditResponse()
    * database.update(CreateEditResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateEditResponse) {
        this.apply {
            set(CreateEditResponses.object, entity.object)
            set(CreateEditResponses.created, entity.created)
            set(CreateEditResponses.usage, entity.usage)
        }
    }

}


object CreateEditResponseCreateEditResponseChoicesInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CreateEditResponseCreateEditResponseChoicesInner") {
    val createEditResponse = long("createEditResponse")
    val createEditResponseChoicesInner = long("createEditResponseChoicesInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[createEditResponse] ?: 0, row[createEditResponseChoicesInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CreateEditResponseCreateEditResponseChoicesInner.createEditResponse, entity.first)
            set(CreateEditResponseCreateEditResponseChoicesInner.createEditResponseChoicesInner, entity.second)
        }
    }

}
