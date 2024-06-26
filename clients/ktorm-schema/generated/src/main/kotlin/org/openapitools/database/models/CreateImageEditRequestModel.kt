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
 * The model to use for image generation. Only `dall-e-2` is supported at this time.
 */
object CreateImageEditRequestModels : BaseTable<CreateImageEditRequestModel>("CreateImageEditRequest_model") {

    /**
     * Create an entity of type CreateImageEditRequestModel from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateImageEditRequestModel(
    )

    /**
    * Assign all the columns from the entity of type CreateImageEditRequestModel to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateImageEditRequestModel()
    * database.update(CreateImageEditRequestModels, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateImageEditRequestModel) {
        this.apply {
        }
    }

}


