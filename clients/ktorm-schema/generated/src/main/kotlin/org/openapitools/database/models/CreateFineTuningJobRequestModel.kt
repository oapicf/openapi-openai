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
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
 */
object CreateFineTuningJobRequestModels : BaseTable<CreateFineTuningJobRequestModel>("CreateFineTuningJobRequest_model") {

    /**
     * Create an entity of type CreateFineTuningJobRequestModel from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateFineTuningJobRequestModel(
    )

    /**
    * Assign all the columns from the entity of type CreateFineTuningJobRequestModel to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateFineTuningJobRequestModel()
    * database.update(CreateFineTuningJobRequestModels, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateFineTuningJobRequestModel) {
        this.apply {
        }
    }

}


