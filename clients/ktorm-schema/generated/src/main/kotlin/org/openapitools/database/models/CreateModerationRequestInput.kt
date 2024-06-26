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
 * The input text to classify
 */
object CreateModerationRequestInputs : BaseTable<CreateModerationRequestInput>("CreateModerationRequest_input") {

    /**
     * Create an entity of type CreateModerationRequestInput from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateModerationRequestInput(
    )

    /**
    * Assign all the columns from the entity of type CreateModerationRequestInput to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateModerationRequestInput()
    * database.update(CreateModerationRequestInputs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateModerationRequestInput) {
        this.apply {
        }
    }

}


