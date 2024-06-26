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
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 */
object CreateCompletionRequestStops : BaseTable<CreateCompletionRequestStop>("CreateCompletionRequest_stop") {

    /**
     * Create an entity of type CreateCompletionRequestStop from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateCompletionRequestStop(
    )

    /**
    * Assign all the columns from the entity of type CreateCompletionRequestStop to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateCompletionRequestStop()
    * database.update(CreateCompletionRequestStops, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateCompletionRequestStop) {
        this.apply {
        }
    }

}


