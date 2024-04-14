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
 */
object ListModelsResponses : BaseTable<ListModelsResponse>("ListModelsResponse") {
    val object = text("object").transform({ ListModelsResponse.Object.valueOf(it) }, { it.value })

    /**
     * Create an entity of type ListModelsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ListModelsResponse(
        object = row[object] ?: ListModelsResponse.Object.valueOf("") /* kotlin.String */,
        data = emptyList() /* kotlin.Array<Model> */
    )

    /**
    * Assign all the columns from the entity of type ListModelsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ListModelsResponse()
    * database.update(ListModelsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ListModelsResponse) {
        this.apply {
            set(ListModelsResponses.object, entity.object)
        }
    }

}


object ListModelsResponseModel : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ListModelsResponseModel") {
    val listModelsResponse = long("listModelsResponse")
    val model = long("model")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[listModelsResponse] ?: 0, row[model] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ListModelsResponseModel.listModelsResponse, entity.first)
            set(ListModelsResponseModel.model, entity.second)
        }
    }

}

