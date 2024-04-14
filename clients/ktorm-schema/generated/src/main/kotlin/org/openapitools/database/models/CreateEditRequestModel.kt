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
 * ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.
 */
object CreateEditRequestModels : BaseTable<CreateEditRequestModel>("CreateEditRequest_model") {

    /**
     * Create an entity of type CreateEditRequestModel from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateEditRequestModel(
    )

    /**
    * Assign all the columns from the entity of type CreateEditRequestModel to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateEditRequestModel()
    * database.update(CreateEditRequestModels, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateEditRequestModel) {
        this.apply {
        }
    }

}

