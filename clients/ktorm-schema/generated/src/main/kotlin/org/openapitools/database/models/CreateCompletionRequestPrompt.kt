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
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 */
object CreateCompletionRequestPrompts : BaseTable<CreateCompletionRequestPrompt>("CreateCompletionRequest_prompt") {

    /**
     * Create an entity of type CreateCompletionRequestPrompt from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateCompletionRequestPrompt(
    )

    /**
    * Assign all the columns from the entity of type CreateCompletionRequestPrompt to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateCompletionRequestPrompt()
    * database.update(CreateCompletionRequestPrompts, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateCompletionRequestPrompt) {
        this.apply {
        }
    }

}


