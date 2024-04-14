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
 * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 * @param type Must be one of `text` or `json_object`.
 */
object AssistantsApiResponseFormats : BaseTable<AssistantsApiResponseFormat>("AssistantsApiResponseFormat") {
    val type = text("type").transform({ AssistantsApiResponseFormat.Type.valueOf(it ?: "text") }, { it.value }) /* null */ /* Must be one of `text` or `json_object`. */


    /**
     * Create an entity of type AssistantsApiResponseFormat from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AssistantsApiResponseFormat(
        type = row[type] ?: Type.text /* kotlin.String? */ /* Must be one of `text` or `json_object`. */
    )

    /**
    * Assign all the columns from the entity of type AssistantsApiResponseFormat to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AssistantsApiResponseFormat()
    * database.update(AssistantsApiResponseFormats, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AssistantsApiResponseFormat) {
        this.apply {
            set(AssistantsApiResponseFormats.type, entity.type)
        }
    }

}


