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
 * 
 * @param name The name of the function to call.
 */
object ChatCompletionNamedToolChoiceFunctions : BaseTable<ChatCompletionNamedToolChoiceFunction>("ChatCompletionNamedToolChoice_function") {
    val name = text("name") /* The name of the function to call. */

    /**
     * Create an entity of type ChatCompletionNamedToolChoiceFunction from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionNamedToolChoiceFunction(
        name = row[name] ?: "" /* kotlin.String */ /* The name of the function to call. */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionNamedToolChoiceFunction to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionNamedToolChoiceFunction()
    * database.update(ChatCompletionNamedToolChoiceFunctions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionNamedToolChoiceFunction) {
        this.apply {
            set(ChatCompletionNamedToolChoiceFunctions.name, entity.name)
        }
    }

}

