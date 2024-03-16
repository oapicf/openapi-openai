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
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for `text-embedding-ada-002`). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
 */
object CreateEmbeddingRequestInputs : BaseTable<CreateEmbeddingRequestInput>("CreateEmbeddingRequest_input") {

    /**
     * Create an entity of type CreateEmbeddingRequestInput from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateEmbeddingRequestInput(
    )

    /**
    * Assign all the columns from the entity of type CreateEmbeddingRequestInput to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateEmbeddingRequestInput()
    * database.update(CreateEmbeddingRequestInputs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateEmbeddingRequestInput) {
        this.apply {
        }
    }

}

