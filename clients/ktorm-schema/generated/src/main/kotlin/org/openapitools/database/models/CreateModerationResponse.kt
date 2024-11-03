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
 * Represents if a given text input is potentially harmful.
 * @param id The unique identifier for the moderation request.
 * @param model The model used to generate the moderation results.
 * @param results A list of moderation objects.
 */
object CreateModerationResponses : BaseTable<CreateModerationResponse>("CreateModerationResponse") {
    val id = text("id") /* The unique identifier for the moderation request. */
    val model = text("model") /* The model used to generate the moderation results. */

    /**
     * Create an entity of type CreateModerationResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateModerationResponse(
        id = row[id] ?: "" /* kotlin.String */ /* The unique identifier for the moderation request. */,
        model = row[model] ?: "" /* kotlin.String */ /* The model used to generate the moderation results. */,
        results = emptyList() /* kotlin.Array<CreateModerationResponseResultsInner> */ /* A list of moderation objects. */
    )

    /**
    * Assign all the columns from the entity of type CreateModerationResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateModerationResponse()
    * database.update(CreateModerationResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateModerationResponse) {
        this.apply {
            set(CreateModerationResponses.id, entity.id)
            set(CreateModerationResponses.model, entity.model)
        }
    }

}


object CreateModerationResponseCreateModerationResponseResultsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CreateModerationResponseCreateModerationResponseResultsInner") {
    val createModerationResponse = long("createModerationResponse")
    val createModerationResponseResultsInner = long("createModerationResponseResultsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[createModerationResponse] ?: 0, row[createModerationResponseResultsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CreateModerationResponseCreateModerationResponseResultsInner.createModerationResponse, entity.first)
            set(CreateModerationResponseCreateModerationResponseResultsInner.createModerationResponseResultsInner, entity.second)
        }
    }

}

