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
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */
object CreateEmbeddingRequestModels : BaseTable<CreateEmbeddingRequestModel>("CreateEmbeddingRequest_model") {

    /**
     * Create an entity of type CreateEmbeddingRequestModel from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateEmbeddingRequestModel(
    )

    /**
    * Assign all the columns from the entity of type CreateEmbeddingRequestModel to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateEmbeddingRequestModel()
    * database.update(CreateEmbeddingRequestModels, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateEmbeddingRequestModel) {
        this.apply {
        }
    }

}

