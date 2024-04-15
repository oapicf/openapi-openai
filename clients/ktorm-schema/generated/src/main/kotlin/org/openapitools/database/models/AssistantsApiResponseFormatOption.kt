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
 * Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 * @param type Must be one of `text` or `json_object`.
 */
object AssistantsApiResponseFormatOptions : BaseTable<AssistantsApiResponseFormatOption>("AssistantsApiResponseFormatOption") {
    val type = text("type").transform({ AssistantsApiResponseFormatOption.Type.valueOf(it ?: "text") }, { it.value }) /* null */ /* Must be one of `text` or `json_object`. */


    /**
     * Create an entity of type AssistantsApiResponseFormatOption from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AssistantsApiResponseFormatOption(
        type = row[type] ?: Type.text /* kotlin.String? */ /* Must be one of `text` or `json_object`. */
    )

    /**
    * Assign all the columns from the entity of type AssistantsApiResponseFormatOption to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AssistantsApiResponseFormatOption()
    * database.update(AssistantsApiResponseFormatOptions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AssistantsApiResponseFormatOption) {
        this.apply {
            set(AssistantsApiResponseFormatOptions.type, entity.type)
        }
    }

}

